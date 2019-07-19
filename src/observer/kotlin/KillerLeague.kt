package observer.kotlin

import java.util.*

/**
 * Created by kvirus on 2019/7/19 17:43
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */

/**
 * 杀手联盟，广发杀手令
 * Observable 是java内置的实现的被观察者类
 */
class KillerLeague: Observable() {
    var target: Int = 0
    private fun nextTarget(): String {
        return "The next target to be killed: ${target ++}"
    }

    fun startNewRound() {
        this.setChanged()
        notifyObservers()
    }

    override fun notifyObservers() {
        var message = nextTarget()
        notifyObservers(message)
    }
}