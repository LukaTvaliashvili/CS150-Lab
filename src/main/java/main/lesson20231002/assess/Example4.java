package main.lesson20231002.assess;

public class Example4 {

    public static void main(String[] args) {

        int x = 1, z;
        z = x++;
        System.out.println("x = " + x + "\tz = " + z);

        char s = 'S', t;
        t = s--;
        System.out.println("s = " + s);
        System.out.println("\tt = " + t);

        double d = 15.674, q;
        q = ++d - 10;

        System.out.print("d = " + d);
        System.out.print(" q = " + q);

        /*

        boolean b = false;
        System.out.println(b++);

        b -= 1;
        System.out.println(b);

         */
    }
}
