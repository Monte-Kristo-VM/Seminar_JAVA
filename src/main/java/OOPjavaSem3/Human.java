package OOPjavaSem3;

import java.util.ArrayList;

abstract class Human implements FamilyTree, FamilyTies {

    protected String FIO;
    protected String birthday;
    protected String die;
    protected String fatherFIO;
    protected String fatherBirthday;
    protected String motherFIO;
    protected String motherBirthday;

    @Override
    public void Children(ArrayList list) {
        this.printInfo();
        System.out.println("Дети: ");
        int count =0;
        for (int i = 0; i < list.size(); i++) {
            if (this.FIO.equals(((Human) (list.get(i))).fatherFIO)&
                    this.birthday.equals(((Human) (list.get(i))).fatherBirthday)|
                    this.FIO.equals(((Human) (list.get(i))).motherFIO)&
                            this.birthday.equals(((Human) (list.get(i))).motherBirthday)) {
                System.out.println(((Human) (list.get(i))).FIO);
                count++;
            }
        }
        if (count == 0){
            System.out.println("Детей нет");
        }
        System.out.println();
    }

    @Override
    public void AddHumanInfo(String FIO, String birthday, String die) {
        this.FIO = FIO;
        this.birthday = birthday;
        this.die = die;
    }

    @Override
    public void AddParentsInfo(String fatherFIO, String fatherBirthday,
                               String motherFIO, String motherBirthday) {
        this.fatherFIO = fatherFIO;
        this.fatherBirthday = fatherBirthday;
        this.motherFIO = motherFIO;
        this.motherBirthday = motherBirthday;
    }

    public void printInfo(){
        System.out.println(this.FIO);
        System.out.println(this.birthday);
    }
}
