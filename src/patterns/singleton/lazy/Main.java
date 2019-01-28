package patterns.singleton.lazy;

public class Main {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();

        Singleton y = Singleton.getInstance();

        Singleton z = Singleton.getInstance();

        x.string = (x.string).toUpperCase();

        System.out.println("String from x is " + x.string);
        System.out.println("String from y is " + y.string);
        System.out.println("String from z is " + z.string);
        System.out.println("\n");

        // changing variable of instance z
        z.string = (z.string).toLowerCase();

        System.out.println("String from x is " + x.string);
        System.out.println("String from y is " + y.string);
        System.out.println("String from z is " + z.string);

    }
}
