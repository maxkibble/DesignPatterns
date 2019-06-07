package abstractFactory.kotlin

import abstractFactory.kotlin.factory.ChampionFactory
import abstractFactory.kotlin.factory.TeemoFactory
import abstractFactory.kotlin.factory.DravenFactory

/**
 * Created by kvirus on 2019/6/7 20:30
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */

fun main() {
    var champion1 = DravenFactory()
    println(champion1.getAbilities().getDescription())
    println(champion1.getConfig().getDescription())

    println()

    var champion2 = TeemoFactory()
    println(champion2.getAbilities().getDescription())
    println(champion2.getConfig().getDescription())

}