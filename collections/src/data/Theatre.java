package data;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats;

    public Theatre(String name, int numRows, int seatsPerRow) {
        this.theatreName = name;
        int lastRow = 'A'+(numRows-1);
        seats = new ArrayList<>();
        for(char row='A'; row<=lastRow;row++){
            for(int seatNum=1; seatNum<=seatsPerRow;seatNum++){
                seats.add(new Seat(row+String.format("%02d", seatNum)));
            }
        }

    }

    public String getTheatreName() {
        return theatreName;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public boolean reserveSeat(String seatNumber){

        for (Seat seat:seats){
            if(seat.getSeatNumber().equals(seatNumber) && !seat.isReserved()){
                processPayment();
                return seat.reserve();
            }
        }
        System.out.println("Seat not available.");
        return false;

    }

    private void processPayment() {
        System.out.println("Please pay");
    }

    public void showSeats(){
        for(Seat seat: seats){
            System.out.println(seat.toString());
        }
    }

    private class Seat {
        private final String seatNumber;
        private boolean reserved=false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve() {
            if(this.isReserved()) {
                System.out.println("Seat already reserved.");
                return false;
            }
            this.reserved = true;
            System.out.println("seat "+seatNumber+ " reserved");
            return isReserved();
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean isReserved() {
            return reserved;
        }

        public boolean cancel(){
            if(!reserved){
                System.out.println("Did not cancel as seat is not reserved");
                return false;
            }
            this.reserved=false;
            System.out.println("reservation cancelled");
            return isReserved();
        }

        @Override
        public String toString() {
            return this.getSeatNumber();
        }
    }
}
