package assignment2;


public class Main {
    public static void main(String[] args) {
        WorkoutFactory runningFactory = new RunningWorkoutFactory();
        runningFactory.logworkout();

        WorkoutFactory pushUpFactory = new PushUpWorkoutFactory();
        pushUpFactory.logworkout();
    }
}
