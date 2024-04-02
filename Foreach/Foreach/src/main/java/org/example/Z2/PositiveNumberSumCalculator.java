package org.example.Z2;
import java.util.List;



//Задача: Подсчёт суммы положительных чисел в списке.
//
//У вас есть список целых чисел, и вам нужно посчитать сумму всех положительных чисел в этом списке.
// Используйте цикл foreach, чтобы перебрать все элементы списка и сложить только положительные числа.












//Решение




public class PositiveNumberSumCalculator {
    private int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number > 0) {
                sum += number;
            }
        }
        return sum;
    }
}
