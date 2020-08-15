public class For {
    public static void miniChallenge1() {
        for(int i=8; i>=2 ;i--){
            double interest = calculateInterest(10000,i);
            System.out.println("simple interest for 10000 at "+i+"%= "+interest);
        }
    }

    public static void miniChallenge2() {

        int primeCount = 0;
        for(int i=0; i<=50; i++){
            if (isPrime(i)){
                System.out.println(i+" is prime");
                primeCount++;
                if (primeCount==3){
                    break;
                }
            }
        }
    }

    private static boolean isPrime(int n) {
        if(n ==1){
            return false;
        }

        for(int i=2; i<=n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double rate) {
        return amount * rate/100;
    }

    public static void loopWithFor() {
        For forLesson = new For();
        for (int i=2;i<=8;i++){
            double interest = forLesson.calculateInterest(10000,i);
            System.out.println("simple interest for 10000 at "+i+"%= "+interest);
        }
    }

    public static void loopWithoutFor() {
        For forLesson = new For();
        double interest2 = forLesson.calculateInterest(10000,2);
        double interest3 = forLesson.calculateInterest(10000,3);
        double interest4 = forLesson.calculateInterest(10000,4);
        double interest5 = forLesson.calculateInterest(10000,5);
        System.out.println("simple interest for 10000 at 2% = "+interest2);
        System.out.println("simple interest for 10000 at 3% = "+interest3);
        System.out.println("simple interest for 10000 at 4% = "+interest4);
        System.out.println("simple interest for 10000 at 5% = "+interest5);
    }
}
