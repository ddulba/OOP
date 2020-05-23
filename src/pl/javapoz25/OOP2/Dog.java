package pl.javapoz25.OOP2;

public class Dog extends Animal {

    private String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    public void makeSound() {
        System.out.println(dogName + " woofing");
    }
}
