package assignment2;

public interface Workout {
    void perform();
    int getCaloriesBurned();
}
class RunningWorkout implements Workout {
    public void perform() { System.out.println(" Running"); }
    public int getCaloriesBurned() { return 300; }
}

class PushUpWorkout implements Workout {
    public void perform() { System.out.println("Push-ups"); }
    public int getCaloriesBurned() { return 100; }
}
