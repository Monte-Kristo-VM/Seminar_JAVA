package OOPjavaSem5;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        MachineFactory car = new MachineFactory();
        System.out.println("Произведен автомобиль:");
        car.showCarInfo(car.produceMachine());
        System.out.println("\n");

        System.out.println("Магазин");
        ArrayList<Car> carList = Shop.carsList(5);
        for (int i = 0; i < carList.size(); i++) {
            carList.get(i).showCarInfo(carList.get(i));
        }
    }
}
