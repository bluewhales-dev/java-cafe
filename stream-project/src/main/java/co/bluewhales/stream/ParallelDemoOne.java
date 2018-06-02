package co.bluewhales.stream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class ParallelDemoOne {


    private static final Log log = LogFactory.getLog(ParallelDemoOne.class);
    private static final NumberFormat formatter = new DecimalFormat("#,000,000.00");

    public static void main(String[] args) {
        CarStub carStub = new CarStub();

        // getting list of Car
        List<Car> carList = carStub.createList();
        ConcurrentMap<Character, List<Car>> byValue = carList.parallelStream()
                .collect(Collectors.groupingByConcurrent(Car::<Car>getCondition));
        byValue.forEach((key, value) -> {
            log.info("Car Condition- " + CarCondition.valueOf(key.toString()).url());

            value.forEach(v -> log.info(v.getName() + " (" + v.getCarId() + ") value LKR " + formatter
                    .format(v
                    .getValue())));
        });
    }


}
