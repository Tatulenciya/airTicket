package ru.netology;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Comparator;

class AviaSoulsTest {

    @Test
    public void sortTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "AER", 9_850, 15, 19);
        Ticket ticket2 = new Ticket("MSK", "KGD", 10_659, 8, 12);
        Ticket ticket3 = new Ticket("MSK", "KGD", 4_460, 19,22);
        Ticket ticket4 = new Ticket("MSK", "DXB", 17_650, 8, 11);
        Ticket ticket5 = new Ticket("MSK", "KGD", 10_659,9, 12);
        Ticket ticket6 = new Ticket("MSK", "KGD", 3_250, 12,16);
        Ticket ticket7 = new Ticket("MSK","KGD", 7_753, 18,22);
        Ticket ticket8 = new Ticket("MSK", "AER", 6_530, 20,24);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);


        Ticket[] expected = {ticket6, ticket3, ticket7, ticket2, ticket5};
        Ticket[] actual = manager.search("MSK", "KGD");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void searchTicket() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "AER", 9_850, 15, 19);
        Ticket ticket2 = new Ticket("MSK", "KGD", 10_659, 8, 12);
        Ticket ticket3 = new Ticket("MSK", "KGD", 4_460, 19,22);
        Ticket ticket4 = new Ticket("MSK", "DXB", 17_650, 8, 11);
        Ticket ticket5 = new Ticket("MSK", "KGD", 10_659,9, 12);
        Ticket ticket6 = new Ticket("MSK", "KGD", 3_250, 12,16);
        Ticket ticket7 = new Ticket("MSK","KGD", 7_753, 18,22);
        Ticket ticket8 = new Ticket("MSK", "AER", 6_530, 20,24);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);


        Ticket[] expected = {ticket4};
        Ticket[] actual = manager.search("MSK", "DXB");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ticketNotFound() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "AER", 9_850, 15, 19);
        Ticket ticket2 = new Ticket("MSK", "KGD", 10_659, 8, 12);
        Ticket ticket3 = new Ticket("MSK", "KGD", 4_460, 19,22);
        Ticket ticket4 = new Ticket("MSK", "DXB", 17_650, 8, 11);
        Ticket ticket5 = new Ticket("MSK", "KGD", 10_659,9, 12);
        Ticket ticket6 = new Ticket("MSK", "KGD", 3_250, 12,16);
        Ticket ticket7 = new Ticket("MSK","KGD", 7_753, 18,22);
        Ticket ticket8 = new Ticket("MSK", "AER", 6_530, 20,24);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);


        Ticket[] expected = {};
        Ticket[] actual = manager.search("AER", "MSK");

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void sortTicketsWithTimeFlight() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "AER", 9_850, 15, 19);
        Ticket ticket2 = new Ticket("MSK", "KGD", 10_659, 8, 12);
        Ticket ticket3 = new Ticket("MSK", "KGD", 4_460, 19,22);
        Ticket ticket4 = new Ticket("MSK", "DXB", 17_650, 8, 11);
        Ticket ticket5 = new Ticket("MSK", "KGD", 10_659,9, 12);
        Ticket ticket6 = new Ticket("MSK", "KGD", 3_250, 12,16);
        Ticket ticket7 = new Ticket("MSK","KGD", 7_753, 18,22);
        Ticket ticket8 = new Ticket("MSK", "AER", 6_530, 20,24);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] expected = {ticket3, ticket5, ticket2, ticket6, ticket7};
        Ticket[] actual = manager.search("MSK", "KGD", comparator);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void searchTicketsWithTimeFlight() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "AER", 9_850, 15, 19);
        Ticket ticket2 = new Ticket("MSK", "KGD", 10_659, 8, 12);
        Ticket ticket3 = new Ticket("MSK", "KGD", 4_460, 19,22);
        Ticket ticket4 = new Ticket("MSK", "DXB", 17_650, 8, 11);
        Ticket ticket5 = new Ticket("MSK", "KGD", 10_659,9, 12);
        Ticket ticket6 = new Ticket("MSK", "KGD", 3_250, 12,16);
        Ticket ticket7 = new Ticket("MSK","KGD", 7_753, 18,22);
        Ticket ticket8 = new Ticket("MSK", "AER", 6_530, 20,24);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] expected = {ticket4};
        Ticket[] actual = manager.search("MSK", "DXB", comparator);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void TicketsWithTimeFlightNotFound() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "AER", 9_850, 15, 19);
        Ticket ticket2 = new Ticket("MSK", "KGD", 10_659, 8, 12);
        Ticket ticket3 = new Ticket("MSK", "KGD", 4_460, 19,22);
        Ticket ticket4 = new Ticket("MSK", "DXB", 17_650, 8, 11);
        Ticket ticket5 = new Ticket("MSK", "KGD", 10_659,9, 12);
        Ticket ticket6 = new Ticket("MSK", "KGD", 3_250, 12,16);
        Ticket ticket7 = new Ticket("MSK","KGD", 7_753, 18,22);
        Ticket ticket8 = new Ticket("MSK", "AER", 6_530, 20,24);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] expected = {};
        Ticket[] actual = manager.search("AER", "DXB", comparator);

        Assertions.assertArrayEquals(expected, actual);

    }

}