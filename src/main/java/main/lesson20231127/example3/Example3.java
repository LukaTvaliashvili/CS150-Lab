package main.lesson20231127.example3;

public class Example3 {

    public static void main(String[] args) {

        Person p1 = new Person();

        Person p2 = new Person("David");
        // p1.name; -> no longer possible as name attribute is private
        System.out.println(p2.getName());

        Person p3 = new Person("George", 25);
        System.out.println("Age: " + p3.getAge());
        System.out.println("Name: " + p3.getName());
    }
}
