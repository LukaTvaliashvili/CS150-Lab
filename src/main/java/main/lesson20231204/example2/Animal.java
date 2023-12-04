package main.lesson20231204.example2;

public class Animal {

    private String specie;

    public Animal(){

    }
    public Animal(String specie){
        this.specie = specie;
    }

    public void makeSound(){
        System.out.println("Generic sound");
    }
}
