package assignment2;


public class Main {
    public static void main(String[] args) {
        System.out.println("PART A:");
        WorkoutFactory runningFactory = new RunningWorkoutFactory();
        runningFactory.logworkout();

        WorkoutFactory pushUpFactory = new PushUpWorkoutFactory();
        pushUpFactory.logworkout();

        System.out.println("PART B");
        System.out.println("Cardio Plan");
        FitnessFactory cardioFactory = new CardioFitnessFactory();
        Equipment cardioEquipment = cardioFactory.createEquipment();
        Nutrition cardioNutrition = cardioFactory.createNutrition();
        cardioEquipment.use();
        cardioNutrition.consume();

        System.out.println(" Strength Plan ");
        FitnessFactory strengthFactory = new StrengthFitnessFactory();
        Equipment strengthEquipment = strengthFactory.createEquipment();
        Nutrition strengthNutrition = strengthFactory.createNutrition();
        strengthEquipment.use();
        strengthNutrition.consume();
    }
}
