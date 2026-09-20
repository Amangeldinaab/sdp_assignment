package assignment2;

public class RunningWorkoutFactory extends WorkoutFactory{
    @Override
    public Workout createWorkout() {
        return new RunningWorkout();
    }
}
