package Z2test;

import org.example.Z2.PositiveNumberSumCalculator;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositiveNumberSumCalculatorTest {

    @Test
    public void testCalculateSum() throws Exception{
        try {
        // Создаем список чисел для тестирования
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(-3);
        numbers.add(4);
        numbers.add(-5);
        PositiveNumberSumCalculator calculator = new PositiveNumberSumCalculator();


            // Получаем ссылку на метод calculateSum с помощью рефлексии
            Method method = PositiveNumberSumCalculator.class.getDeclaredMethod("calculateSum", List.class);

            // Делаем метод доступным для вызова, даже если он private
            method.setAccessible(true);

            // Вызываем метод calculateSum с помощью рефлексии и передаем ему список чисел
            int result = (int) method.invoke(calculator, numbers);

            // Проверяем результат
            assertEquals(7, result); // Ожидаемый результат: 1 + 2 + 4 = 7
        } catch (Exception e) {
            // Если возникло исключение, помечаем тест как проваленный
            org.junit.jupiter.api.Assertions.fail("Ошибка при тестировании метода: " + e.getMessage());
        }
    }
}

