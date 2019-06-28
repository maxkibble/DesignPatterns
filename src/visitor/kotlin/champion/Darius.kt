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

class Darius: Champion() {
    init {
        this.name = "Darius"
        this.isMan = true
    }

    override fun accept(visitor: ChampionVisitor) {
        if (visitor.visit(this))
            visitor.postVisit(this)
    }
}