package assignment2;

class RunningWorkout implements Workout {
    public void perform() {
        System.out.println(" Running");
    }

    public int getCaloriesBurned() {
        return 300;
    }
}
