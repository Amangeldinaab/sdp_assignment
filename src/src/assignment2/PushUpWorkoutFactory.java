package assignment2;

public class PushUpWorkoutFactory extends WorkoutFactory{
    @Override
    public Workout createWorkout() {
        return new PushUpWorkout();
    }
}
