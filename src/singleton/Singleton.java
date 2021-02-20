package singleton;

import java.util.Objects;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(Objects.isNull(singleton)) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
