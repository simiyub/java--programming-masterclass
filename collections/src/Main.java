import data.Theatre;

/**
 *
 *
 * */
public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Theatre 1", 25,  10);
        theatre.showSeats();
        theatre.reserveSeat("A10");
        theatre.reserveSeat("A10");


    }
}
