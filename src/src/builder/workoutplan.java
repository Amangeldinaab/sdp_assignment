package builder;
import java.util.list;

public class workoutplan {
    private final String title;
    private final String level;
    private final int durationMin;
    private final List<exercise> exercises;

    public workoutplan(String title, String level, int durationMIn, List<exercise> exercises) {
        this.title = title;
        this.level = level;
        this.durationMin = durationMin;
        this.exercises = exercises;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===Workout Plan: ").append.(title).append("===/n")
                .append("Level:").append(level).append("/n")
                .append("Duration:").append(durationMin).append("mins/n")
                .append("Exercises:/n");
        for (exercise ex : exercises) {
            sb.append(" - ").append(ex).append("/n")
        }
        return sb.toString();
    }
}
