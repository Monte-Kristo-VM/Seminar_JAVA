package Lesson1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Sem1homeWork {
    public static void main(String[] args) {
        minMaxInArray();
        System.out.println(checkLeapYear());
        findAndMoveNumberToTheEndOfArray();
    }


    /* 1. Задать одномерный массив и найти в нем
      минимальный и максимальный элементы*/
    private static void minMaxInArray() {
        System.out.println("Задание №1");
        int[] array = {5, 3, 34, 45, 1, 5, 76, 145, 2, 13, 28};
        int max = array[0];
        int min = array[0];
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            } else if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.printf("Максимальный элемент массива = %d", max);
        System.out.printf("\nМиниимальный элемент массива = %d\n", min);
    }


    /*2. Написать метод, который определяет, является ли год високосным,
     и возвращает boolean (високосный - true, не високосный - false).
     Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    private static boolean checkLeapYear() {
        System.out.println("\nЗадание №2");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = Integer.parseInt(in.next());
        if ((year % 4 == 0 & year % 100 != 0) | year % 400 == 0)
            return true;
        else return false;
    }


    /*3. Дан массив nums = [3,2,2,3] и число val = 3.
         Если в массиве есть числа, равные заданному,
         нужно перенести эти элементы в конец массива.
         Таким образом, первые несколько (или все) элементов
         массива должны быть отличны от заданного, а остальные - равны ему.*/
    private static void findAndMoveNumberToTheEndOfArray() {
        System.out.println("\nЗадание №3");
        Random r = new Random();
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = Integer.parseInt(in.next());
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=number){
                sb.append(array[i]);
            }
            else count++;
        }
        for (int i = 0; i < count; i++) {
            sb.append(number);
        }
        for (int i = 0; i < array.length; i++) {
            array[i]=Character.digit(sb.charAt(i), 10);
        }
        System.out.println(sb);
        System.out.println(Arrays.toString(array));
    }
}