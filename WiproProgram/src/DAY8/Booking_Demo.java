package DAY8;


class TicketBook {
    private int availableTickets = 10;

    public synchronized void bookTicket(int tickets) {
        if (availableTickets >= tickets) {
            availableTickets -= tickets; 
            // availabletickets = availabletickets - tickets
            System.out.println("Booked " + tickets + ", Remaining: " + availableTickets);
        } else {
            System.out.println("Not enough tickets for " + tickets);
        }
    }

    public int getAvailableTickets() {
        return availableTickets;
    }
}

public class Booking_Demo {
    public static void main(String[] args) throws InterruptedException {
        TicketBook booking = new TicketBook();

        Thread t1 = new Thread(() -> { booking.bookTicket(2); /*...*/ });
        Thread t2 = new Thread(() -> { booking.bookTicket(3); /*...*/ });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final tickets = " + booking.getAvailableTickets());
    }
}
