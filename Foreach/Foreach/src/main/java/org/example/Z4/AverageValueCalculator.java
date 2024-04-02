package org.example.Z4;

import java.util.List;



//Задача: Поиск среднего значения в списке целых чисел.
//
//У вас есть список целых чисел. Необходимо найти среднее значение всех чисел в списке.
// Используйте цикл foreach, чтобы перебрать все элементы списка и вычислить среднее значение.











//Решение
public class AverageValueCalculator {
    private double calculateAverage(List<Integer> numbers) {
        int totalSum = 0;

        for (int num : numbers) {
            totalSum += num;
        }

        if (numbers.isEmpty()) {
            return 0; // Возвращаем 0, если список пуст
        }

        return (double) totalSum / numbers.size();
}
}
