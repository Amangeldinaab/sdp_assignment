package assignment1.builder.model;

import java.util.List;

public class Workoutplan {
    private final String title;
    private final String level;
    private final int durationMin;
    private final List<Exercise> exercises;

    public Workoutplan(String title, String level, int durationMin, List<Exercise> exercises) {
        this.title = title;
        this.level = level;
        this.durationMin = durationMin;
        this.exercises = exercises;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Workout Plan: ").append(title).append(" ===\n")
                .append("Level: ").append(level).append("\n")
                .append("Duration: ").append(durationMin).append(" mins\n")
                .append("Exercises:\n");
        for (Exercise ex : exercises) {
            sb.append(" - ").append(ex).append("\n");
        }
        return sb.toString();
    }
}