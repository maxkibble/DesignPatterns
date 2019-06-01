package singleton.kotlin

// 饿汉式
object Singleton {
    private var name: String = ""

    fun setName(name: String) {
        this.name = name
    }

    fun getName(): String {
        return name
    }
}

// 懒汉式
class Singleton2 {
    private var name: String = ""
    companion object {
        val instance: Singleton2 by lazy { Singleton2() }
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getName(): String {
        return name
    }

}

fun main() {
    println(Singleton.getName())
    Singleton.setName("kotlin singleton object")
    println(Singleton.getName())

    println(Singleton2.instance.getName())
    Singleton2.instance.setName("kotlin singleton2 object")
    println(Singleton2.instance.getName())
}