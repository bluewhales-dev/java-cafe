package co.bluewhales.sample;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IntermediateOperationsTest {


    @Test
    public void intermediate_filter() {
        long elementsLessThanThree = Stream.of(1, 2, 3, 4)
                .filter(p -> p.intValue() > 3)
                .peek(s -> System.out.println(s))
                .count();

        assertEquals(1, elementsLessThanThree);
    }

    @Test
    public void intermediate_peek() {
        List<String> stringList = Arrays.asList("red", "green", "black", "blue", "white", "gray");
        List<String> strings = stringList.stream()
                .filter(s -> s.length() >= 2).peek(s -> System.out.println(s))
                .map(s -> s.toUpperCase()).collect(Collectors.toList());

        assertTrue(strings.contains("BLUE"));
    }

    @Test
    public void intermediate_map() {
        List<String> expected = Arrays.asList("one", "[unknown]", "three");
        List<String> strings = Stream.of("one", null, "three").map(s -> {
            if (s == null)
                return "[unknown]";
            else
                return s;
        }).collect(Collectors.toList());
        assertThat(strings, is(expected));

    }

    @Test
    public void count_distinct_words_java8() throws IOException {
        File file = new File("src\\main\\resources\\test.txt");
        long uniqueWords = java.nio.file.Files
                .lines(Paths.get(file.toURI()), Charset.defaultCharset())
                .flatMap(line -> Arrays.stream(line.split(" ."))).distinct()
                .count();

        assertEquals(4, uniqueWords);
    }

    @Test
    public void intermediate_distinct() {
        List<Integer> expected = Arrays.asList(5, 6, 3, 2);
        List<Integer> distinctIntegers = IntStream.of(5, 6, 6, 6, 3, 2, 2)
                .distinct()
                .boxed()
                .collect(Collectors.toList());

        assertEquals(4, distinctIntegers.size());
        assertThat(distinctIntegers, is(expected));
    }
}
