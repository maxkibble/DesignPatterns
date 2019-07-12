package command.kotlin.executor

import command.kotlin.command.Command

/**
 * Created by kvirus on 2019/7/12 17:57
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */

abstract class Champion {
    open var command: Command? = null

    open var name: String = ""
    open var health: Int = 1
    open var attack: Int = 1
    open var armor: Int = 1
    open var attackSpeed: Int = 1
    open var magicResist: Int = 1
    open var moveSpeed: Int = 1

    /**
     * 每个英雄都有一个该函数，当受到减速技能时，按照当前魔法抗性的进行百分比检索
     */
    fun getSlowed(percentage: Int, duration: Int) {
        var result: Int = (percentage * (1- magicResist / (100.0 + magicResist))).toInt()
        println("$name has been slowed $result%, the current speed is ${moveSpeed * (100 - result) / 100.0}.")
    }

    fun execute() {
        command?.execute()
    }
}