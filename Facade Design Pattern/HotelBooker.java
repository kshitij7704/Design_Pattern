import java.util.ArrayList;
import java.time.LocalDate;

public class HotelBooker {
    private ArrayList<Hotel> hl = new ArrayList<>();

    HotelBooker(){
        hl.add(new Hotel("Taj", LocalDate.of(2023, 3, 7)));
        hl.add(new Hotel("Oberoi", LocalDate.of(2023, 4, 10)));
        hl.add(new Hotel("Hyatt", LocalDate.of(2023, 5, 15)));
        hl.add(new Hotel("Marriott", LocalDate.of(2023, 6, 20)));
        hl.add(new Hotel("ITC Grand", LocalDate.of(2024, 1, 15)));
        hl.add(new Hotel("Leela Palace", LocalDate.of(2023, 8, 30)));
    }

    ArrayList<Hotel> getHotels(LocalDate from, LocalDate to){
        ArrayList<Hotel> temp = new ArrayList<>();
        for(Hotel h : hl){
            if((h.getDate().isEqual(from) || h.getDate().isAfter(from)) && (h.getDate().isEqual(to) || h.getDate().isBefore(to))){
                temp.add(h);
            }
        }
        return temp;
    }
}
