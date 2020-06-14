package homework.lesson6;

import java.util.Objects;

public class Bus extends Auto {
    public int countOfPassengers;
    protected int maxPassenger = 25;

    /**
     * Конструктор класса Bus
     * @param producer
     * @param model
     * @param engineType
     * @param countOfPassengers
     */
    public Bus(String producer, String model, String engineType, int countOfPassengers) {
        super(producer, model, engineType);
        this.countOfPassengers = countOfPassengers;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    /**
     * Метод с логикой максимальной загрузки автобуса
     * @param peopleOnTheBoard
     */
    public void goOnTheBoard(int peopleOnTheBoard) {
        countOfPassengers = peopleOnTheBoard;
        if (countOfPassengers > maxPassenger) {
            System.out.println("Слишком много людей, автобус не поедет!");
        } else {
            System.out.println("Допустимое количество пассажиров набрано, автобус готов к отъзду!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return countOfPassengers == bus.countOfPassengers &&
                maxPassenger == bus.maxPassenger;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), countOfPassengers, maxPassenger);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "countOfPassengers=" + countOfPassengers +
                ", maxPassenger=" + maxPassenger +
                '}';
    }
}
