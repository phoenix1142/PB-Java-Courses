package homework.lesson6;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("bmw", "x6", "Medium");
        Bus bus = new Bus("Bogdan", "Bogdan1", "Big", 15);
        Car car = new Car("Skoda", "Fabia", "Medium", 20);
        Truck truck = new Truck("Daf", "Daf1", "Big", 15);

        auto.start();
        bus.goOnTheBoard(25);
        car.fuelUpTank(15);
        truck.addTransferProduct(20);

// метод рефлексии
        Class<Auto> autoClass = Auto.class;
        Field[] declaredFields = autoClass.getDeclaredFields();
        for (Field field :declaredFields) {
            System.out.println(field);
        }
    }

    }

