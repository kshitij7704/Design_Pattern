import java.time.LocalDate;

public class Hotel {
    private String name;
    private int hotelNumber;
    private LocalDate date;
    private static int numberGen = 1001;

    Hotel(String name, LocalDate date){
        this.name = name;
        this.date = date;
        this.hotelNumber = numberGen;
        numberGen++;
    }

    public LocalDate getDate(){
        return date;
    }

    @Override
    public String toString(){
        return name + " [" + hotelNumber + " | " + date + "] ";
    }
}
