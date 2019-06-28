package visitor.kotlin.champion

import visitor.kotlin.visitor.ChampionVisitor

/**
 * Created by kvirus on 2019/6/28 20:24
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */

open class Noxus: Champion() {
    init {
        this.name = "Noxus"
        this.isMan = false
        this.children = ArrayList<Champion>()
        children?.add(Draven())
        children?.add(Darius())
    }

    override fun accept(visitor: ChampionVisitor) {
        if (visitor.visit(this)) {
            var it: Iterator<Champion> = children!!.iterator()
            while (it.hasNext()) {
                it.next().accept(visitor)
            }
            visitor.postVisit(this)
        }
    }
}