package OOPjavaSem2;

public class Man extends Human{
    String gender = "мужчина";

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(this.gender);
    }
}
