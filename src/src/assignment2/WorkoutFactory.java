package assignment2;

public abstract class WorkoutFactory {
    public abstract Workout createWorkout();

    public void logworkout() {
        Workout workout = createWorkout();
        workout.perform();
        System.out.println("Logged: "+ workout.getCaloriesBurned() + "kcal burned.");;
    }
}
