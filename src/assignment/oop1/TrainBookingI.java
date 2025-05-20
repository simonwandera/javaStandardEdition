package src.assignment.oop1;

public interface TrainBookingI {

    void bookTicket(String seatNumber, Double amount);

    Boolean checkAvailability(String seatNumber);

    String cancelTicket(String seatNumber);

}