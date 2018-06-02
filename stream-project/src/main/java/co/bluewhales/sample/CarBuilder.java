package co.bluewhales.sample;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarBuilder {

    public static List<Car> limitCarMaker(List<String> stringList,
                                          int limit) {
        return stringList.stream()
                .map(Car::new)
                .limit(limit)
                .collect(Collectors.toList());
    }

    public static List<Car> sortedCarMaker(
            List<String> stringList, int limit) {
        return stringList.stream()
                .map(Car::new)
                .sorted(Comparator.comparing(Car::getColor))
                .limit(limit)
                .collect(Collectors.toList());
    }
}
