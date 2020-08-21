import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Try1Test {

    @Test
    public void method() {
       //тестовые данные
        Try1 try1 = new Try1();
        ArrayList<Integer> tst2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        // действие
        int actual = try1.method(tst2);
        int exp = 20;
        
        // сам тест
        assertEquals(actual,exp);
    }
}