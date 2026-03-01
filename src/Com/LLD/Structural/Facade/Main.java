package Com.LLD.Structural.Facade;

class PaymentService {
    void makePayment() {
        System.out.println("Process Payment");
    }
}

class SeatReservationService {
    void reserveSeat() {
        System.out.println("Reservee seat");
    }
}

class Notification {
    void makeNotification() {
        System.out.println("make notification");
    }
}

class LoyaltyPointsService {
    void makePoints() {
        System.out.println("make loyaltypoints");
    }
}

class TicketService {
    void generateTicket() {
        System.out.println("generate ticket");
    }
}

class bookTicket {
    PaymentService paymentService;
    SeatReservationService seatReservationService;
    Notification notification;
    LoyaltyPointsService loyaltyPointsService;
    TicketService ticketService;

    bookTicket() {
        this.paymentService = new PaymentService();
        this.seatReservationService = new SeatReservationService();
        this.notification = new Notification();
        this.loyaltyPointsService = new LoyaltyPointsService();
        this.ticketService = new TicketService();
    }

    void processAll() {
        paymentService.makePayment();
        seatReservationService.reserveSeat();
        notification.makeNotification();
        loyaltyPointsService.makePoints();
        ticketService.generateTicket();
        System.out.println("All done");
    }
}



public class Main {
    public static void main(String[] args) {
        bookTicket bookticket = new bookTicket();   // instead of calling all obj here we create separate class.
        bookticket.processAll();
    }
}
