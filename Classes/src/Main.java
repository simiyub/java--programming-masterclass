
public class Main {
    public static void main(String[] args) {
        example();
        sumCalculatorCodingExercise();
        personCodingExercise();
        bankAccountChallenge();
    }

    private static void bankAccountChallenge() {
        BankAccount account = new BankAccount("12345","Customer Name", "customer@bank.com", "6789");
        account.printDetails();
        account.getBalance();
        account.deposit(12.00);
        account.withdraw(5.00);
        account.withdraw(12.00);
    }

    private static void personCodingExercise() {
        Person teen=new Person();
        int teenAge=14;
        teen.setAge(teenAge);
        System.out.println(teenAge+" is teenage="+teen.isTeen());

        Person nonTeen=new Person();
        int nonTeenage=24;
        nonTeen.setAge(nonTeenage);
        System.out.println(nonTeenage+" is teenage="+nonTeen.isTeen());

        Person nameLessPerson=new Person();
        System.out.println("nameless person Full name="+nameLessPerson.getFullName());

        Person firstNamePerson=new Person();
        firstNamePerson.setFirstName("First");
        System.out.println("firstNamePerson Full name="+firstNamePerson.getFullName());

        Person lastNamePerson=new Person();
        lastNamePerson.setLastName("Last");
        System.out.println("lastNamePerson Full name="+lastNamePerson.getFullName());

        Person fullNamePerson=new Person();
        fullNamePerson.setFirstName("First");
        fullNamePerson.setLastName("Last");
        System.out.println("fullNamePerson Full name="+fullNamePerson.getFullName());


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
