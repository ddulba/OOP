package pl.javapoz25.OOP2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainOOP2 {

    public static void main(String[] args) {

        List<Cat> cat = new ArrayList<>();

        Cat cat1 = new Cat("Kitka");
        Cat cat2 = new Cat("Filemon");
        Cat cat3 = new Cat("Mruczek");
        Cat cat4 = new Cat("Rudy");

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        for (Cat newCats : cats) {
            newCats.makeSound();
//            newCats.eatMouse();
        }

        Dog dog1 = new Dog("Rico");
        dog1.makeSound();

        List<Animal> animals = new ArrayList<>();

        for (Animal newAnimals : animals) {
            newAnimals.makeSound();
        }
    }
}
