package assignment2;

class RunningWorkoutFactory extends WorkoutFactory {
    public Workout createWorkout() {
        return new RunningWorkout();
    }
}
