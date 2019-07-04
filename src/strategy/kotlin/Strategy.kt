package strategy.kotlin

/**
 * Created by kvirus on 2019/7/4 21:17
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
@FunctionalInterface
interface Strategy {
    fun operate(op1: Int, op2: Int): Int
}