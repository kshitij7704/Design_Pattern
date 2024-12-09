import java.time.LocalDate;

public class TestDrive {
    public static void main(String[] args) {
        Facade facade = new Facade(LocalDate.of(2024, 1, 1), LocalDate.of(2024, 2, 25));
        facade.getFlightAndHotel();
    }
}
