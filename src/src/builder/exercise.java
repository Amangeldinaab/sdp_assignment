package builder;

public class exercise {private final String name;
    private int sets;
    private final int reps;

    public exercise(String name, int sets, int reps) {
        this.name = name;
        this.sets = sets;
        this.reps = reps;
    }

    public String getname() {
        return name;
    }

    public int getsets() {
        return sets;
    }

    public int getreps() {
        return reps;
    }

    @Override
    public String toString() {
        return String.format("%s (%d sets x %d reps)", name, sets, reps);
    }
}
