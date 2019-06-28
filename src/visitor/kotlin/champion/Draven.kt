package visitor.kotlin.champion

import visitor.kotlin.visitor.ChampionVisitor

/**
 * Created by kvirus on 2019/6/28 20:21
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class Draven: Champion() {
    init {
        this.name = "Draven"
        this.isMan = true
    }

    override fun accept(visitor: ChampionVisitor) {
        if (visitor.visit(this))
            visitor.visit(this)

    }
}