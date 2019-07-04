package strategy.kotlin

/**
 * Created by kvirus on 2019/7/4 21:19
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class Calculator (strategy: Strategy ){
    var context: Strategy? = null

    init {
        context = strategy
    }

    fun setStrategy(strategy: Strategy) {
        context = strategy
    }

    fun calculate(op1: Int, op2: Int): Int {
        return context!!.operate(op1, op2)
    }
}