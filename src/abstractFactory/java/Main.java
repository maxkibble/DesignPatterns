package abstractFactory.java;

import abstractFactory.java.factory.ChampionFactory;
import abstractFactory.java.factory.DravenFactory;
import abstractFactory.java.factory.TeemoFactory;

/**
 * Created by kvirus on 2019/6/7 19:45
 * Email @ caoyingkui@pku.edu.cn
 * <p>
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
public class Main {
    public static void main(String[] args) {
        ChampionFactory champion = new DravenFactory();
        System.out.println(champion.getAbilities().getDescription());
        System.out.println(champion.getConfig().getDescription());

        System.out.println();

        champion =  new TeemoFactory();
        System.out.println(champion.getAbilities().getDescription());
        System.out.println(champion.getConfig().getDescription());
    }

}
