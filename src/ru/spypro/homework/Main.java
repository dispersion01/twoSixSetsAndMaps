package ru.spypro.homework;

import java.util.*;

import static javax.swing.UIManager.put;

public class Main {

    public static void main(String[] args) {
        // write your code here


        System.out.println("Задание 1");
        unevenNumbers();
        System.out.println();
        System.out.println("Задание 2");
        evenNumber();
        System.out.println();
        System.out.println("Задание 3");
        uniqueWords();
        System.out.println();
        System.out.println("Задание 4");
        duplicateWords();
    }

    public static void unevenNumbers() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.print("Четные числа: ");
        for (int i = 0; i < nums.size(); i++) {

            if (nums.get(i) % 2 == 0 && nums.get(i) != 0) {

                if (nums.get(i) < nums.size()) {
                    System.out.print(nums.get(i) + ",");
                } else {
                    System.out.print(nums.get(i) + " ");
                }
            }
        }
    }

    public static void evenNumber() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.print("Нечетные числа: ");
        for (int i = 0; i < nums.size(); i++) {

            if (nums.get(i) % 2 != 0) {

                if (nums.get(i) < nums.size()) {
                    System.out.print(nums.get(i) + ",");
                } else {
                    System.out.print(nums.get(i) + " ");
                }
            }
        }
    }

    public static void uniqueWords() {
        Set<String> wordsSet = new HashSet<>(List.of("Первое слово", "Второе слово", "Первое слово", "Третье слово"));
        System.out.println("Вывод только уникальных слов" + wordsSet);
    }

    public static void duplicateWords() {
//        Set<String> wordsSet = new HashSet<>(List.of("Первое слово", "Второе слово", "Первое слово", "Третье слово"));
        Map<String, String> wordsSet = new  HashMap<>();
        {
            put("Слово один", "первый");
            put("Слово два", "второй");
            put("Слово один", "первый");
            put("Слово третье", "третий");
        }
        for (Map.Entry<String, String> dupeWords : wordsSet.entrySet()) {
            System.out.println("Всего дубликатов: " + dupeWords.getValue());
        }
    }
}
