package main.lesson20231127;

public class Example1 {

    public static void main(String[] args) {
        Person p1;
        p1 = new Person();

        StringBuilder sb = new StringBuilder();

        Person p2 = new Person(); //create another instance

        p1.name = "David";
        p1.age = 22;

        System.out.println("Name: " + p1.name);
        System.out.println("Age: " + p1.age);

        p1.hello();

        System.out.println(p1); // prints fully qualified classname

        // utilize getters and setters
        System.out.println(p1.getName()); // David
        p1.setName("Albert");
        System.out.println(p1.getName()); //Albert
        System.out.println(p1.getAge()); // 22

    }
}
