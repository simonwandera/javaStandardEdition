package src.assignment.oop1;

public class TrainBooking implements TrainBookingI{


    @Override
    public void bookTicket(String seatNumber, Double amount) {
        System.out.println("Ticket booked for seat number: " + seatNumber + " with amount: " + amount);
    }

    @Override
    public Boolean checkAvailability(String seatNumber) {
        return true;
    }

    @Override
    public String cancelTicket(String seatNumber) {
        return "Ticket cancelled for seat number: " + seatNumber;
    }
}
