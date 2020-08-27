import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        example();
        readingUserInputChallenge();
        minMaxChallenge();
    }

    private static void minMaxChallenge() {

        System.out.println("This program will work out the minimum and maximum of values entered by the user\n");
        System.out.println("Type x to exit.");
        Scanner inputSource=new Scanner(System.in);
        boolean starting=true;
        int min=-1;
        int max=-1;
        int value = -1;
        while (true){
            System.out.println("Enter a value:");
            if(inputSource.hasNextInt()){
                value=inputSource.nextInt();

                if(starting){
                    min=value;
                    max=value;
                    starting=false;
                }
                min = value<min ? value : min;
                max = value>max ? value : max;
                inputSource.nextLine();
            }
            else if(inputSource.hasNext("x")){
                System.out.println("Exiting..");
                break;
            }
            else {
                System.out.println("Invalid input of "+inputSource.next()+" entered. Program will exit.");
                break;
            }

        }
        System.out.println("The min value received was:"+min+" and max value was:"+max);
        inputSource.close();
    }

    private static void readingUserInputChallenge() {

        System.out.println("This program will sum up 10 numbers of your choice.");
        int count=1;
        int sum=0;
        String userInput="";
        Scanner userInputSource=new Scanner(System.in);
        while(count<=10){
            System.out.println("Enter number "+count);
            int number=0;

            if(userInputSource.hasNextInt()){
                number=userInputSource.nextInt();
                userInputSource.nextLine();
                System.out.println("You typed: "+number);
                sum+=number;
                userInput+= number;
                userInput+= count!=10? " + ": " = ";
                System.out.println("Sum="+sum);
                count++;
            }
            else{
                System.out.println("Invalid Input. Try again");
                userInputSource.nextLine();
            }

        }
        System.out.println(userInput+sum);
        userInputSource.close();
    }

    private static void example() {
        //System passes input in and scanner reads the user input
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter year of your birth:");
        int age = 0;
        if(scanner.hasNextInt()){
            int yearOfBirth = scanner.nextInt();
            if(yearOfBirth>0){
                age = 2020-yearOfBirth;
            }
            else {
                System.out.println("Invalid year of birth");
            }

        }

        scanner.nextLine();//handle next line character[enter key]
        System.out.println("Enter your name");//Get user input
        String name = scanner.nextLine();

        System.out.println("User is:"+name);
        System.out.println("Your age is:"+age);

        //release resources.
        scanner.close();
    }
}
