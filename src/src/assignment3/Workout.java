package assignment3;

public abstract class Workout {
    protected WorkoutPlatform platform;
    public Workout(WorkoutPlatform platform) {
        this.platform = platform;
    }
    public void setPlatform(WorkoutPlatform platform) {
        this.platform = platform;
    }
    public abstract void start();
}
