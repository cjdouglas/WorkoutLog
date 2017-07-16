package com.cjd.apps.workoutlog;

import com.cjd.apps.workoutlog.util.WorkoutDate;

import org.junit.Assert;
import org.junit.Test;

/**
 * A test to test the WorkoutDate class.
 */
public class WorkoutDateTest {

  private final int year = 2015;
  private final int month = 5;
  private final int day = 28;
  private final String dateFormat = "5/28/2015";

  private final int newYear = 2017;
  private final int newMonth = 7;
  private final int newDay = 16;
  private final String newDateFormat = "7/16/2017";

  @Test
  public void workoutDate_getter_test() {
    WorkoutDate workoutDate = new WorkoutDate(year, month, day);

    Assert.assertEquals(year, workoutDate.getYear());
    Assert.assertEquals(month, workoutDate.getMonth());
    Assert.assertEquals(day, workoutDate.getDay());
  }

  @Test
  public void workoutDate_setter_test() {
    WorkoutDate workoutDate = new WorkoutDate(year, month, day);
    workoutDate.setYear(newYear);
    workoutDate.setMonth(newMonth);
    workoutDate.setDay(newDay);

    Assert.assertEquals(newYear, workoutDate.getYear());
    Assert.assertEquals(newMonth, workoutDate.getMonth());
    Assert.assertEquals(newDay, workoutDate.getDay());
  }

  @Test
  public void workoutDate_format_test() {
    WorkoutDate workoutDate = new WorkoutDate(year, month, day);
    WorkoutDate newWorkoutDate = new WorkoutDate(newYear, newMonth, newDay);

    Assert.assertEquals(dateFormat, workoutDate.getFormattedDate());
    Assert.assertEquals(newDateFormat, newWorkoutDate.getFormattedDate());
  }
}
