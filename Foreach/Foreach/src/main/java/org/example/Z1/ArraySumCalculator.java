package org.example.Z1;

//Задача: Вычисление суммы элементов массива
//
//Напишите программу, которая вычисляет сумму всех элементов массива и выводит ее на экран.










//hjk
//Решение
public class ArraySumCalculator {
    private int[] array;
    public ArraySumCalculator(int[] array) {
        this.array = array;
    }
    private int calculateSum() {
        int sum = 0;
        //foreach \/
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
    public void printSum() {
        System.out.println("Сумма элементов массива: " + calculateSum());
    }
    public int[] getArray() {
        return array;
    }
    public void setArray(int[] array) {
        this.array = array;
    }
}

