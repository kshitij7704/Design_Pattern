import java.util.ArrayList;
import java.time.LocalDate;

public class FlightBooker {
    private ArrayList<Flight> fl = new ArrayList<>();

    FlightBooker(){
        fl.add(new Flight("AirIndia", LocalDate.of(2023, 12, 5)));
        fl.add(new Flight("SpiceJet", LocalDate.of(2023, 11, 15)));
        fl.add(new Flight("IndiGo", LocalDate.of(2023, 12, 25)));
        fl.add(new Flight("Vistara", LocalDate.of(2024, 1, 5)));
        fl.add(new Flight("GoAir", LocalDate.of(2024, 2, 10)));
        fl.add(new Flight("AirAsia", LocalDate.of(2023, 10, 20)));
    }

    ArrayList<Flight> getFlights(LocalDate from, LocalDate to){
        ArrayList<Flight> temp = new ArrayList<>();
        for(Flight f : fl){
            if((f.getDate().isEqual(from) || f.getDate().isAfter(from)) && (f.getDate().isEqual(to) || f.getDate().isBefore(to))){
                temp.add(f);
            }
        }
        return temp;
    }
}
