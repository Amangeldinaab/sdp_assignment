package assignment1.builder;
import assignment1.builder.model.Workoutplan;

public interface Builder {
    Builder setTitle(String title);
    Builder setLevel(String level);
    Builder setdurationMin(int durationMin);
    Builder addExercise(String name, int sets, int reps);
    Workoutplan build();

}
