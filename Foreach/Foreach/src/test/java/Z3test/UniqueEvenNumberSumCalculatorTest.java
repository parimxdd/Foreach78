package Z3test;
import org.example.Z3.UniqueEvenNumberSumCalculator;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class UniqueEvenNumberSumCalculatorTest{
    @Test
    public void testCalculateSum(){
        try {
            // Создаем экземпляр класса UniqueEvenNumberSumCalculator
            UniqueEvenNumberSumCalculator calculator = new UniqueEvenNumberSumCalculator();

            // Создаем список списков чисел для тестирования
            List<List<Integer>> lists = Arrays.asList(
                    Arrays.asList(1, 2, 3),
                    Arrays.asList(4, 5, 6),
                    Arrays.asList(7, 8, 9)
            );

            // Получаем ссылку на метод calculateSum с помощью рефлексии
            Method method = UniqueEvenNumberSumCalculator.class.getDeclaredMethod("calculateSum", List.class);

            // Делаем метод доступным для вызова, даже если он private
            method.setAccessible(true);

            // Вызываем метод calculateSum с помощью рефлексии на экземпляре calculator
            int result = (int) method.invoke(calculator, lists);

            // Проверяем результат
            assertEquals(20, result); // Ожидаемый результат: 2 + 4 + 6 + 8 = 20
        } catch (Exception e) {
            // Если возникло исключение, помечаем тест как проваленный
            org.junit.jupiter.api.Assertions.fail("Ошибка при тестировании метода: " + e.getMessage());
        }
    }
}
