package Lesson3;

import java.util.*;

public class Sem3homeWork {
    public static void main(String[] args) {
        deleteEvenNumbers();
        minMaxAverageOfList();
        deleteInteger();
    }



    /* 1. Пусть дан произвольный список целых чисел,
     удалить из него четные числа (в языке уже есть что-то готовое для этого)
    */
    private static void deleteEvenNumbers() {
        Random rnd = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            numbers.add(rnd.nextInt(20));
        }
        System.out.println("Задание №1");
        System.out.println("Список случайных чисел");
        System.out.println(numbers);
        System.out.println("Список после удаления четных чисел");
        numbers.removeIf(number -> number%2==0);
        System.out.println(numbers);
    }


    /* 2. Задан целочисленный список ArrayList.
      Найти минимальное, максимальное и среднее арифметическое из этого списка.
    */
    private static void minMaxAverageOfList() {
        Random rnd = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            numbers.add(rnd.nextInt(50));
        }
        System.out.println("\nЗадание №2");
        System.out.println("Список случайных чисел");
        System.out.println(numbers);
        System.out.println("Минимальный элемент = " + Collections.min(numbers));
        System.out.println("Максимальный элемент = " + Collections.max(numbers));
        //numbers.s;
        double sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.printf("Среднее арифметическое = %.2f%n",sum/numbers.size());
    }


    /* 3. Создать список типа ArrayList<String>.
      Поместить в него как строки, так и целые числа.
      Пройти по списку, найти и удалить целые числа.
    */
    private static void deleteInteger() {
        Random rnd = new Random();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            if (rnd.nextInt(2) == 0) {
                list.add(String.valueOf(rnd.nextInt(50)));
            } else {
                StringBuilder  str = new StringBuilder();
                for (int j = 0; j < rnd.nextInt(1, 6); j++) {
                    char c = (char) rnd.nextInt(97, 123);
                    str.append(c);
                }
                list.add(String.valueOf(str));
            }
        }
        System.out.println("\nЗадание №3");
        System.out.println("Исходный случайный список");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (isNumeric(list.get(i))){
                list.remove(i);
                i--;
            }
        }
        System.out.println("Cписок после удаления целых чисел");
        System.out.println(list);
    }


    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}




