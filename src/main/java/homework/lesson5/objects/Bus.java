package homework.lesson5.objects;

public class Bus {
    private String model;
    private int countOfWheel;
    private Human human;
    private Dog dog;
    private Station station;


    public Bus(String model, int countOfWheel) {
        this.model = model;
        this.countOfWheel = countOfWheel;
    }

    public Bus(String model) {
        this.model = model;
    }

    public Bus(int countOfWheel) {
        this.countOfWheel = countOfWheel;
    }

    public String getBusModel() {
        return model;
    }

    public void setBusModel(String model) {
        this.model = model;
    }

    public int getBusCountOfWheel() {
        return countOfWheel;
    }

    public void setBusCountOfWheel(int countOfWheel) {
        this.countOfWheel = countOfWheel;
    }

    public void go(Station stationName) {
        station = stationName;
        if (getBusCountOfWheel() >= 4) {
            System.out.println("Автобус тронулся со станции:"+station.getStationName());
        } else {
            System.out.println("Нужно установить колеса, ждем!");
        }

    }

    public void stop(Station stationName) {
        station = stationName;
        if(stationName.equals(stationName.getStationName())){
            System.out.println("Конечная остановка!");
        }
        System.out.println("Автобус приехал на станцию: "+station.getStationName()+" Перерыв 10 минут!");
    }

    public void goOnTheBus(Human passageName, Dog dogName) {
        human = passageName;
        dog = dogName;
        if (human == null) {
            System.out.println("Собака не может зайти в автобус без человека!");
        } else if (dog == null){
            System.out.println("Пассажир: " +human.getHumanName()+" зашел!");
        }else {
            System.out.println("Пассажир: " +human.getHumanName()+" и собака: "+dog.getDogName()+" зашли в автобус!");
        }
    }

    public void goOffTheBus(Human passageName, Dog dogName){
        human = passageName;
        dog = dogName;
        if (human == null){
            System.out.println("Собака одан не может выйти с автобуса!");
        }
        else if (dog == null){
            System.out.println("Пассажир: "+human.getHumanName()+" вышел с автобуса");
        }else {
            System.out.println("Пассажир: "+human.getHumanName()+" и собака: "+dog.getDogName()+" вышли с автобуса!");
        }
    }


}
