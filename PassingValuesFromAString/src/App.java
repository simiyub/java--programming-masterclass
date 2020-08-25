public class App {
    public static void main(String[] args) {

        parsingExamples();
        canPack(2,0,9);//false
        canPack(1,0,4); //false
        canPack(1,0,5); //true
        canPack(0,5,4); //true
        canPack(2,2,11); //true
        canPack(-3,2,11); //false
        canPack(4,18,19); //true
        canPack(5,3,24); //false

    }

    private static boolean canPack(int bigCount, int smallCount, int goal){
        boolean can=false;
        if(bigCount>=0 && smallCount>=0 && goal>=0){
            int bigKg=5;
            int smallKg=1;
            if(bigCount*bigKg==goal||smallCount*smallKg==goal){
                System.out.println("goal reached");
                can=true;
            }
            else{
                for(int i=0;i<=bigCount;i++){

                    for (int j=0;j<=smallCount;j++){
                        int bigWeight=i*bigKg;
                        int smallWeight=j*smallKg;
                        if( bigWeight + smallWeight==goal){
                            System.out.println("Goal="+goal);
                            System.out.println("[bigCount="+bigCount+"smallCount="+smallCount);
                            System.out.println("[bigWeight="+bigWeight+"smallWeight="+smallWeight);
                            System.out.println("goal reached");
                            return true;
                        }
                    }
                }
            }

        }
        return can;
    }

    private static void parsingExamples() {

        String numberAsString = "100";
        System.out.println(numberAsString);

        //Using parsing throws NumberFormatException if not a valid number.
        int number=Integer.parseInt(numberAsString);
        System.out.println("100+10="+(number+10));

        double numberAsDouble=Double.parseDouble(numberAsString);
        System.out.println("100 as double="+numberAsDouble);
    }
}
