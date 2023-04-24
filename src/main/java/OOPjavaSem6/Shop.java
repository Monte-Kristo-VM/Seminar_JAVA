package OOPjavaSem6;

import java.util.ArrayList;

public class Shop extends MachineFactory {

    public static ArrayList<Car> carsList(int n) {
        ArrayList<Car> carList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            MachineFactory car = new MachineFactory();
            carList.add(car.produceMachine());
        }
        return carList;
    }

    public Shop() {
    }
}
