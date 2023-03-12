package Lesson2;

import java.util.Scanner;

public class Sem2 {
    public static void main(String[] args) {
        System.out.print(build());
        System.out.print(letterCount());
    }

    /*Задание №1
    Дано четное число N (>0) и символы c1 и c2.
      Написать метод, который вернет строку длины N,
      которая состоит из чередующихся символов c1 и c2, начиная с c1.
    */
    public static StringBuilder build(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int limit  = in.nextInt();
        System.out.print("Введите первый элемент: ");
        String first = in.next();
        System.out.print("Введите второй элемент: ");
        String second = in.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < limit; i++) {
            sb.append((i % 2 == 0) ? first : second);
        }
        return sb;
    }


    /* Задание №2
        Напишите метод, который сжимает строку.
        Пример: вход aaaabbbcdd.
    */
    public static StringBuilder letterCount(){
        StringBuilder sb = new StringBuilder();
        String str = "aaaabbbcddeeef";
        int count = 1;
        for (int i = 0; i < str.length()- 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)){
                count++;
            }else {
                if ((count == 1)) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append(str.charAt(i)).append(count);
                }
                count = 1;
            }
        }
        if ((count == 1)) {
            sb.append(str.charAt(str.length()-1));
        } else {
            sb.append(str.charAt(str.length()-1)).append(count);
        }
        return  sb;
    }
}
