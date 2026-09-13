package Director;

import builder.WorkoutBuilder;
import model.Workoutplan;

    public class WorkoutDirector {

        public Workoutplan constructBeginnerCardio(WorkoutBuilder builder) {
            return builder.setTitle("Morning Cardio")
                    .setLevel("Beginner")
                    .setdurationMin(20)
                    .addExercise("Jumping Jacks", 3, 30)
                    .addExercise("High Knees", 3, 20)
                    .addExercise("Burpees", 2, 10)
                    .build();
        }

        public Workoutplan constructAdvancedStrength(WorkoutBuilder builder) {
            return builder.setTitle("Full Body Strength")
                    .setLevel("Advanced")
                    .setdurationMin(60)
                    .addExercise("Barbell Squat", 4, 8)
                    .addExercise("Bench Press", 4, 8)
                    .addExercise("Deadlift", 3, 5)
                    .build();
        }
    }

