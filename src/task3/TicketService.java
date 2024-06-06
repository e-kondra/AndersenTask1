package task3;

import java.math.BigDecimal;

public class TicketService {

    public static void main(String[] args) {
        Ticket ticketEmpty = new Ticket();
        Ticket ticketFull = new Ticket(1L, "Compensa", 305,
                false, Sector.A, 2.300f, new BigDecimal(23.56));
        Ticket ticketLimited = new Ticket("Compensa", 342);

        System.out.println(ticketEmpty);
        System.out.println(ticketFull);
        System.out.println(ticketLimited);

    }
}