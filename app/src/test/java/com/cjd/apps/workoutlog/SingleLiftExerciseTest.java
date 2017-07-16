package com.cjd.apps.workoutlog;

import com.cjd.apps.workoutlog.data.SingleLiftExercise;

import org.junit.Assert;
import org.junit.Test;

/**
 * A test to test the SingleLiftExercise class and associated Builder.
 */
public class SingleLiftExerciseTest {

  @Test
  public void singleLiftExercise_builder_test() {
    String liftName = "Test Lift";
    int percentOfMax = 65;
    int numSets = 4;
    int numReps = 5;
    int RPE = 9;

    SingleLiftExercise exercise = new SingleLiftExercise.Builder()
        .setLiftName(liftName)
        .setPercentOfMax(percentOfMax)
        .setNumSets(numSets)
        .setNumReps(numReps)
        .setRPE(RPE)
        .build();

    Assert.assertEquals(exercise.getLiftName(), liftName);
    Assert.assertEquals(exercise.getPercentOfMax(), percentOfMax);
    Assert.assertEquals(exercise.getNumSets(), numSets);
    Assert.assertEquals(exercise.getNumReps(), numReps);
    Assert.assertEquals(exercise.getRPE(), RPE);
  }

  @Test
  public void singleLiftExercise_setter_test() {
    String liftName = "Test Lift";
    int percentOfMax = 65;
    int numSets = 4;
    int numReps = 5;
    int RPE = 9;

    String newLiftName = "New Test Lift";
    int newPercentOfMax = 75;
    int newNumSets = 5;
    int newNumReps = 3;
    int newRPE = 10;

    SingleLiftExercise exercise = new SingleLiftExercise.Builder()
        .setLiftName(liftName)
        .setPercentOfMax(percentOfMax)
        .setNumSets(numSets)
        .setNumReps(numReps)
        .setRPE(RPE)
        .build();

    Assert.assertEquals(exercise.getLiftName(), liftName);
    Assert.assertEquals(exercise.getPercentOfMax(), percentOfMax);
    Assert.assertEquals(exercise.getNumSets(), numSets);
    Assert.assertEquals(exercise.getNumReps(), numReps);
    Assert.assertEquals(exercise.getRPE(), RPE);

    exercise.setLiftName(newLiftName);
    exercise.setPercentOfMax(newPercentOfMax);
    exercise.setNumSets(newNumSets);
    exercise.setNumReps(newNumReps);
    exercise.setRPE(newRPE);

    Assert.assertEquals(exercise.getLiftName(), newLiftName);
    Assert.assertEquals(exercise.getPercentOfMax(), newPercentOfMax);
    Assert.assertEquals(exercise.getNumSets(), newNumSets);
    Assert.assertEquals(exercise.getNumReps(), newNumReps);
    Assert.assertEquals(exercise.getRPE(), newRPE);
  }
}
