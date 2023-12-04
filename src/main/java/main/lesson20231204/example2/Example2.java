package main.lesson20231204.example2;

public class Example2 {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        Cat cat = new Cat("Tom", true);
        Dog dog = new Dog("Santiago", true);

        animal.makeSound();
        cat.makeSound(); // meow
        dog.makeSound(); // bark

        System.out.println("======POLYMORPHISM======");
        Animal dog1 = new Dog("Chuck", false);
        dog1.makeSound();
        Animal cat1 = new Cat("Piso", false);
//        cat1.makeSound();
        dog1 = cat1;
        dog1.makeSound(); // MEOW
    }
}
