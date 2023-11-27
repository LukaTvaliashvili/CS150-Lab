package main.lesson20231127.example4;

public class Example1 {

    public static void main(String[] args) {
        Bank bank = new Bank("Account1", 100.0);
        double afterTwoYears = bank.calculateInterest(2);
        System.out.println(afterTwoYears);
    }
}
