package OOPjavaSem5;

import java.util.Random;

public class MachineFactory implements Factory {

    public MachineFactory() {
    }

    @Override
    public Car produceMachine() {

        String[] manufacturerCar = {"AUDI", "BMW", "CITROEN", "JEEP", "VAZ", "VW"};
        String[] bodyTypeCar = {"sedan", "hatchback", "wagon", "liftback"};
        String[] engineTypeCar = {"gasoline", "diesel", "gas"};
        Double[] engineCapacityCar = {1.4, 1.6, 1.8, 2.0, 2.5};
        String[] colorCarStr = {"Серое плато", "Снежная королева", "Робин Гуд", "Мурена"};
        Integer[] colorCarInt = {240, 245, 290, 295};

        Random rnd = new Random();
        Car car;
        if (rnd.nextInt(2) == 0) {
            car = new Car<>(manufacturerCar[rnd.nextInt(manufacturerCar.length)],
                    bodyTypeCar[rnd.nextInt(bodyTypeCar.length)],
                    engineTypeCar[rnd.nextInt(engineTypeCar.length)],
                    engineCapacityCar[rnd.nextInt(engineCapacityCar.length)],
                    colorCarStr[rnd.nextInt(colorCarStr.length)]);
        } else {
            car = new Car<>(manufacturerCar[rnd.nextInt(manufacturerCar.length)],
                    bodyTypeCar[rnd.nextInt(bodyTypeCar.length)],
                    engineTypeCar[rnd.nextInt(engineTypeCar.length)],
                    engineCapacityCar[rnd.nextInt(engineCapacityCar.length)],
                    colorCarInt[rnd.nextInt(colorCarInt.length)]);
        }
        return car;
    }

    public void showCarInfo(Car car) {
        System.out.printf("%s, %s, %s, %s, цвет %s", car.manufacturer, car.bodyType,
                car.engineType, car.engineCapacity, car.color);
    }
}
