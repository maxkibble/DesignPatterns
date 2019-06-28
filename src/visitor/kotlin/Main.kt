package visitor.kotlin

import visitor.kotlin.champion.Noxus
import visitor.kotlin.visitor.TestVisitor1
import visitor.kotlin.visitor.TestVisitor2

/**
 * Created by kvirus on 2019/6/28 21:26
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
fun main() {
    var champion = Noxus()

    var visitor1 = TestVisitor1()
    var visitor2 = TestVisitor2()

    println("Test for first visitor!")
    champion.accept(visitor1)

    println("Test for second visitor")
    champion.accept(visitor2)


}