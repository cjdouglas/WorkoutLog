package com.cjd.apps.workoutlog;

import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.cjd.apps.workoutlog.ui.AnalysisFragment;
import com.cjd.apps.workoutlog.ui.WorkoutFragment;

public class MainActivity extends AppCompatActivity {

  private static final String BOTTOM_NAV_SELECTED_ITEM = "BottomNavSelectedItem";

  private BottomNavigationView mBottomNavigationView;
  @IdRes private int mSelectedItem;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mBottomNavigationView = (BottomNavigationView) findViewById(R.id.workoutlog_bottom_nav_view);
    mBottomNavigationView.setOnNavigationItemSelectedListener(
        new BottomNavigationView.OnNavigationItemSelectedListener() {
      @Override
      public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        selectFragment(item);
        return true;
      }
    });

    // This fixes the issue where launching doesn't update the fragment or toolbar text
    MenuItem item;
    if (savedInstanceState != null) {
      mSelectedItem = savedInstanceState.getInt(BOTTOM_NAV_SELECTED_ITEM);
      item = mBottomNavigationView.getMenu().findItem(mSelectedItem);
    } else {
      item = mBottomNavigationView.getMenu().getItem(0);
    }
    selectFragment(item);
  }

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    outState.putInt(BOTTOM_NAV_SELECTED_ITEM, mSelectedItem);
    super.onSaveInstanceState(outState);
  }

  private void selectFragment(@NonNull MenuItem item) {
    Fragment fragment;
    String title;
    switch (item.getItemId()) {
      case R.id.workoutlog_bottom_nav_running:
        fragment = WorkoutFragment.create(WorkoutFragment.WORKOUT_TYPE_RUNNING);
        title = getResources().getString(R.string.workoutlog_bottom_nav_running_title);
        break;
      case R.id.workoutlog_bottom_nav_weights:
        fragment = WorkoutFragment.create(WorkoutFragment.WORKOUT_TYPE_WEIGHTS);
        title = getResources().getString(R.string.workoutlog_bottom_nav_weights_title);
        break;
      case R.id.workoutlog_bottom_nav_analysis:
        fragment = new AnalysisFragment();
        title = getResources().getString(R.string.workoutlog_bottom_nav_analysis_title);
        break;
      default:
        throw new UnsupportedOperationException();
    }
    mSelectedItem = item.getItemId();
    swapFragment(fragment);
    updateToolbarTitle(title);
  }

  private void swapFragment(Fragment fragment) {
    getSupportFragmentManager()
        .beginTransaction()
        .replace(R.id.fragment_container, fragment)
        .commit();
  }

  private void updateToolbarTitle(String title) {
    ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
      actionBar.setTitle(title);
    }
  }
}
