package patterns.singleton.lazy;

public class Singleton {
    private static Singleton instance = null;

    public String string;

    private Singleton() {
        string = "Hello I'm a string part of Singleton class";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
