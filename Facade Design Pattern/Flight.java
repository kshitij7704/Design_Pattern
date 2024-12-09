import java.time.LocalDate;

public class Flight {
    private String name;
    private int flightNumber;
    private LocalDate date;
    private static int numberGen = 7001;

    Flight(String name, LocalDate date){
        this.name = name;
        this.date = date;
        this.flightNumber = numberGen;
        numberGen++;
    }

    public LocalDate getDate(){
        return date;
    }

    @Override
    public String toString(){
        return name + " [" + flightNumber + " | " + date + "] ";
    }
}
