package assignment1.builder;

import assignment1.builder.Director.WorkoutDirector;
import assignment1.builder.model.Workoutplan;

public class Main {
    public static void main(String[] args) {
        WorkoutDirector director = new WorkoutDirector();
        WorkoutBuilder cardioBuilder = new WorkoutBuilder();
        Workoutplan cardioPlan = director.constructBeginnerCardio(cardioBuilder);
        System.out.println(cardioPlan);

        Workoutplan customPlan = new WorkoutBuilder()
                .setTitle("Custom Express Workout")
                .setLevel("Intermediate")
                .setdurationMin(15)
                .addExercise("Push ups", 3, 15)
                .addExercise("Plank", 2, 60)
                .build();

        System.out.println(customPlan);
    }
}