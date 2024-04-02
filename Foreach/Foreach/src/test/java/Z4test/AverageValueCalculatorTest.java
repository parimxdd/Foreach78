package Z4test;

import org.example.Z4.AverageValueCalculator;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageValueCalculatorTest {

    @Test
    public void testCalculateAverage(){
        try {
            // Создаем экземпляр класса AverageValueCalculator
            AverageValueCalculator calculator = new AverageValueCalculator();

            // Создаем список чисел для тестирования
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

            // Получаем ссылку на метод calculateAverage с помощью рефлексии
            Method method = AverageValueCalculator.class.getDeclaredMethod("calculateAverage", List.class);

            // Делаем метод доступным для вызова, даже если он private
            method.setAccessible(true);

            // Вызываем метод calculateAverage с помощью рефлексии на экземпляре calculator
            double result = (double) method.invoke(calculator, numbers);

            // Проверяем результат
            assertEquals(3.0, result); // Ожидаемый результат: (1 + 2 + 3 + 4 + 5) / 5 = 3.0
        } catch (Exception e) {
            // Если возникло исключение, помечаем тест как проваленный
            org.junit.jupiter.api.Assertions.fail("Ошибка при тестировании метода: " + e.getMessage());
        }
    }
}

