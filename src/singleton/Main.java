package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s.getName());
        s.setName("Singleton object");
        System.out.println(s.getName());
    }
}

// https://www.cnblogs.com/kuangdaoyizhimei/p/4000953.html