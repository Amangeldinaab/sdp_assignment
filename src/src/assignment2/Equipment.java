package assignment2;

public interface Equipment {
    void use();
}

interface Nutrition {
    void consume();
}

class RunningShoes implements Equipment {
    @Override
    public void use() { System.out.println("Running shoes"); }
}

class EnergyDrink implements Nutrition {
    @Override
    public void consume() { System.out.println("Energy drink"); }
}

class Dumbbell implements Equipment {
    @Override
    public void use() { System.out.println("Dumbbells"); }
}

class ProteinShake implements Nutrition {
    @Override
    public void consume() { System.out.println("Protein shake"); }
}
