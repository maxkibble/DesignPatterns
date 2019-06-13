package builder.kotlin.builder

import builder.kotlin.champion.Champion
import builder.kotlin.champion.ChampionType

/**
 * Created by kvirus on 2019/6/13 19:30
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
interface Builder {
    abstract fun setNickname(nickname: String): Builder
    abstract fun setSlogon(slogon: String): Builder
    abstract fun setContinent(continent: String): Builder
    abstract fun setType(type: ChampionType): Builder
    abstract fun build(): Champion
}