package task3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class TicketService {

    private final ArrayList<Ticket> ticketStorage;

    public TicketService() {
        this.ticketStorage = this.fillInStorage();
    }

    private ArrayList<Ticket> fillInStorage() {
        ArrayList tickets = new ArrayList<>();
        for(int i = 1; i<11 ;i++){
            Ticket ticket = new Ticket(Long.valueOf(i), "Compensa",
                    342, false,
                    Sector.values()[new Random().nextInt(Sector.values().length)],
                    2.300f, new BigDecimal(23.56));
            tickets.add(ticket);
        }
        return tickets;
    }

    public static void main(String[] args) {
        TicketService ticketService = new TicketService();
        ticketService.ticketStorage.stream().forEach(System.out::println);


        ticketService.getTicketsBySector(Sector.C)
                .forEach(System.out::println); //example of getting tickets by sector
    }

    private List<Ticket> getTicketsBySector(Sector sector) {
        return ticketStorage.stream()
                .filter(ticket -> ticket.getSector() == sector)
                .toList();
    }

}