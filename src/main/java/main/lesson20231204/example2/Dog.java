package main.lesson20231204.example2;

public class Dog extends Animal {
    private boolean isLoyal;

    public Dog(String specie, boolean isLoyal){
        super(specie);
        this.isLoyal = isLoyal;
    }

    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}
