import data.*;


public class Main {
    public static void main(String[] args) {
        example();
        sumCalculatorCodingExercise();
        personCodingExercise();
        bankAccountChallenge();
        vipCustomerChallenge();
        codingExerciseWall();
        codingExercisePoint();

    }

    private static void codingExercisePoint() {
        Point defaultPoint=new Point();
        defaultPoint.setX(3);
        defaultPoint.setY(4);
        System.out.println("distance from [0,0] to [3,4] is "+defaultPoint.distance());

        Point point22=new Point(2,2);
        System.out.println("distance from [2,2] to [4,5] is "+point22.distance(4,5));

        Point point1010=new Point(10,10);
        System.out.println("distance from [2,2] to [10,10] is "+point22.distance(point1010));
    }


    private static void codingExerciseWall() {
        Wall defaultWall=new Wall();
        printWallArea(defaultWall);
        Wall withWidthAndHeight = new Wall(2.5, 4);
        printWallArea(withWidthAndHeight);
    }

    private static void printWallArea(Wall wall) {
        System.out.println("area of wall["+wall.getWidth()+"X"+wall.getHeight()+"]="+wall.getArea());
    }

    private static void vipCustomerChallenge() {
        VIPCustomer vipDefault=new VIPCustomer();
        printCustomerDetails(vipDefault);
        VIPCustomer vipWithTwoValues=new VIPCustomer("two values", "two.values@bank.com");
        printCustomerDetails(vipWithTwoValues);
        VIPCustomer vipWithValues=new VIPCustomer("with values", 20.00,"with.values@bank.com");
        printCustomerDetails(vipWithValues);
    }

    private static void printCustomerDetails(VIPCustomer customer) {
        System.out.println("customer name:"+customer.getName()+"\nemail:"+customer.getEmail()+"\ncredit limit="+customer.getCreditLimit());
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
