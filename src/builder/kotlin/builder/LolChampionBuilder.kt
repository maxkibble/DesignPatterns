package builder.kotlin.builder

import builder.kotlin.champion.Champion
import builder.kotlin.champion.ChampionType
import builder.kotlin.champion.LolChampion

/**
 * Created by kvirus on 2019/6/13 19:47
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class LolChampionBuilder: Builder {
    var instance: LolChampion = LolChampion()

    override fun setNickname(nickname: String): Builder {
        instance.nickname = nickname
        return this
    }

    override fun setSlogon(slogon: String): Builder {
        instance.slogon = slogon
        return this
    }

    override fun setContinent(continent: String): Builder {
        instance.continent = continent
        return this
    }

    override fun setType(type: ChampionType): Builder {
        instance.type = type
        return this
    }

    override fun build(): Champion {
        return instance
    }
}