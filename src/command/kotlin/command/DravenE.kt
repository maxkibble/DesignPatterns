package command.kotlin.command

import command.kotlin.executor.Champion

/**
 * Created by kvirus on 2019/7/12 18:50
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class DravenE(target: Champion?): Command() {
    var percentage: Int = 50
    var duration:   Int = 2

    init {
        super.target = target
    }

    override fun execute() {
        target?.getSlowed(percentage, duration)
    }
}