package com.cjd.apps.workoutlog.util;

/**
 * A simple utility class to represent a date based on year, month, and day.
 */
public class WorkoutDate {
  private int year;
  private int month;
  private int day;

  public WorkoutDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public int getMonth() {
    return month;
  }

  public int getDay() {
    return day;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public String getFormattedDate() {
    return new StringBuilder()
        .append(month)
        .append("/")
        .append(day)
        .append("/")
        .append(year)
        .toString();
  }
}
