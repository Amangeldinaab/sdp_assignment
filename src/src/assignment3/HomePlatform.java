package assignment3;

public class HomePlatform implements WorkoutPlatform{
    @Override
    public void executeExercise(String exerciseName, int durationOrReps) {
        System.out.println("[HOME] Performing "+ exerciseName + "using home gear for" + durationOrReps + " reps/mins.");
    }
}
