package com.epam.homework;

import java.util.Scanner;

public class Task10 {

    /**
     * Ввести число с консоли.
     * С помощью битовых, логических и арифметических операций определить, является ли указанное значение степенью двойки.
     *
     * Формат входных данных:
     * value - целое число (Integer.MIN_VALUE <= value <= Integer.MAX_VALUE)
     *
     * Формат выходных данных:
     * YES - число является степенью двойки
     * NO - число не является степенью двойки
     *
     * ---------------------------------------------------------------------------------------------------
     * Примеры выполнения задания:
     *
     * Входные данные:
     * -128
     *
     * Выходные данные:
     * NO
     *
     *
     * Входные данные:
     * 256
     *
     * Выходные данные:
     * YES
     */
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            int number = reader.nextInt();

            if (isPowerOf2(number)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean isPowerOf2(int number) {
        if (number <= 0) {
            return false;
        }

        while (number % 2 == 0) {
            number >>>= 1;
        }

        return number == 1;
    }
}
