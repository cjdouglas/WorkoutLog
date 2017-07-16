package com.cjd.apps.workoutlog.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * A fragment to display workouts for either running or weights.
 */
public class WorkoutFragment extends Fragment {

  public static final String WORKOUT_TYPE_TAG = "WorkoutTypeTag";
  public static final String WORKOUT_TYPE_RUNNING = "Running";
  public static final String WORKOUT_TYPE_WEIGHTS = "Weights";

  public static WorkoutFragment create(String type) {
    WorkoutFragment fragment = new WorkoutFragment();
    Bundle args = new Bundle();
    args.putString(WORKOUT_TYPE_TAG, type);
    fragment.setArguments(args);
    return fragment;
  }

}
