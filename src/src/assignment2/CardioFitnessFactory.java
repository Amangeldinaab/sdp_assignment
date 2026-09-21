package assignment2;

public class CardioFitnessFactory implements FitnessFactory{
    @Override
    public Equipment createEquipment() {
        return new RunningShoes();
    }
    @Override
    public Nutrition createNutrition() {
        return new EnergyDrink();
    }
}
