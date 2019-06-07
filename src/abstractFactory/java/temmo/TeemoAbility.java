package abstractFactory.java.temmo;

import abstractFactory.java.Ability;
import abstractFactory.java.factory.ChampionAbility;

/**
 * Created by kvirus on 2019/6/7 19:36
 * Email @ caoyingkui@pku.edu.cn
 * <p>
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
public class TeemoAbility extends ChampionAbility {
    public TeemoAbility() {
        p = new Ability("Guerrilla Warfare", "If Teemo stands still and takes no actions for a short duration, he becomes Invisible indefinitely. If he's in brush, Teemo can enter and maintain his Invisibility while moving. After leaving Invisibility, Teemo gains the Element of Surprise, increasing his Attack Speed for 3 seconds.");
        q = new Ability("Blinding Dart", "Obscures an enemy's vision with a powerful venom, dealing damage to the target unit and blinding it for the duration.");
        w = new Ability("Move Quick", "Teemo scampers around, passively increasing his Movement Speed until he is struck by an enemy champion or turret. Teemo can sprint to gain bonus Movement Speed that isn't stopped by being struck for a short time.");
        e = new Ability("Toxic Shot", "Each of Teemo's attacks will poison the target, dealing damage on impact and each second after for 4 seconds.");
        r = new Ability("Noxious Trap", "Teemo throws an explosive poisonous trap using one of the mushrooms stored in his pack.");
    }

    @Override
    public String getDescription() {
        String description = "" +
                "The Description of Teemo's abilities: \n" +
                "\t P-" + p.name + ": " + p.description + "\n" +
                "\t Q-" + q.name + ": " + q.description + "\n" +
                "\t W-" + w.name + ": " + w.description + "\n" +
                "\t E-" + e.name + ": " + e.description + "\n" +
                "\t R-" + r.name + ": " + r.description + "\n";
        return description;
    }
}
