package command.kotlin.executor

import command.kotlin.command.Command

/**
 * Created by kvirus on 2019/7/12 18:46
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class Draven(command: Command): Champion() {
    init {
        super.command = command

        name        = "Draven"
        health      = 574
        attack      = 60
        armor       = 29
        attackSpeed = 1
        magicResist = 30
        moveSpeed   = 330
    }

    public fun setcommand (command: Command) {
        super.command = command
    }
}