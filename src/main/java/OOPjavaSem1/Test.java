package OOPjavaSem1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        Man man1 = new Man("Иванов Иван Сидорович", "01.01.1925", "03.05.1998",
                "-", "-", "-", "-");
        list.add(man1);
        Woman woman1 = new Woman("Иванова Лариса Александровна", "05.05.1928", "03.05.1998",
                "-", "-", "-", "-");
        list.add(woman1);
        System.out.println();
        Man man2 = new Man("Иванов Иван Иванович", "01.01.1950", "-",
                "Иванов Иван Сидорович", "01.01.1925",
                "Иванова Лариса Александровна", "05.05.1928");
        list.add(man2);
        Woman woman2 = new Woman("Иванова Ольга Ивановна", "09.09.1948", "-",
                "Иванов Иван Сидорович", "01.01.1925",
                "Иванова Лариса Александровна", "05.05.1928");
        list.add(woman2);
        findChildren(man1, (ArrayList) list);
        findChildren(woman1, (ArrayList) list);
        findChildren(man2, (ArrayList) list);
    }

    private static void findChildren(Human human, ArrayList list) {
        human.printInfo();
        System.out.println("Дети: ");
        int count =0;
        for (int i = 0; i < list.size(); i++) {
            if (human.FIO.equals(((Human) (list.get(i))).fatherFIO)&
                    human.birthday.equals(((Human) (list.get(i))).fatherBirthday)|
                    human.FIO.equals(((Human) (list.get(i))).motherFIO)&
                            human.birthday.equals(((Human) (list.get(i))).motherBirthday)) {
                System.out.println(((Human) (list.get(i))).FIO);
                count++;
            }
        }
        if (count == 0){
            System.out.println("Детей нет");
        }
        System.out.println();
    }
}
