import java.util.ArrayList;
import java.util.Collection;
//1. Реализуйте метод, который на вход получает коллекцию
//целых чисел, а на выход выдаёт сумму всех четных чисел из коллекции.
//Напишите на него тесты с граничными значениями

public class EvenNumberAggregator {

    public int aggregateAllEven(Collection<Integer> numbers) {
        int result = 0;

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                result += number;
            }
        }
        return result;
    }
}
