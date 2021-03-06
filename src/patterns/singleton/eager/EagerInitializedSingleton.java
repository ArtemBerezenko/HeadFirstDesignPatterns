package patterns.singleton.eager;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance =
            new EagerInitializedSingleton();

    public EagerInitializedSingleton() {}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
