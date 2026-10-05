package assignment2;

class PushUpWorkout implements Workout {
    public void perform() {
        System.out.println("Push-ups");
    }

    public int getCaloriesBurned() {
        return 100;
    }
}
