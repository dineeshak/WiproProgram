package DAY8;


class TicketBooking implements Runnable {
    private static int ticketsAvailable = 5; // shared resource: 5 tickets

    // synchronize booking to avoid race condition
    public synchronized void bookTicket(String name) {
        if (ticketsAvailable > 0) {
            System.out.println(name + " booked ticket number: " + ticketsAvailable);
            ticketsAvailable--;
        } else {
            System.out.println(name + " sorry, no tickets available.");
        }
    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        bookTicket(threadName);
    }
}

public class BookingDemo {
    public static void main(String[] args) {
        TicketBooking bookingTask = new TicketBooking();

        Thread user1 = new Thread(bookingTask, "User1");
        Thread user2 = new Thread(bookingTask, "User2");
        Thread user3 = new Thread(bookingTask, "User3");
        Thread user4 = new Thread(bookingTask, "User4");
        Thread user5 = new Thread(bookingTask, "User5");
        Thread user6 = new Thread(bookingTask, "User6");

        // Start all threads
        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();
        user6.start();
    }
}
