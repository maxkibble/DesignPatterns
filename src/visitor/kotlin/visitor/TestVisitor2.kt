package visitor.kotlin.visitor

import visitor.kotlin.champion.Draven
import visitor.kotlin.champion.Noxus

/**
 * Created by kvirus on 2019/6/28 21:24
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class TestVisitor2: ChampionVisitor() {
    override fun visit(champion: Noxus?): Boolean {
        println(champion?.name)
        return false
    }

    override fun visit(champion: Draven?): Boolean {
        print(champion?.name)
        return false
    }

    override fun postVisit(champion: Noxus?): Boolean {
        print(champion?.name)
        return false
    }
}