package pl.javapoz25.OOP2;

import java.util.Objects;

public class Cat extends Animal {

    private String catName;
    private Integer eatenMouses;

    public Cat() {
    }

    public Cat(String newCatName) {
        this.catName = newCatName;
        this.eatenMouses = 0;
    }

    public void makeSound() {
        System.out.println(catName + " doing Meow");
    }

    public void eatMouse() {
        this.eatenMouses++;
        System.out.println(" and eaten " + (this.eatenMouses) + " mouses");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return catName.equals(cat.catName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catName);
    }
}
