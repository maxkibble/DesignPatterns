package builder.java;

import builder.java.builder.LolChampionBuilder;
import builder.java.champion.Champion;
import builder.java.director.DravenDirector;

/**
 * Created by kvirus on 2019/6/13 19:13
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

        // build way
        System.out.println("build way:");
        Champion draven = new LolChampionBuilder()
                .setNickname("The Glorious Executioner")
                .setSlogon("'The best' is wherever I decide to set the bar each day.")
                .setContinent("Noxus")
                .setType(Champion.ChampionType.MARKSMAN)
                .build();
        System.out.println(draven.getInfo());

        // director way
        System.out.println("");
        System.out.println("director way:");
        LolChampionBuilder builder = new LolChampionBuilder();
        DravenDirector director = new DravenDirector(builder);
        director.build();
        draven = builder.build();
        System.out.println(draven.getInfo());

    }
}
