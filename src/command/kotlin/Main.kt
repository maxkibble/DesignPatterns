package command.kotlin

import command.kotlin.command.DariusW
import command.kotlin.command.DravenE
import command.kotlin.executor.Draven
import command.kotlin.executor.Darius

/**
 * Created by kvirus on 2019/7/12 19:00
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
fun main() {
    var dravenE = DravenE(null)
    var draven  = Draven(dravenE)

    var dariusW = DariusW(null)
    var darius  = Darius(dariusW)

    draven.command?.settarget(darius)
    draven.execute()

    darius.command?.settarget(draven)
    darius.execute()

    draven.command?.settarget(draven)
    draven.execute()

    darius.command?.settarget(darius)
    darius.execute()
}