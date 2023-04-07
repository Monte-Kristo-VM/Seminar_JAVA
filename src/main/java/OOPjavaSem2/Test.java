package OOPjavaSem2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Man man1 = new Man();
        man1.AddHumanInfo("Иванов Иван Сидорович","01.01.1925", "03.05.1998");
        man1.AddParentsInfo("-", "-", "-", "-");
        Man man2 = new Man();
        man2.AddHumanInfo("Иванов Иван Иванович", "01.01.1950", "-");
        man2.AddParentsInfo("Иванов Иван Сидорович", "01.01.1925",
                "Иванова Лариса Александровна", "05.05.1928");
        Woman woman1 = new Woman();
        woman1.AddHumanInfo("Иванова Лариса Александровна", "05.05.1928", "03.05.1998");
        woman1.AddParentsInfo("-", "-", "-", "-");
        Woman woman2= new Woman();
        woman2.AddHumanInfo("Иванова Ольга Ивановна", "09.09.1948", "-");
        woman2.AddParentsInfo("Иванов Иван Сидорович", "01.01.1925",
                "Иванова Лариса Александровна", "05.05.1928");

        List list = new ArrayList();
        list.add(man1);
        list.add(man2);
        list.add(woman1);
        list.add(woman2);
        man1.Children((ArrayList) list);
        woman1.Children((ArrayList) list);
        man2.Children((ArrayList) list);
    }
}
