package main.lesson20231204.example3;

public class Child extends Parent {
    int age;
    public Child(){
        System.out.println("Child Constructor");
    }
    public Child(int age){
        System.out.println("Child constructor with age");
        this.age = age;
    }

}
