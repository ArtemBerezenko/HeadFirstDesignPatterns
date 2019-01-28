package patterns.singleton;

import patterns.singleton.eager.EagerInitializedSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne =
                 new EagerInitializedSingleton().getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors =
                    EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
