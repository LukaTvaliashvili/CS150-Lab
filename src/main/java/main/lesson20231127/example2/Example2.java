package main.lesson20231127.example2;

public class Example2 {

    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.getName()); // null
        p1.setName("David");
        System.out.println(p1.getName()); // David
        p1.age = 17;

    }
}
