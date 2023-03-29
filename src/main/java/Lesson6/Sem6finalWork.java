package Lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class Sem6finalWork {
    public static void main(String[] args) {
        ArrayList<NoteBook> laptopList = laptopList();
        boolean flag = true;
        while (flag) {
            System.out.println("\n1. Показать все ноутбуки\n" +
                    "2. Ввести параметры для поиска\n" +
                    "3. Купить ноутбук\n" +
                    "4. Выход\n");
            System.out.print("Ваш выбор: ");
            Scanner in = new Scanner(System.in);
            String select = in.next();
            switch (select) {
                case "1":
                    showLaptopListAndPrice(laptopList);
                    break;
                case "2":
                    filterLaptop(laptopList);
                    break;
                case "3":
                    buyLaptop(laptopList);
                    break;
                case "4":
                    System.out.println("До встречи!");
                    flag = false;
                    break;
                default:
                    System.out.println("\nНеверный ввод.");
            }
        }
    }

    private static void filterLaptop(ArrayList<NoteBook> lapList) {
        System.out.println("Введите данные для поиска (производителя, диагональ, частоту процессора и т.д.): ");
        Scanner in = new Scanner(System.in);
        String findChoice = in.next();
        ArrayList<NoteBook> findLapList = new ArrayList<>();
        for (int i = 0; i < lapList.size(); i++) {
            if (isNumeric(findChoice)) {
                int intFindChoice = Integer.parseInt(findChoice);
                if (lapList.get(i).screenDiagonal == intFindChoice ||
                        lapList.get(i).numberOfCores == intFindChoice ||
                        lapList.get(i).processorFrequency == intFindChoice ||
                        lapList.get(i).sizeRAM == intFindChoice ||
                        lapList.get(i).sizeSSD == intFindChoice) {
                    findLapList.add(lapList.get(i));
                }
            } else if (lapList.get(i).manufacturerNotebook.equals(findChoice) ||
                    lapList.get(i).manufacturerProcessor.equals(findChoice) ||
                    lapList.get(i).color.equals(findChoice)) {
                findLapList.add(lapList.get(i));
            }
        }
        if (findLapList.size() > 0) {
            showLaptopListAndPrice(findLapList);
        } else {
            System.out.println("По вашему запросу ничего не найдено...");
        }
    }

    private static void buyLaptop(ArrayList<NoteBook> lapList) {
        showLaptopListAndPrice(lapList);
        System.out.println("Выберите номер ноутбука для покупки:");
        Scanner in = new Scanner(System.in);
        int choice = Integer.parseInt(in.next());
        System.out.println("Ваш выбор:");
        lapList.get(choice - 1).showLaptopConfigurationMax(lapList.get(choice - 1));
        System.out.printf("Цена = %s%n", lapList.get(choice - 1).priceLaptop(lapList.get(choice - 1)));
        System.out.printf("Покупаем?%n1. Да%n2. Еще подумаю...%nВаш выбор: ");
        String select = in.next();
        if (select.equals("1")) {
            lapList.remove(choice - 1);
            System.out.println("Поздравляем с успешной покупкой!");
        } else {
            System.out.println("Ждем вас снова!");
        }
    }

    private static void showLaptopListAndPrice(ArrayList<NoteBook> lapList) {
        for (int i = 0; i < lapList.size(); i++) {
            System.out.printf("%d. ", i + 1);
            lapList.get(i).showLaptopConfigurationMin(lapList.get(i));
            System.out.printf("Цена = %s%n", lapList.get(i).priceLaptop(lapList.get(i)));
        }
    }

    private static ArrayList<NoteBook> laptopList() {
        ArrayList<NoteBook> lapList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            NoteBook lap = new NoteBook();
            lapList.add(lap.randomLaptopConfiguration());
        }
        return lapList;
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
