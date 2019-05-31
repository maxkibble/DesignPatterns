package singleton;

public class Singleton {
    private String name = "";
    private Singleton() {}
    private static final Singleton s = new Singleton();

    public static Singleton getInstance() {
        return s;
    }

    public String getName() {
        return s.name;
    }

    public void setName(String name) {
        s.name = name;
    }
}
