package assignment3;

public class GymPlatform implements WorkoutPlatform {
    @Override
    public void executeExercise(String exerciseName, int durationOrReps) {
        System.out.println(" [GYM] Performing " + exerciseName + " using equipment for " + durationOrReps +  "reps/mins.");

    }
}
