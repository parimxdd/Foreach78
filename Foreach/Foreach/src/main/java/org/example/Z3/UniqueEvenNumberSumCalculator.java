package org.example.Z3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


//Задача: Подсчет суммы уникальных четных чисел в списке списков.
//
//У вас есть список списков целых чисел.
// Вам нужно найти сумму всех уникальных четных чисел из всех списков в этом списке списков.
// Используйте цикл foreach для перебора всех списков и их элементов, а также HashSet для хранения уникальных четных чисел.














//Решение
public class UniqueEvenNumberSumCalculator {
    private int calculateSum(List<List<Integer>> lists) {
        Set<Integer> uniqueEvenNumbers = new HashSet<>();

        for (List<Integer> list : lists) {
            for (int number : list) {
                if (number % 2 == 0) {
                    uniqueEvenNumbers.add(number);
                }
            }
        }

        int sum = 0;
        for (int number : uniqueEvenNumbers) {
            sum += number;
        }

        return sum;
    }
}
//В этой задаче мы используем два вложенных цикла foreach:
// первый для перебора всех списков в списке списков,
// а второй для перебора всех элементов в каждом списке.
// Мы проверяем каждое число на четность и добавляем его в HashSet только в случае, если оно четное и еще не встречалось ранее.
// В конце мы просто суммируем все уникальные четные числа из HashSet.