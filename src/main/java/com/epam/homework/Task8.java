package com.epam.homework;

import java.util.*;

public class Task8 {

    /**
     * Ввести N слов с консоли.
     * Помимо обычных слов, во входной последовательности могут встречаться целые числа (в том числе большие чем Long.MAX_VALUE).
     * Среди них необходимо найти число-палиндром (одинаково читающееся в обоих направлениях).
     * Число, содержащее одну цифру также является палиндромом.
     * Если палиндромов во входной последовательности больше одного - найти второй уникальный из них.
     *
     * Формат входных данных:
     * N (целое число, 0 < N < 100) - количество слов в строке
     * Строка, содержащая минимум N слов, разделенных пробелами
     *
     * Формат выходных данных:
     * В результате выполнения в выходной поток должно быть выведено найденное число-палиндром.
     * В случае, если не найдено ни одного палиндрома - в поток должно быть выведено "NOT FOUND".
     *
     * ---------------------------------------------------------------------------------------------------
     * Пример выполнения задания:
     *
     * Входные данные:
     * 15
     * Chapter 11 describes exceptions, chapter 13 describes binary compatibility... chapter 22 presents a syntactic grammar
     *
     * Выходные данные:
     * 22
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countOfWords = Integer.parseInt(in.nextLine());
        LinkedHashSet<String> words = new LinkedHashSet<>();

        for (int i = 0; i < countOfWords; i++) {
            words.add(in.next());
        }
        String result = solve(words);
        System.out.println(result);
    }



    private static String solve(HashSet<String> words){
        LinkedHashSet<String> palindromesSet = new LinkedHashSet<>();
        for(String word : words){
            for(Character c: word.toCharArray()){
                if(!Character.isDigit(c)){
                       break;
                }
                String reverse = new StringBuffer(word).reverse().toString();
                if(word.equalsIgnoreCase(reverse)){
                    palindromesSet.add(word);
                }
            }
        }
        if(palindromesSet.size()>1){
            Iterator<String> iterator = palindromesSet.iterator();
            iterator.next();
            return iterator.next();

        }else {
            return "NOT FOUND";
        }
    }
}

