package OOPjavaSem4;

public class Address<T, V> {
    String town;
    String street;
    T numberOfHouse;
    V numberOfFlat;

    public Address(String town, String street, T numberOfHouse, V numberOfFlat) {
        this.town = town;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
        this.numberOfFlat = numberOfFlat;
    }

    public void showAddress() {
        System.out.print("\n" + this.town);
        System.out.print(" улица " + this.street);
        System.out.print(" дом " + this.numberOfHouse);
        System.out.print(" квартира № " + this.numberOfFlat);
    }
}
