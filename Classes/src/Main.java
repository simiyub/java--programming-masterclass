public class Main {
    public static void main(String[] args) {
        example();
        sumCalculatorCodingExercise();
        personCodingExercise();
    }

    private static void personCodingExercise() {

    }

    private static void sumCalculatorCodingExercise() {
        SimpleCalculator calculator=new SimpleCalculator();
        calculator.setFirstNumber(1.2);
        calculator.setSecondNumber(1.3);
        System.out.println(calculator.getAdditionResult());
        System.out.println(calculator.getSubtractionResult());
        System.out.println(calculator.getMultiplicationResult());
        System.out.println(calculator.getDivisionResult());
        calculator.setSecondNumber(0);
        System.out.println(calculator.getDivisionResult());
    }

    private static void example() {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        holden.getModel();
        System.out.println(porsche.getModel());
        System.out.println(holden.getModel());
    }
}
