public class Main {
    private static int one = 1;
    private static int two = 2;
    private static int three = 3;
    private static int four = 4;
    private static int five = 5;
    public static void main(String[] args) {
        System.out.println("Operators perform specific operations on operands and return a result.");

        operators();

        operatorAbbreviation();

        ifThen();

        logicalAndOperator();

        logicalOrOperator();

        assignmentVsEquals();


    }

    private static void assignmentVsEquals() {
        int newValue=50;
        if(newValue==50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar=true){
            System.out.println("This is not supposed to happen because isCar has been assigned true. use comparison not assignment");
        }
        isCar=false;
        if(isCar==true){
            System.out.println("This is a car.");
        }

        isCar=true;
        if(isCar){
            System.out.println("\nYou can test without ==true. better to avoid mistake with using assignment");
            System.out.println("This is a car.");
        }

        isCar=false;
        if(!isCar){
            System.out.println("\nYou can use !isCar - Logical complement operator.");
            System.out.println("This is not a car.");
        }
    }

    private static void logicalOrOperator() {
        System.out.println("\nor operator requires only one condition to be true.");
        int topScore=100;
        int secondTopScore=81;
        if(topScore>90 || secondTopScore <=90){
            System.out.println("either or both conditions are true");
        }
    }

    private static void logicalAndOperator() {
        int topScore = 80;
        if(topScore!=100){
            System.out.println("You did not score top score");
        }
        if(topScore>100){
            System.out.println("You scored more than the top score");
        }
        if(topScore<100){
            System.out.println("You scored less than top score.");
        }
        if(topScore>=100){
            System.out.println("You scored at least the top score");
        }
        int secondTopScore = 60  ;
        System.out.println("\nwe can perform operations based on more than one condition:");
        if(topScore>secondTopScore && topScore<100){
            System.out.println("Greater than second top score and less than first top score");
        }
    }

    private static void ifThen() {
        System.out.println("\nconditional logic which performs an operation based on whether a condition is true or false");
        boolean isAlien=false;
        if(isAlien ==false)
            System.out.println("It is not alien");
        System.out.println("\nuse code blocks so operations can be performed on the condition.");
        if(isAlien ==false) {
            System.out.println("It is not alien");
        }
    }

    private static void operatorAbbreviation() {
        System.out.println("\nWe can abbreviate operators:");
        one++;
        System.out.println("1++="+one);
        two--;
        System.out.println("2--="+two);
        three+=4;
        System.out.println("3+=4 is "+three);
        four*=10;
        System.out.println("4*=10 is "+four);
        five/=5;
        System.out.println("5/=5 is "+five);
    }

    private static void operators() {
        System.out.println("+ adds variables. 1+2="+(one+two));
        System.out.println("- subtracts 2="+(two-one));
        System.out.println("- multiplies 2*1="+(two*one));
        System.out.println("- divides 2/1="+(two/one));
        System.out.println("- modulus: remainder after division 2/1="+(4%3));
    }

}
