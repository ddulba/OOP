package pl.javapoz25;

public abstract class Car {

    private String producer;
    private String model;
    private String color;
    private Integer seatsNumber;
    private Engine engine;

    public Car() {
        this.seatsNumber = 2;
    }

    public Car(String producer, String model, String color, Integer seatsNumber, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.seatsNumber = seatsNumber;
        this.engine = engine;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getSeatsNumber() {
        return seatsNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSeatsNumber(Integer seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
