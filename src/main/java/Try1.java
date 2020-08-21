import java.util.ArrayList;
import java.util.Arrays;
//1. Реализуйте метод, который на вход получает коллекцию
//целых чисел, а на выход выдаёт сумму всех четных чисел из коллекции.
//Напишите на него тесты с граничными значениями

public class Try1 {

    public static int method(ArrayList<Integer> numbers){
        int result=0;
        for (int i = 0; i <numbers.size() ; i++) {
            if(numbers.get(i)%2==0) {
                result += numbers.get(i);
            }
        }
        return result;


    }



}
