package com.cjd.apps.workoutlog.data;

/**
 * A model to represent a single weight exercise inside a full weight workout.
 */
interface SingleLift {
  String getLiftName();
  int getPercentOfMax();
  int getNumSets();
  int getNumReps();
  int getRPE();
  void setLiftName(String liftName);
  void setPercentOfMax(int percentOfMax);
  void setNumSets(int numSets);
  void setNumReps(int numReps);
  void setRPE(int RPE);
}
