package pl.javapoz25;

public class Engine {

    private Double capacity;
    private Integer horsePower;
    private Double fuelConsumption;

    public Engine() {
    }

    public Engine(Double cap, Integer hP, Double fuelCons) {
        this.capacity = cap;
        this.horsePower = hP;
        this.fuelConsumption = fuelCons;
    }

    public Double getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Double newCapacity) {
        this.capacity = newCapacity;
    }

    public Integer getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(Integer newHorsePower) {
        this.horsePower = newHorsePower;
    }

    public Double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void setFuelConsumption(Double newFuelConsumption) {
        this.fuelConsumption = newFuelConsumption;
    }

    public String parameters() {
        return "Engine capacity: " + this.capacity +
                ", HorsePower: " + this.horsePower +
                ", Fuel Consumption: " + this.fuelConsumption + " liters.";
    }

    @Override
    public String toString() {
        return "Capacity: " + this.capacity +
                " Horse Power: " + this.horsePower +
                " Fuel Consumption: " + this.fuelConsumption;
    }
}
