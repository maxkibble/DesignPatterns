package command.kotlin.executor

import command.kotlin.command.Command

/**
 * Created by kvirus on 2019/7/12 18:54
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class Darius(command: Command): Champion() {
    init {
        super.command = command

        name        = "Darius"
        health      = 582
        attack      = 64
        armor       = 39
        attackSpeed = 1
        magicResist = 32
        moveSpeed   = 340
    }

    public fun setcommand (command: Command) {
        super.command = command
    }



}