package assignment3;

public class StrengthWorkout extends Workout {
    public StrengthWorkout(WorkoutPlatform platform) {
        super(platform);
    }
    @Override
    public void start() {
        System.out.println("Starting Strength Session ");
        platform.executeExercise("Push-ups", 15);
    }
}
