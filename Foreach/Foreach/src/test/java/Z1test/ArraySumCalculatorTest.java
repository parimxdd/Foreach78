package Z1test;

import org.example.Z1.ArraySumCalculator;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;


public class ArraySumCalculatorTest {

    @Test
    public void testCalculateSum(){
        try {

            // Создаем массив чисел
            int[] array = {1, 2, 3, 4, 5};

            // Создаем экземпляр класса ArraySumCalculator
            ArraySumCalculator calculator = new ArraySumCalculator(array);

            // Получаем ссылку на метод calculateSum с помощью рефлексии
            Method method = ArraySumCalculator.class.getDeclaredMethod("calculateSum");

            // Делаем метод доступным для вызова, даже если он private
            method.setAccessible(true);

            // Вызываем метод calculateSum с помощью рефлексии
            int result = (int) method.invoke(calculator);

            // Проверяем результат
            assertEquals(15, result);
        } catch (Exception e) {
            // Если возникло исключение, помечаем тест как проваленный
            org.junit.jupiter.api.Assertions.fail("Ошибка при тестировании метода: " + e.getMessage());
        }
    }
}

