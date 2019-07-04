package strategy.kotlin

/**
 * Created by kvirus on 2019/7/4 21:23
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */

fun main() {
    var cal = Calculator(Add())
    println(cal.calculate(1, 2))

    cal.setStrategy(Sub())
    println(cal.calculate(1, 2))
}