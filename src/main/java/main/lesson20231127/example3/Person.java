package main.lesson20231127.example3;

public class Person {
    private String name;
    private int age;

    public Person(){
        System.out.println("Constructor is called");
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void hello(){
        System.out.println("Hello from " + this.name);
    }

    //getters (accessors) and setters (mutators)
    public String getName(){
        return this.name;
    }

//    public void setName(String name){
//        this.name = name;
//    }

    public int getAge(){
        return this.age;
    }

//    public void setAge(int age){
//        this.age = age;
//    }
}
