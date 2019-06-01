package singleton.java;

// 懒汉模式
public class Singleton2 {
    private String name = "";
    private Singleton2() {}
    private static Singleton2 s = null;

    public static Singleton2 getInstance() {
        if (s == null)
            s = new Singleton2();
        return s;
    }

    public String getName() {
        return s.name;
    }

    public void setName(String name) {
        s.name = name;
    }

}
