package co.bluewhales.sample;

import org.junit.Test;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class TerminalOperationsTest {

    @Test
    public void terminal_operation_min() {
        OptionalInt minimum = IntStream.of(1, 2, 3).min();
        assertEquals(1,  minimum.getAsInt());
    }

    @Test
    public void terminal_operation_max() {

        OptionalDouble max = Stream.of(1d, 2d, 3d)
                .mapToDouble(Double::doubleValue).max();
        assertEquals(3, max.getAsDouble(), 0);
    }

    @Test
    public void terminal_operation_count() {

        long count = Stream.of("one").count();
        assertEquals(1, count);
    }

    @Test
    public void terminal_operation_anymatch() {

        boolean lengthOver5 = Stream.of("apple", "mango", "blackberry")
                .anyMatch(s -> s.length() > 8);
        assertTrue(lengthOver5);
    }

    @Test
    public void terminal_operation_findfirst() {

        Optional<String> val = Stream.of("one", "two").findFirst();
        assertEquals("one", val.get());
    }

    @Test
    public void terminal_operation_findany() {

        Optional<String> val = Stream.of("one", "two").findAny();
        assertEquals("one", val.get());
    }

}
