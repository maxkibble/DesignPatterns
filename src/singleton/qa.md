###Question
####java
1. 解释饿汉模式中变量`s`前三个修饰符（`private`, `static`, `final`）的意义和必要性
2. 懒汉模式的一大优势是动态创建对象，节省了内存。那么饿汉模式中的变量`s`是何时被创建的，存储在哪呢？
3. 在多线程场景下，如何保证懒汉模式中对象的唯一性

###Part answers
####java
1. xxx
2. https://segmentfault.com/q/1010000008762662?_ea=1735948
3. 
```
public static Singleton2 getInstance() {
    if (s == null) {
        synchronized (Singleton2.class) {
            if (s == null)
                s = new Singleton2();
            return s;
        }
    }
    return s;
}
```