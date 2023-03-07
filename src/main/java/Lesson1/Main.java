package Lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printHello();
        inputAndPrintName();
        countMaxOne();
    }


    /*Дан массив двоичных чисел, например [1,1,1,1,0,1,1,1],
     вывести максимальное количество подряд идущих 1. */
    private static void countMaxOne() {
        int[] array = {1,1,1,1,1,1,0,1,0,1,1,1,1,1};
        int max = 0;
        int count = 0;
        for (int j : array) {
            if (j == 1) {
                count++;
                if (max < count) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.printf("Максимальное количество подряд идущих 1 равно %d", max);
    }



    private static void inputAndPrintName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.next();
        System.out.printf("Привет, %s!", name);
    }

    private static void printHello() {
        System.out.println("Привет!");
    }
}
