package assignment2;

class StrengthFitnessFactory implements FitnessFactory {
    @Override
    public Equipment createEquipment() {
        return new Dumbbell();
    }

    @Override
    public Nutrition createNutrition() {
        return new ProteinShake();
    }
}
