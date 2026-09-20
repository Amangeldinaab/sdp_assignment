package assignment2;

public class PushUpWorkout implements Workout{
    @Override
    public void perform() {
        System.out.println("Doing 50 push-ups");
    }
    @Override
    public int getCaloriesBurned() {
        return 100;
    }
}
