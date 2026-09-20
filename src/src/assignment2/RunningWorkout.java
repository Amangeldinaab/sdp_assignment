package assignment2;

public class RunningWorkout implements Workout {
    @Override
    public void perform() {
        System.out.println("Running ontreadmill for 30 minutes");
    }

    @Override
    public int getCaloriesBurned() {
        return 300;
    }
}
