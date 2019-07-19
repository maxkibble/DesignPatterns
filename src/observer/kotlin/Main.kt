package observer.kotlin

/**
 * Created by kvirus on 2019/7/19 17:56
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */

fun main() {
    var league = KillerLeague()

    var killer1 = Draven()
    var killer2 = Darius()

    league.addObserver(killer1)
    league.addObserver(killer2)


    println("start round 1! ")
    league.startNewRound()

    println("start round 2! ")
    league.startNewRound()
}