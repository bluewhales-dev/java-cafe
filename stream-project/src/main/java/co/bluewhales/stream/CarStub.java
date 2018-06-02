package co.bluewhales.stream;

import java.util.Arrays;
import java.util.List;

public class CarStub {

    // Stub method to create list of Car objects
    protected List<Car> createList() {
        return Arrays.asList(new Car("CAS-0920", 5900000, "FIT", 'B', 0),
                new Car("CAH-0123", 6590000, "Prius", 'R', 75000),
                new Car("CAS-2515", 3500000, "Vitz", 'R', 9000),
                new Car("CAA-2957", 9800000, "Jeep", 'B', 0));

    }
}
