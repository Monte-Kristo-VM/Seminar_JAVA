package Lesson5;

import java.util.*;

public class Sem5homeWork {
    public static Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        starMenu();
        doubleNameInList();
    }


    /*1. Реализуйте структуру телефонной книги с помощью HashMap,
         учитывая, что 1 человек может иметь несколько телефонов.
    */
    private static void initPhoneBook() {
        phoneBook.put("Иванов Иван", new ArrayList<>(Arrays.asList("+7925152246", "88634589645")));
        phoneBook.put("Петрова Светлана", new ArrayList<>(Arrays.asList("+7988852245", "88611119645", "23445566789")));
        phoneBook.put("Сидоров Кирилл", new ArrayList<>(Arrays.asList("+7566552456", "89812589645")));
        phoneBook.put("Иванова Елена", new ArrayList<>(Arrays.asList("89812589645")));
    }

    private static void starMenu() {
        System.out.println("\nЗадание №1");
        System.out.println("\nРабота с телефонной книгой");
        initPhoneBook();
        boolean flag = true;
        while (flag) {
            System.out.println("\n1. Показать телефонную книгу\n" +
                    "2. Добавить контакт\n" +
                    "3. Удалить контакт\n" +
                    "4. Выход\n");
            System.out.print("Ваш выбор: ");
            Scanner in = new Scanner(System.in);
            String select = in.next();
            switch (select) {
                case "1":
                    showPhoneBook();
                    break;
                case "2":
                    addContact();
                    break;
                case "3":
                    deleteContact();
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

    private static void deleteContact() {
        List<String> numbersKey = showPhoneBook();
        System.out.print("\nВведите порядковый номер контакта, который хотите удалить?\nВаш выбор: ");
        Scanner in = new Scanner(System.in);
        int select = in.nextInt();
        phoneBook.remove(numbersKey.get(select - 1));
        System.out.println("\nКонтакт успешно удален!");
    }

    private static void addContact() {
        System.out.print("Введите фамилию и имя нового контакта: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        List<String> phoneNumbers = new ArrayList<>();
        System.out.print("Сколько номеров телефона вы хотите ввести? ");
        int numbers = in.nextInt();
        if (numbers == 1) {
            System.out.printf("Введите номер телефона: ");
            phoneNumbers.add(in.next());
        } else {
            for (int i = 0; i < numbers; i++) {
                System.out.printf("Введите %d номер телефона: ", i + 1);
                phoneNumbers.add(in.next());
            }
        }
        phoneBook.put(name, (ArrayList<String>) phoneNumbers);
        System.out.println("Контакт успешно добавлен!");
    }

    private static ArrayList<String> showPhoneBook() {
        System.out.println("\nТелефонная книга:");
        int count = 1;
        List<String> numbersKey = new ArrayList<>();
        for (String key : phoneBook.keySet()) {
            numbersKey.add(key);
            System.out.printf("%d. %s : ", count++, key);
            for (String phone : phoneBook.get(key)) {
                System.out.printf("[%s] ", phone);
            }
            System.out.println();
        }
        return (ArrayList<String>) numbersKey;
    }



    /* 2. Пусть дан список сотрудников:
    Иван Иванов
    Светлана Петрова
    Кристина Белова
    Анна Мусина
    Анна Крутова
    Иван Юрин
    Петр Лыков
    Павел Чернов
    Петр Чернышов
    Мария Федорова
    Марина Светлова
    Мария Савина
    Мария Рыкова
    Марина Лугова
    Анна Владимирова
    Иван Мечников
    Петр Петин
    Иван Ежов
    Написать программу,
    которая найдёт и выведет повторяющиеся имена с количеством повторений.
    Отсортировать по убыванию популярности.
*/

    private static void doubleNameInList() {
        ArrayList<String> listWorker = new ArrayList<>(Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"));
        System.out.println("\nЗадание №2");
        Map<String, Integer> countName = countNames(listWorker);
        sortDoubleNames(countName);
    }


    private static Map<String, Integer> countNames(ArrayList<String> listWorker) {
        Map<String, Integer> countName = new HashMap<>();
        for (int i = 0; i < listWorker.size(); i++) {
            String name = Arrays.toString(new String[]{(listWorker.get(i).split(" "))[0]});
            if (countName.containsKey(name)) {
                countName.put(name, countName.get(name) + 1);
            } else {
                countName.put(name, 1);
            }
        }
        return countName;
    }

    private static void sortDoubleNames(Map<String, Integer> mapCountNames) {
        Map<String, Integer> doubleNames = new HashMap<>();
        ArrayList<Integer> count = new ArrayList<>();
        for (String key : mapCountNames.keySet()) {
            if (!mapCountNames.get(key).equals(1)) {
                doubleNames.put(key, mapCountNames.get(key));
                if (!count.contains(mapCountNames.get(key))) {
                    count.add(mapCountNames.get(key));
                }
            }
        }
        Collections.sort(count);
        Collections.reverse(count);
        for (int i = 0; i < count.size(); i++) {
            for (String key : doubleNames.keySet()) {
                if (doubleNames.get(key).equals(count.get(i))) {
                    System.out.printf("Имя %s встречается %d раз(а)\n", key, count.get(i));
                }
            }
        }
    }
}


