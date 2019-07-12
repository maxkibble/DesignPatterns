package command.kotlin.command

import command.kotlin.executor.Champion

/**
 * Created by kvirus on 2019/7/12 18:49
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
\ */

abstract class Command {
    var target: Champion? = null

    public fun settarget(target: Champion) {
        this.target = target
    }

    public abstract fun execute()
}