package strategy.kotlin

/**
 * Created by kvirus on 2019/7/4 21:44
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class Add: Strategy{
    override fun operate(op1: Int, op2: Int): Int {
        return op1 + op2
    }
}