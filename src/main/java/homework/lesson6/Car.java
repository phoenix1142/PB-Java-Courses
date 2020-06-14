package homework.lesson6;

import java.util.Objects;

public class Car extends Auto {
    protected int maxTankVolume = 30;
    public int fuelUp;

    /**
     * Конструктор класса Car
     * @param producer
     * @param model
     * @param engineType
     * @param fuelUp
     */
    public Car(String producer, String model, String engineType, int fuelUp) {
        super(producer, model, engineType);
        this.fuelUp = fuelUp;
    }

    public int getFuelUp() {
        return fuelUp;
    }

    public void setFuelUp(int fuelUp) {
        this.fuelUp = fuelUp;
    }

    /**
     * Метод заправки машины
     * @param fuelUp
     */
    public void fuelUpTank(int fuelUp){
        this.fuelUp = fuelUp;
        System.out.println("Бак машины заправили на "+ fuelUp);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return maxTankVolume == car.maxTankVolume &&
                fuelUp == car.fuelUp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxTankVolume, fuelUp);
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxTankVolume=" + maxTankVolume +
                ", fuelUp=" + fuelUp +
                '}';
    }
}
