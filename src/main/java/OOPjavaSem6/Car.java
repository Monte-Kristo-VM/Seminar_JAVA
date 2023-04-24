package OOPjavaSem6;

public class Car<T> extends Cars {
    String engineType;
    double engineCapacity;
    T color;

    public Car(String manufacturer, String bodyType, String engineType, double engineCapacity, T color) {
        this.manufacturer = manufacturer;
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.engineCapacity = engineCapacity;
        this.color = color;
    }

    public Car() {
    }

    public void showCarInfo(Car car) {
        System.out.printf("%s, %s, %s, %s, цвет %s%n", car.manufacturer, car.bodyType,
                car.engineType, car.engineCapacity, car.color);
    }
}
