package assignment2;

class PushUpWorkoutFactory extends WorkoutFactory {
    public Workout createWorkout() {
        return new PushUpWorkout();
    }
}
