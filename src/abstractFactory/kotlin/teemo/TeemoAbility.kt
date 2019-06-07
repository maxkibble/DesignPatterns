package abstractFactory.kotlin.teemo

import abstractFactory.kotlin.Ability
import abstractFactory.kotlin.factory.ChampionAbility

/**
 * Created by kvirus on 2019/6/7 20:22
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class TeemoAbility: ChampionAbility() {
    init {
        p = Ability("Guerrilla Warfare", "If Teemo stands still and takes no actions for a short duration, he becomes Invisible indefinitely. If he's in brush, Teemo can enter and maintain his Invisibility while moving. After leaving Invisibility, Teemo gains the Element of Surprise, increasing his Attack Speed for 3 seconds.")
        q = Ability("Blinding Dart", "Obscures an enemy's vision with a powerful venom, dealing damage to the target unit and blinding it for the duration.")
        w = Ability("Move Quick", "Teemo scampers around, passively increasing his Movement Speed until he is struck by an enemy champion or turret. Teemo can sprint to gain bonus Movement Speed that isn't stopped by being struck for a short time.")
        e = Ability("Toxic Shot", "Each of Teemo's attacks will poison the target, dealing damage on impact and each second after for 4 seconds.")
        r = Ability("Noxious Trap", "Teemo throws an explosive poisonous trap using one of the mushrooms stored in his pack.")
    }

    override fun getDescription(): String {
        return "" +
                "The Description of Teemo's abilities: \n" +
                "\t P-" + p.name + ": " + p.description + "\n" +
                "\t Q-" + q.name + ": " + q.description + "\n" +
                "\t W-" + w.name + ": " + w.description + "\n" +
                "\t E-" + e.name + ": " + e.description + "\n" +
                "\t R-" + r.name + ": " + r.description + "\n"
    }
}