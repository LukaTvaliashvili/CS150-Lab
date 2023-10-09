package main.lesson20231009.stringpart2;

public class Example3 {

    public static void main(String[] args) {
        String hello = "Hello";

        String replaceLWithK = hello.replace('l', 'k');
        System.out.println(replaceLWithK); //Hekko

        String replaced = hello.replace("ll", "5k");
        System.out.println(replaced); //He5ko
    }
}
