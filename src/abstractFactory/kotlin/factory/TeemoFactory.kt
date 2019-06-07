package abstractFactory.kotlin.factory

import abstractFactory.kotlin.teemo.TeemoAbility
import abstractFactory.kotlin.teemo.TeemoConfig

/**
 * Created by kvirus on 2019/6/7 20:25
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class TeemoFactory: ChampionFactory{
    override fun getAbilities(): ChampionAbility {
        return TeemoAbility()
    }

    override fun getConfig(): ChampionConfig {
        return TeemoConfig()
    }
}