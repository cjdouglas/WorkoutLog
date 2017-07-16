package com.cjd.apps.workoutlog.data;

/**
 * An implementation of a SingleLift object, represents a single exercise in a weight workout
 */
public class SingleLiftExercise implements SingleLift {

  private String liftName;
  private int percentOfMax;
  private int numSets;
  private int numReps;
  private int RPE;

  private SingleLiftExercise(
      String liftName,
      int percentOfMax,
      int numSets,
      int numReps,
      int RPE) {
    this.liftName = liftName;
    this.percentOfMax = percentOfMax;
    this.numSets = numSets;
    this.numReps = numReps;
    this.RPE = RPE;
  }

  @Override
  public String getLiftName() {
    return liftName;
  }

  @Override
  public int getPercentOfMax() {
    return percentOfMax;
  }

  @Override
  public int getNumSets() {
    return numSets;
  }

  @Override
  public int getNumReps() {
    return numReps;
  }

  @Override
  public int getRPE() {
    return RPE;
  }

  @Override
  public void setLiftName(String liftName) {
    this.liftName = liftName;
  }

  @Override
  public void setPercentOfMax(int percentOfMax) {
    this.percentOfMax = percentOfMax;
  }

  @Override
  public void setNumSets(int numSets) {
    this.numSets = numSets;
  }

  @Override
  public void setNumReps(int numReps) {
    this.numReps = numReps;
  }

  @Override
  public void setRPE(int RPE) {
    this.RPE = RPE;
  }

  /** A builder class for creating a new {@link SingleLiftExercise} */
  public static class Builder {
    private String liftName;
    private int percentOfMax;
    private int numSets;
    private int numReps;
    private int RPE;

    public Builder() {}

    public Builder setLiftName(String liftName) {
      this.liftName = liftName;
      return this;
    }

    public Builder setPercentOfMax(int percentOfMax) {
      this.percentOfMax = percentOfMax;
      return this;
    }

    public Builder setNumSets(int numSets) {
      this.numSets = numSets;
      return this;
    }

    public Builder setNumReps(int numReps) {
      this.numReps = numReps;
      return this;
    }

    public Builder setRPE(int RPE) {
      this.RPE = RPE;
      return this;
    }

    public SingleLiftExercise build() {
      return new SingleLiftExercise(liftName, percentOfMax, numSets, numReps, RPE);
    }
  }
}
