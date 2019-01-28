package patterns.singleton.thread_safe;

public class TrueThreadSafeSingleton {
    private static TrueThreadSafeSingleton instance;

    private TrueThreadSafeSingleton() { }

    public static TrueThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (TrueThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new TrueThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
