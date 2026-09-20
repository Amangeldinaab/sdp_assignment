package assignment1.builder;
import assignment1.builder.model.Exercise;
import assignment1.builder.model.Workoutplan;

import java.util.ArrayList;
import java.util.List;

public class WorkoutBuilder implements Builder {
    private String title;
    private String level = "Beginner";
    private int durationMin;
    private final List<Exercise> exercises = new ArrayList<> ();

    @Override
    public WorkoutBuilder setTitle(String title) {
        this.title = title;
        return this;
    }
    @Override
    public WorkoutBuilder setLevel(String level) {
        this.level = level;
        return this;
    }
    @Override
    public WorkoutBuilder setdurationMin( int durationMin) {
        this.durationMin = durationMin;
        return this;
    }
    @Override
    public WorkoutBuilder addExercise(String name, int sets, int reps) {
        this.exercises.add(new Exercise(name, sets, reps));
        return this;
    }

    @Override
    public Workoutplan build() {
        validatePlan();
        return new Workoutplan(title, level, durationMin, new ArrayList<>(exercises));
    }

    private void validatePlan() {
        if (title == null || title.isBlank()) {
            throw new IllegalStateException("Workout title cannot be empty.");
        }
        if (durationMin <= 0) {
            throw new IllegalArgumentException("Duration must be greater than 0 minutes.");
        }
        if (exercises.isEmpty()) {
            throw new IllegalStateException("Workout plan must contain at least one exercise.");
        }
    }

}
