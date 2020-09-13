import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        creatingArrays();
        example();
        challenge();

    }



    private static void creatingArrays() {
        //one way to create arrays
        int[] intArray=new int[10];
        intArray[5]=50;
        intArray[3]=20;
        System.out.println("value at index 5="+intArray[5]);

        //second way to create an array
        double[] doubleArray= {3.5,2.5,};
        System.out.println("item at index 1:"+doubleArray[1]);

        //third way
        int [] array3= new int[10];
        for(int i=0;i<array3.length;i++){
            array3[i]=i*10;
        }
        printArray(array3);
    }

    private static void example() {
        int[] intArray=getIntegers(5, "average");
        printArray(intArray);
        System.out.println("average of these numbers is: "+getAverage(intArray));
    }

    private static void challenge() {
        int[] toSort = getIntegers(5, "sort");
        printArray(toSort);
        int[] sortedArray=sortArray(toSort);
        System.out.println("sorted:");
        printArray(sortedArray);

        int[] sortedTimsArray=timSortSolution(toSort);
        System.out.println("sorted:");
        printArray(sortedTimsArray);
    }

    private static int[] timSortSolution(int[] toSort) {
//        int[] sorted = new int[toSort.length];
//        for(int i=0;i<toSort.length;i++){
//            sorted[i]=toSort[i];
//        }
        int[] sorted= Arrays.copyOf(toSort,toSort.length);

        boolean sort=true;
        int holding;
        while(sort) {
            sort=false;
            for (int j = 0; j < sorted.length - 1; j++) {

                if (sorted[j] > sorted[j + 1]) {
                    holding = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = holding;
                    sort = true;
                }
            }
        }
        return sorted;
    }


    private static int[] sortArray(int[] toSort) {
        int[] sorted = new int[toSort.length];
        int sortedIndex=0;
        while(toSort.length>0){
            int least = toSort[0];
            int leastIndex = 0;
            int[] remainingElements=new int[toSort.length-1];
            int remainingElementsIndex=0;

            for(int i=0;i<toSort.length;i++){
                if(toSort[i]<least){
                    least=toSort[i];
                    leastIndex=i;
                    }
            }
            sorted[sortedIndex]=least;
            sortedIndex++;


            for (int j=0;j<toSort.length;j++) {
                if(j!=leastIndex) {
                    remainingElements[remainingElementsIndex]=toSort[j];
                    remainingElementsIndex++;
                }
            }
            toSort=remainingElements;
        }
        return sorted;
    }


    private static double getAverage(int[] intArray) {
        double sum=0;
        for(int i=0;i<intArray.length;i++){
            sum+=intArray[i];
        }
        return (sum/intArray.length);
    }

    private static int[] getIntegers(int numbers, String action) {
        System.out.println("Please enter "+numbers+" integer values to "+action);
        Scanner scanner= new Scanner(System.in);
        int[] values = new int[numbers];
        for(int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    private static void printArray(int[] array) {
        for(int i=0;i<array.length;i++){
            System.out.println("element at "+i+" is "+array[i]);
        }

    }
}
