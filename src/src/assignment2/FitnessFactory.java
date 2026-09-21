package assignment2;

public interface FitnessFactory {
    Equipment createEquipment();
    Nutrition createNutrition();
}

class CardioFitnessFactory implements FitnessFactory {
    @Override
    public Equipment createEquipment() { return new RunningShoes(); }
    @Override
    public Nutrition createNutrition() { return new EnergyDrink(); }
}

class StrengthFitnessFactory implements FitnessFactory {
    @Override
    public Equipment createEquipment() { return new Dumbbell(); }
    @Override
    public Nutrition createNutrition() { return new ProteinShake(); }
}
