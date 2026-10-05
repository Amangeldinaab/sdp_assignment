package assignment2;

class CardioFitnessFactory implements FitnessFactory {
    @Override
    public Equipment createEquipment() {
        return new RunningShoes();
    }

    @Override
    public Nutrition createNutrition() {
        return new EnergyDrink();
    }
}
