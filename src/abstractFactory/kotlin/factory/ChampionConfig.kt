package abstractFactory.kotlin.factory

/**
 * Created by kvirus on 2019/6/7 20:06
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
open class ChampionConfig {
    open var health: Int = 1
    open var attack: Int = 1
    open var armor: Int = 1
    open var attackSpeed: Int = 1
    open var magicResist: Int = 1
    open var moveSpeed: Int = 1

    open fun getDescription(): String {
        return ""
    }
}