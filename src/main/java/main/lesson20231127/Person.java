package main.lesson20231127;

/*
OOP - Encapsulation, Inheritance, Polymorphism
 */
public class Person {

    /*
    public, private, protected, default (package private)
     */
    String name;
    int age;

    public Person(){
        System.out.println("Constructor is called");
    }

    void hello(){
        System.out.println("Hello from " + this.name);
    }

    //getters (accessors) and setters (mutators)
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }



}
