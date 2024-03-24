package lab200.OOP.principle;

public class Principle {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.makeSound();
        System.out.println("Hello world!");
    }
}

abstract class Animal {
    void makeSound() {
         System.out.println("Animal sound");
   }; // What does makeSound?
    void makeSound(String b) {
        System.out.println("Animal sound");
    }; // What does makeSound?
}


class Cat extends Animal {
    private String name;
    Cat() {
        name = "Cat";
    }
    @Override()
    void makeSound() {
        System.out.println( name +" Meow");
    }
    @Override()
    void makeSound(String c) {
        System.out.println( name +" Meow");
    }

    void setName(String n) {
        this.name = n;
    }
}

