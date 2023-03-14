package Lesson4;

import java.util.*;

public class Sem4homeWork {
    public static void main(String[] args) {
        workWithStrings();
        linkedListReverse();
    }


    /*1. Реализовать консольное приложение, которое:
    Принимает от пользователя и “запоминает” строки.
    Если введено print, выводит строки так, чтобы последняя введенная
    была первой в списке, а первая - последней.
    Если введено revert, удаляет предыдущую введенную строку из памяти.
    */
    private static void workWithStrings() {
        List<String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("\nЗадание №1");
        System.out.println("Для выхода введите 'exit'");
        boolean flag = true;
        while (flag) {
            System.out.print("Введите строку: ");
            String userInput = in.next();
            if (userInput.equals("print")) {
                if (list.size() > 1) {
                    System.out.println("Исходный список:");
                    System.out.println(list);
                    System.out.println("Обработанный список:");
                    List<String> listPrint = new ArrayList<>(list);
                    listPrint.add(listPrint.get(0));
                    listPrint.remove(0);
                    listPrint.add(0, listPrint.get(listPrint.size() - 2));
                    listPrint.remove(listPrint.size() - 2);
                    System.out.println(listPrint);
                } else System.out.println("Недостаточно элементов");

            } else if (userInput.equals("revert")) {
                if (list.size() > 0) {
                    System.out.println("Исходный список:");
                    System.out.println(list);
                    System.out.println("Список после удаления последнего элемента:");
                    list.remove(list.size() - 1);
                    System.out.println(list);
                } else System.out.println("Список пуст");

            } else if (userInput.equals("exit")) {
                flag = false;
            } else
                list.add(userInput);
        }
    }

    /*2. Пусть дан LinkedList с несколькими элементами.
          Реализуйте метод, который вернет “перевернутый” список.
        */
    private static void linkedListReverse() {
        List<String> list = new LinkedList<>(Arrays.asList("dog", "cat", "123", "654"));
        List<String> reverseList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }
        System.out.println("\nЗадание №2");
        System.out.println("Исходный список:");
        System.out.println(list);
        System.out.println("'Перевернутый' список");
        System.out.println(reverseList);
    }

}
