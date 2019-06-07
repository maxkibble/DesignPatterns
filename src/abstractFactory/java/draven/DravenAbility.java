package abstractFactory.java.draven;

import abstractFactory.java.Ability;
import abstractFactory.java.factory.ChampionAbility;

/**
 * Created by kvirus on 2019/6/7 19:18
 * Email @ caoyingkui@pku.edu.cn
 * <p>
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
public class DravenAbility extends ChampionAbility {
    public DravenAbility (){
        p = new Ability("League of Draven", "Draven catches a Spinning Axe Spinning Axe, kills a non-champion or destroys a turret, he gains a stack of Adoration.");
        q = new Ability("Spinning Axe", "Draven starts spinning his axe, causing his next BONUS PHYSICAL DAMAGE basic attack within 5.8 seconds to deal.");
        w = new Ability("Blood Rush", "Draven becomes Ghost ghosted for 1.5 seconds, gaining Attack speed icon bonus attack speed for 3 seconds and Movement speed icon bonus movement speed which decays over 1.5 seconds.");
        e = new Ability("Stand Aside", "Draven throws his axes in a line, dealing physical damage to all enemies hit, Airborne icon knocking them aside and Slow icon slowing them for 2 seconds.");
        r = new Ability("Whirling Death", "Draven hurls two massive axes in the target direction, dealing physical damage to all enemies struck.");
    }

    @Override
    public String getDescription() {
        String description = "" +
                "The Description of Draven's abilities: \n" +
                "\t P-" + p.name + ": " + p.description + "\n" +
                "\t Q-" + q.name + ": " + q.description + "\n" +
                "\t W-" + w.name + ": " + w.description + "\n" +
                "\t E-" + e.name + ": " + e.description + "\n" +
                "\t R-" + r.name + ": " + r.description + "\n";
        return description;
    }
}
