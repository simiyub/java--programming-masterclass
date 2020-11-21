import data.Seat;
import data.Theatre;

import java.util.*;

/**
 *
 *https://docs.oracle.com/javase/tutorial/collections/intro/index.html
 * Declaring collection as an interface such as collection, List, Set etc,
 * we can change the implementation without breaking our code
 * */
public class Main {


    public static void main(String[] args) {
        Theatre theatre = new Theatre("Theatre 1", 25,  10);
        theatre.showSeats();
        theatre.reserveSeat("A10");
        theatre.reserveSeat("A10");

        CollectionsMethods.demo();

        List<Seat> priceSeats = new ArrayList<>();
        priceSeats.add(new Seat("B20",20));
        priceSeats.add(new Seat("B00", 10));
        priceSeats.add(new Seat("B15", 15));

        Collections.sort(priceSeats,Seat.PRICE_ORDER);
        System.out.println(priceSeats);




    }

    private static void demoCollectionsMethods() {
        CollectionsMethods.demo();
    }

}
