package abstractFactory.kotlin.factory

import abstractFactory.kotlin.draven.DravenConfig
import abstractFactory.kotlin.draven.DravenAbility

/**
 * Created by kvirus on 2019/6/7 20:27
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class DravenFactory: ChampionFactory {
    override fun getAbilities(): ChampionAbility {
        return DravenAbility()
    }

    override fun getConfig(): ChampionConfig {
        return DravenConfig()
    }
}