package builder.kotlin

import builder.kotlin.builder.LolChampionBuilder
import builder.kotlin.champion.Champion
import builder.kotlin.champion.ChampionType

/**
 * Created by kvirus on 2019/6/13 19:57
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */

fun main() {
    var draven = LolChampionBuilder()
            .setNickname("The Glorious Executioner")
            .setSlogon("'The best' is wherever I decide to set the bar each day.")
            .setContinent("Noxus")
            .setType(ChampionType.MARKSMAN)
            .build()
    println(draven.getInfo())
}