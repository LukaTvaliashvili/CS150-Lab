package main.lesson20231204.example2;

// IS-A relationship
public class Cat extends Animal {

    private boolean isFluffy;

    public Cat(String specie, boolean isFluffy) {
        super(specie);
        this.isFluffy = isFluffy;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
}
