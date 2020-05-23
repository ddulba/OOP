package pl.javapoz25;

public class SportCar extends Car {

    public SportCar(String producer, String model, String color, Integer seatsNumber, Engine engine) {
        super(producer, model, color, seatsNumber, engine);
    }

    @Override
    public String toString() {
        return "SportCar " +
                "producer = '" + getProducer() + '\'' +
                ", model = '" + getModel() + '\'' +
                ", color = '" + getColor() + '\'' +
                ", seatsNumber = " + getSeatsNumber() +
                ", engine = " + getEngine();
    }
}
