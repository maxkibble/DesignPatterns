package visitor.kotlin.champion

import visitor.kotlin.visitor.ChampionVisitor

/**
 * Created by kvirus on 2019/6/28 20:11
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
abstract class Champion{
    open var name: String = ""
    open var isMan: Boolean = false
    open var children: ArrayList<Champion>? = null

    abstract fun accept(visitor: ChampionVisitor)
}