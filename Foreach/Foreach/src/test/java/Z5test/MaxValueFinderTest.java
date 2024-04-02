package Z5test;

import org.example.Z5.MaxValueFinder;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxValueFinderTest {

    @Test
    public void testFindMaxValueWithReflection() {
        try {
            // Создаем экземпляр класса MaxValueFinder
            MaxValueFinder finder = new MaxValueFinder();

            // Создаем список чисел для тестирования
            List<Integer> numbers = Arrays.asList(1, 3, 2, 5, 4);

            // Получаем ссылку на метод findMaxValue с помощью рефлексии
            Method method = MaxValueFinder.class.getDeclaredMethod("findMaxValue", List.class);

            // Делаем метод доступным для вызова, даже если он private
            method.setAccessible(true);

            // Вызываем метод findMaxValue с помощью рефлексии на экземпляре finder
            int result = (int) method.invoke(finder, numbers);

            // Проверяем результат
            assertEquals(5, result); // Ожидаемый результат: максимальное значение 5
        } catch (Exception e) {
            // Если возникло исключение, помечаем тест как проваленный
            org.junit.jupiter.api.Assertions.fail("Ошибка при тестировании метода: " + e.getMessage());
        }
    }
}

