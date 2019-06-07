package abstractFactory.kotlin.teemo

import abstractFactory.kotlin.factory.ChampionConfig

/**
 * Created by kvirus on 2019/6/7 20:24
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class TeemoConfig: ChampionConfig() {
    init {
        health = 528
        attack = 54
        armor = 24
        attackSpeed = 1
        magicResist = 30
        moveSpeed = 330
    }

    override fun getDescription(): String {
        return "" +
                "The config of Teemo is: \n" +
                "\tHealth: " + health + "\n" +
                "\tAttack: " + attack + "\n" +
                "\tArmor: " + armor + "\n" +
                "\tAttackSpeed: " + attackSpeed + "\n" +
                "\tMagicResist: " + magicResist + "\n" +
                "\tMoveSpeed: " + moveSpeed + "\b"
    }
}