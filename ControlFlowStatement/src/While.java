 class While {
     static boolean isEvenChallenge(int number) {
        boolean even=false;
        if(number%2==0){
            even=true;
            System.out.println(number+" is even.");
        }
        return even;

    }

     static void example1() {

        int number = 4;
        int start = number;
        int finishNumber=20;
        int sum = 0;
        int count = 0;

        while(number<=finishNumber){
            boolean even=isEvenChallenge(number);

            if(!even){
                number+=1;
                continue;
            }

            sum+=number;

            number+=1;
            count+=1;

            if(count==5){
                break;
            }

        }
        System.out.println("total of first five even numbers between "+start+" and "+finishNumber+" is:"+sum);
    }

     static void digitSumChallenge(int number) {
        /**
         * Adds the digits in a number if >=10
         * **/
        int startingNumber=number;
        int sum=0;
        if(number>=10){
            do{

                sum+=number%10;
                number=number/10;
            }while(number%10!=0);
        }
        else{
            sum=-1;
        }
        System.out.println("sum of digits in "+startingNumber+"="+sum);

    }

     static boolean isPalindrome(int number) {
        if(number<0){
            number=number*-1;
        }


        int startingNumber=number;
        int multiple = 10;
        int reverse=0;
        int currentDigit;
        do{
            currentDigit=number%10;
            reverse=(reverse * multiple) + currentDigit;
            number=number/10;

        }while(number>0);
        System.out.println("number="+startingNumber);
        System.out.println("reverse="+reverse);
        boolean isPalindrome = (startingNumber==reverse);
        System.out.println("is palidrome="+isPalindrome);
        return isPalindrome;
    }

     static int sumFirstAndLastDigit(int number){
        if (number<0){
            System.out.println("Invalid number:"+number);
            return -1;
        }
        int num=number;
        int count=0;
        int rem;
        int first = 0;
        if(num/10 <1) {
            rem = num + num;
            System.out.println("rem=" + rem);
            return rem;
        }
        do{
            rem = num%10;
            num=num/10;
            if(count==0){
                first=rem;
            }
            count++;
            System.out.println("current="+num);
        }while (num>=10);
        System.out.println("first="+first+"current="+num);
        rem=first+num;
        System.out.println("rem="+rem);
        return rem;
    }

     static int getEvenDigitSum(int number) {
        if(number<0){
            return -1;
        }
        else{
            int sum = 0;
            int digit;
            while(number >0){
                digit = number%10;
                System.out.println("digit now="+digit);
                if(number%2==0){
                    sum+=digit;
                }
                System.out.println("sum now="+sum);
                System.out.println("number before /"+number);
                number/=10;
                System.out.println("number after /"+number);
                            }
            System.out.println("sum="+sum);
            return sum;

        }
    }


     static boolean hasSharedDigit(int number1, int number2) {

        if((number1>=10 && number1<=99) && (number2>=10 && number2<=99)){
            if(number1<0){
                number1=number1*-1;
            }
            if(number2<0){
                number2=number2*-1;
            }

            int digit1,digit2;

            while (number1>0){
                digit1=number1%10;
                System.out.println("number1="+number1);
                System.out.println("digit1"+digit1);
                int current2=number2;
                while (current2>0){
                    System.out.println("number2="+current2);
                    digit2=current2%10;
                    System.out.println("digit2="+digit2);
                    if(digit1==digit2){
                        System.out.println("shared="+true);
                        return true;
                    }
                    current2/=10;
                }
                number1/=10;
            }
        }
        return false;

    }
}
