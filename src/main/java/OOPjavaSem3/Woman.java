package OOPjavaSem3;

public class Woman extends Human {
    String gender = "женщина";

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(this.gender);
    }
}
