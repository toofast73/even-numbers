
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EvenNumberAggregatorTest {

    @ParameterizedTest
    @MethodSource("data")
    public void basicTest(Collection<Integer> data, int expected) {
       //тестовые данные
        EvenNumberAggregator evenNumberAggregator = new EvenNumberAggregator();

        // действие
        int actual = evenNumberAggregator.aggregateAllEven(data);
        
        // сам тест
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> data(){
        return Stream.of(
                //basic
                Arguments.of(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8), 20),
                //works not only with lists
                Arguments.of(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)), 20),
                //only odd numbers
                Arguments.of(Arrays.asList(1, 3, 5), 0),
                //negatives
                Arguments.of(Arrays.asList(2, -2, -4), -4),
                //empty collection
                Arguments.of(new ArrayList<>(), 0)
                );
    }


}