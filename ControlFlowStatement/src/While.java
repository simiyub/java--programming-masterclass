public class While {
    public static boolean isEvenChallenge(int number) {
        boolean even=false;
        if(number%2==0){
            even=true;
            System.out.println(number+" is even.");
        }
        return false;

    }

    public static void example1() {

        int number = 4;
        int start = number;
        int finishNumber=20;
        int sum = 0;
        int count = 0;

        while(number<=finishNumber){
            boolean even=isEvenChallenge(number);
            number+=1;
            if(!even){
                continue;
            }

            sum+=number;
            count+=1;
            if(count==5){
                break;
            }
            System.out.println("total of first five even numbers between "+start+" and "+finishNumber+" is:"+sum);

        }
    }
}
