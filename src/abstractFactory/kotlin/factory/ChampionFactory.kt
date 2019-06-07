package abstractFactory.kotlin.factory

/**
 * Created by kvirus on 2019/6/7 19:59
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */

interface ChampionFactory {
    abstract fun getAbilities(): ChampionAbility
    abstract fun getConfig(): ChampionConfig
}