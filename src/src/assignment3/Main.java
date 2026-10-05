package assignment3;

public class Main {
    public static void main(String[] args) {
        WorkoutPlatform gym = new GymPlatform();
        WorkoutPlatform home = new HomePlatform();


        Workout strength = new StrengthWorkout(gym);
        strength.start();

        strength.setPlatform(home);
        strength.start();

        Workout cardio = new CardioWorkout(home);
        cardio.start();
    }
}
