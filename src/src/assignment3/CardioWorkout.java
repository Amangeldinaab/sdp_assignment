package assignment3;

import javax.smartcardio.Card;

public class CardioWorkout extends Workout {
    public CardioWorkout(WorkoutPlatform platform) {
        super(platform);
    }
    @Override
    public void start() {
        System.out.println(" Starting Cardio Session ");
        platform.executeExercise("Treadmill Running", 30);
    }
}
