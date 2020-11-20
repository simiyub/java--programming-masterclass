import data.Theatre;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 *https://docs.oracle.com/javase/tutorial/collections/intro/index.html
 * Declaring collection as an interface such as collection, List, Set etc,
 * we can change the implementation without breaking our code
 * */
public class Main {
    private static List<Theatre.Seat> manipulatedSeatList;

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Theatre 1", 25,  10);
        theatre.showSeats();
        theatre.reserveSeat("A10");
        theatre.reserveSeat("A10");
        manipulatedSeatList = new ArrayList<>(theatre.getSeats());
        printManipulatedSeatList(null);
        manipulatedSeatList.get(1).reserve();
        if(theatre.reserveSeat("A02")){
            System.out.println("Pay");
        }
        else{
            System.out.println("Seat not available");
        }

        theatre.showSeats();

        Collections.reverse(manipulatedSeatList);
        printManipulatedSeatList("reversed");

        Collections.shuffle(manipulatedSeatList);
        printManipulatedSeatList("shuffled");
        System.out.println("min seat"+Collections.min(manipulatedSeatList));
        System.out.println("max seat"+Collections.max(manipulatedSeatList));

        sortList(manipulatedSeatList);
        printManipulatedSeatList("sorted");


    }

    private static void sortList(List<? extends Theatre.Seat> list) {
        for(int i=0; i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).compareTo(list.get(j))>0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }

    private static void printManipulatedSeatList(String action) {
        if(action!=null){
            System.out.println("Seat copy "+action+":"+manipulatedSeatList);
        }
        else{
            System.out.println("Seat copy:"+manipulatedSeatList);
        }

    }
}
