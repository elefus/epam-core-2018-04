package com.epam.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Task6 {

    /**
     * Ввести N слов с консоли.
     * Найти слово, буквы в котором идут в строгом порядке возрастания их кодов: word.charAt(i) < word.charAt(i + 1).
     * Если таких слов несколько, найти первое из них.
     * Слова состоящие из одного символа не учитывать.
     *
     * Формат входных данных:
     * N (целое число, 0 < N < 100) - количество слов в строке
     * Строка, содержащая нимимум N слов, разделенных пробелами
     *
     * Формат выходных данных:
     * В результате выполнения в выходной поток должно быть выведено слово, удовлетворяющее условию.
     * Если подходящее слово не найдено в выходной поток выводится строка "NOT FOUND"
     *
     * ---------------------------------------------------------------------------------------------------
     * Примеры выполнения задания:
     *
     * Входные данные:
     * 12
     * The original and reference implementation Java compilers were originally released by Sun
     *
     * Выходные данные:
     * by
     *
     * ===================================================================================================
     *
     * Входные данные:
     * 4
     * Кто-то позвонил в дверь
     *
     * Выходные данные:
     * NOT FOUND
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int lineNum = Integer.parseInt(br.readLine());
            List<String> words = Arrays.asList(br.readLine().split(" ")).subList(0, lineNum);
            outer: for(String word: words){
                if (word.length() > 1) {
                    int[] letters = word.chars().toArray();
                    int counter = 0;
                    while (counter < letters.length - 1) {
                        if (letters[counter] >= letters[counter + 1])
                            continue outer;
                        counter++;
                    }
                    System.out.println(word);
                    System.exit(0);
                }
            }
            System.out.println("NOT FOUND");

        } catch (NumberFormatException | IOException e){
            e.printStackTrace();
        }
    }
}
