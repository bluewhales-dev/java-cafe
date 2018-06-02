package co.bluewhales.sample;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CarBuilderTest {

    List<String> stringList = Arrays.asList("red", "green", "black", "blue", "white", "gray");

    @org.junit.Test
    public void limit_car_maker_test() {
        System.out.println("limit_car_maker");
        List<Car> result = CarBuilder.limitCarMaker(stringList, 2);
        assertEquals(2, result.size());
    }

    @org.junit.Test
    public void test_sorted_notShortCircuiting() {
        System.out.println("sorted_notShortCircuiting");
        List<Car> result = CarBuilder
                .sortedCarMaker(stringList, 2);
        assertEquals(2, result.size());
    }

    @org.junit.Test
    public void test_sorted_functional_notShortCircuiting() {
        System.out.println("sorted_function");
        List<Car> result = CarBuilder
                .sortedCarMaker(stringList, 2);
        assertEquals(result.get(0).getColor(), "black");
    }

}