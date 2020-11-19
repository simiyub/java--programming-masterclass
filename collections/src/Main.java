import data.Theatre;

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


    }
}
