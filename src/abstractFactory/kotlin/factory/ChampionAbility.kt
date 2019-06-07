package abstractFactory.kotlin.factory

import abstractFactory.kotlin.Ability

/**
 * Created by kvirus on 2019/6/7 20:01
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
open class ChampionAbility {
    open var p: Ability = Ability("", "")
    open var q: Ability = Ability("", "")
    open var w: Ability = Ability("", "")
    open var e: Ability = Ability("", "")
    open var r: Ability = Ability("", "")

    open fun getDescription(): String {
        return "";
    }
}
