package builder.kotlin.champion

/**
 * Created by kvirus on 2019/6/13 19:31
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */

enum class ChampionType {
    TANK,           // 坦克
    FIGHTER,        // 战士
    SLAYER,         // 刺客
    MAGE,           // 法师
    CONTROLLER,     // 辅助
    MARKSMAN,        // 射手
    UNDIFINED
}

open class Champion {
    open var nickname: String = ""
    open var slogon: String = ""
    open var continent: String = ""
    open var type: ChampionType = ChampionType.UNDIFINED

    open fun getInfo(): String {
        return "\tnickname: $nickname\n" +
                "\tslogon: $slogon\n" +
                "\tcontinent: $continent\n" +
                "\ttype: $type";
    }
}