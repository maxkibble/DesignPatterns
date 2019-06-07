package abstractFactory.java.temmo;

import abstractFactory.java.factory.ChampionConfig;

/**
 * Created by kvirus on 2019/6/7 19:33
 * Email @ caoyingkui@pku.edu.cn
 * <p>
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
public class TeemoConfig extends ChampionConfig {
    public TeemoConfig() {
        health = 528;
        attack = 54;
        armor = 24;
        attackSpeed = 1;
        magicResist = 30;
        moveSpeed = 330;
    }

    @Override
    public String getDescription() {
        String description = "" +
                "The config of Teemo is: \n" +
                "\tHealth: " + health + "\n" +
                "\tAttack: " + attack + "\n" +
                "\tArmor: " + armor + "\n" +
                "\tAttackSpeed: " + attackSpeed + "\n" +
                "\tMagicResist: " + magicResist + "\n" +
                "\tMoveSpeed: " + moveSpeed + "\b";
        return description;
    }
}
