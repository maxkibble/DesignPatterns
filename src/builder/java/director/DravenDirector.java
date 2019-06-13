package builder.java.director;

import builder.java.builder.Builder;
import static builder.java.champion.Champion.*;

/**
 * Created by kvirus on 2019/6/13 19:02
 * Email @ caoyingkui@pku.edu.cn
 * <p>
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
public class DravenDirector {
    Builder builder;

    public DravenDirector(Builder builder) {
        this.builder = builder;
    }

    public void build() {
        builder.setNickname("The Glorious Executioner");
        builder.setSlogon("'The best' is wherever I decide to set the bar each day.");
        builder.setContinent("Noxus");
        builder.setType(ChampionType.MARKSMAN);
    }
}
