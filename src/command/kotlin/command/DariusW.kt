package command.kotlin.command

import command.kotlin.executor.Champion

/**
 * Created by kvirus on 2019/7/12 18:56
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class DariusW(target: Champion?): Command() {
    var percentage: Int = 90
    var duration:   Int = 1

    init {
        this.target = target
    }


    override fun execute() {
        super.target?.getSlowed(percentage, duration)
    }
}