package singleton.java;

public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s.getName());
        s.setName("Singleton object");
        System.out.println(s.getName());

        Singleton2 s2 = Singleton2.getInstance();
        System.out.println(s2.getName());
        s2.setName("Singleton2 object");
        System.out.println(s2.getName());

        System.out.println(singleton.kotlin.Singleton.INSTANCE.getName());
        singleton.kotlin.Singleton.INSTANCE.setName("Singleton object from kotlin");
        System.out.println(singleton.kotlin.Singleton.INSTANCE.getName());

        System.out.println(singleton.kotlin.Singleton2.Companion.getInstance().getName());
        singleton.kotlin.Singleton2.Companion.getInstance().setName("Singleton2 object from kotlin");
        System.out.println(singleton.kotlin.Singleton2.Companion.getInstance().getName());
    }
}
