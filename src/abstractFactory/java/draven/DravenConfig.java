package abstractFactory.java.draven;

import abstractFactory.java.factory.ChampionConfig;

/**
 * Created by kvirus on 2019/6/7 19:27
 * Email @ caoyingkui@pku.edu.cn
 * <p>
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
public class DravenConfig extends ChampionConfig {
    public DravenConfig() {
        health = 574;
        attack = 60;
        armor = 29;
        attackSpeed = 1;
        magicResist = 30;
        moveSpeed = 330;
    }


    @Override
    public String getDescription() {
        String description = "" +
                "The config of Draven is: \n" +
                "\tHealth: " + health + "\n" +
                "\tAttack: " + attack + "\n" +
                "\tArmor: " + armor + "\n" +
                "\tAttackSpeed: " + attackSpeed + "\n" +
                "\tMagicResist: " + magicResist + "\n" +
                "\tMoveSpeed: " + moveSpeed + "\b";
        return description;
    }
}
