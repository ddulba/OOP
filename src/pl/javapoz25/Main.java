package pl.javapoz25;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Person emptyPerson = new Person();
//        Address address = new Address("Dworcowa", "Poznań",
//                "Poland", 8, 32);
//        Person person = new Person("Jan", "Kowalski", Integer.parseInt("25"), address);
//        System.out.println(person.toString());
//        System.out.println(emptyPerson.toString());

//        System.out.println(person.introduce());

//        System.out.println(person.getName());
//        person.setName("Marcin");
//        System.out.println(person.getName());

//        Address address1 = new Address("Bukowska", "Poznan", "Poland", 6, 84);
//        System.out.println(person.toString());
//        person.setAddress(address1);
//        System.out.println(person.toString());

        Engine newEngine = new Engine(3.0, 231, 6.5);
//        System.out.println(newEngine.parameters());
//        System.out.println(newEngine.toString());
//
//        newEngine.setCapacity(2.5);
//        newEngine.setHorsePower(270);
//        newEngine.setFuelConsumption(9.8);
//        System.out.println("Capacity: " + newEngine.getCapacity() +
//                " Horse Power: " + newEngine.getHorsePower() +
//                " Fuel Consumption: " + newEngine.getFuelConsumption() + " liters.");

        Car sportCar = new SportCar("BMW", "5 E60", "Black", 5, newEngine);
        Car sportCar2 = new SportCar("Audi", "A6", "Black", 5, newEngine);
        System.out.println(sportCar.toString());

        List<Car> cars = new ArrayList<>();
        cars.add(sportCar);
        cars.add(sportCar2);

        for (Car newCar : cars) {
            System.out.println(newCar);
        }

    }
}
