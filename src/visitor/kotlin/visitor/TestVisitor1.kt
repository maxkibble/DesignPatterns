package visitor.kotlin.visitor

import visitor.kotlin.champion.Darius
import visitor.kotlin.champion.Draven
import visitor.kotlin.champion.Noxus

/**
 * Created by kvirus on 2019/6/28 21:03
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class TestVisitor1: ChampionVisitor(){
    override fun visit(champion: Draven?): Boolean {
        println(champion?.name)
        return false
    }

    override fun postVisit(champion: Darius?): Boolean {
        println(champion?.name)
        return false
    }
}