package org.example.Z5;

import java.util.List;


//Задача: Поиск наибольшего значения в списке.
//
// У вас есть список целых чисел.
// Необходимо найти наибольшее значение в этом списке.
// Используйте цикл foreach для перебора всех элементов списка и сравнения их с текущим максимальным значением.














//Решение
public class MaxValueFinder {
    private int findMaxValue(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("Список пуст");
        }
        //Даем переменной минимальное значение
        int maxValue = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
}
}
