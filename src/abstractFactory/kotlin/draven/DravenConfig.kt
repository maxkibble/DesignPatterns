package abstractFactory.kotlin.draven

import abstractFactory.kotlin.factory.ChampionConfig

/**
 * Created by kvirus on 2019/6/7 20:21
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */

class DravenConfig: ChampionConfig() {
    init {
        health = 574
        attack = 60
        armor = 29
        attackSpeed = 1
        magicResist = 30
        moveSpeed = 330
    }

    override fun getDescription(): String {
        return "" +
                "The config of Draven is: \n" +
                "\tHealth: " + health + "\n" +
                "\tAttack: " + attack + "\n" +
                "\tArmor: " + armor + "\n" +
                "\tAttackSpeed: " + attackSpeed + "\n" +
                "\tMagicResist: " + magicResist + "\n" +
                "\tMoveSpeed: " + moveSpeed + "\n"
    }
}