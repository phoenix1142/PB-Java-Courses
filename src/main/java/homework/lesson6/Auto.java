package homework.lesson6;

import java.util.Objects;

public class Auto {
    private String producer;
    private String model;
    private String engineType;
    private int currentSpeed;
    private boolean isRunning;
    private String abcd;

    /**
     *  Конструктор главного класса Auto
     * @param producer
     * @param model
     * @param engineType
     */
    public Auto(String producer, String model, String engineType) {
        this.producer = producer;
        this.model = model;
        this.engineType = engineType;
    }


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }


    public void start(){
        System.out.println("Машина поехала!");
    }

    public void stop(){
        System.out.println("Машина остановилась");
    }

    /**
     * Метод увеличения скорости машины
     * @param kmPerHour
     * @return
     */
    public int accelerate( int kmPerHour){
    currentSpeed += kmPerHour;
    return currentSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return producer.equals(auto.producer) &&
                model.equals(auto.model) &&
                engineType.equals(auto.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, engineType);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
