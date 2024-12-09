import java.util.ArrayList;
import java.time.LocalDate;

public class Facade {
    private HotelBooker hb;
    private FlightBooker fb;
    private LocalDate from, to;

    Facade(LocalDate from, LocalDate to){
        hb = new HotelBooker();
        fb = new FlightBooker();
        this.from = from;
        this.to = to;
    }

    void getFlightAndHotel(){
        ArrayList<Flight> fl1 = fb.getFlights(from, to);
        ArrayList<Hotel> hl1 = hb.getHotels(from, to);
        
        System.out.println("Flights:");
        for(Flight f : fl1){
            System.out.println(f);
        }
        
        System.out.println("Hotels: ");
        for(Hotel h : hl1){
            System.out.println(h);
        }

    }
}
