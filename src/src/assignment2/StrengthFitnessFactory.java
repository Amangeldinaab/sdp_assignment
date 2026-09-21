package assignment2;

public class StrengthFitnessFactory implements FitnessFactory{
    @Override
    public Equipment createEquipment() {
        return new Dumbell();
    }
    @Override
    public Nutrition createNutrition() {
        return new ProteinShake();
    }
}
