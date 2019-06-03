package factory.kotlin

/**
 * Created by kvirus on 2019/6/2 21:55
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */

open class Champion{
    var name: String = ""
    var ability: String = ""
    var url = ""
    fun getInfo(): String {
        return "The champion name is $name. His or her ability is '$ability'.";
    }
}

// 如何子类没有主构造函数，则需要在个次级构造函数中用super关键字，或者在代理另一个构造函数。
// 初始化基类时，可以调用基类的不同构造方法。
class Draven: Champion{
    constructor(): super(){
        this.name = "Draven"
        this.ability = "Whirling Death"
        this.url = "https://na.leagueoflegends.com/en/game-info/champions/Draven/"
    }
}

class Teemo: Champion {
    constructor(): super() {
        this.name = "Teemo"
        this.ability = "Noxious Trap"
        this.url = "https://na.leagueoflegends.com/en/game-info/champions/Teemo/"
    }
}

interface Factory{
    fun nextChampion(): Champion
}

class DravenFactory: Factory{
    override fun nextChampion() = Draven()
}

class TeemoFactory: Factory {
    override fun nextChampion() = Teemo()
}

fun main() {
    var draven = DravenFactory()
    var teemo = TeemoFactory()

    println(draven.nextChampion().getInfo())
    println(teemo.nextChampion().getInfo())
}
