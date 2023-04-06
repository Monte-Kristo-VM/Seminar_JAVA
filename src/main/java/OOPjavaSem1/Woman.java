package OOPjavaSem1;

public class Woman extends Human {
    String gender;

    public Woman(String FIO, String birthday, String die, String fatherFIO, String fatherBirthday,
               String motherFIO, String motherBirthday) {
        super(FIO, birthday, die, fatherFIO, fatherBirthday, motherFIO, motherBirthday);
        this.gender = "женщина";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(this.gender);
    }
}
