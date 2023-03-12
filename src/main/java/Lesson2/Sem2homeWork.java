package Lesson2;

import java.io.FileWriter;

public class Sem2homeWork {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        System.out.println(isPolyndrome("asdrdsa")?"Это палиндром":"Это не палиндром");
        System.out.println("Задание №2");
        StringBuilder sbTest = Test();
        writeToFile(sbTest);
    }


    /*
    1. Напишите метод, который принимает на вход строку (String)
       и определяет является ли строка палиндромом (возвращает boolean значение).
    */
    public static boolean isPolyndrome(String str){

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }


    /*
      2. Напишите метод, который составит строку,
         состоящую из 100 повторений слова TEST и метод,
         который запишет эту строку в простой текстовый файл,
         обработайте исключения.
    */
    public static StringBuilder Test(){
        StringBuilder sb = new StringBuilder();
        sb.append("TEST".repeat(100));
        return sb;
    }

    public static void writeToFile(StringBuilder sb){
        try {
            FileWriter f1 = new FileWriter("test.txt");
            f1.write(String.valueOf(sb));
            f1.flush();
            System.out.println("Файл записан");
        }catch (Exception e){
            System.out.println("FAIL");
        }
    }
}

