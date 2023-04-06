package OOPjavaSem1;

public class Man extends Human{
    String gender;

    public Man(String FIO, String birthday, String die, String fatherFIO, String fatherBirthday,
               String motherFIO, String motherBirthday) {
        super(FIO, birthday, die, fatherFIO, fatherBirthday, motherFIO, motherBirthday);
        this.gender = "мужчина";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(this.gender);
    }
}
