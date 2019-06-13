package builder.java.builder;

import builder.java.champion.Champion;
import static builder.java.champion.Champion.*;
import builder.java.champion.LolChampion;

/**
 * Created by kvirus on 2019/6/13 18:55
 * Email @ caoyingkui@pku.edu.cn
 * <p>
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
public class LolChampionBuilder implements Builder {
    LolChampion instance = new LolChampion();

    @Override
    public Builder setNickname(String nickname) {
        instance.nickname = nickname;
        return this;
    }

    @Override
    public Builder setSlogon(String slogon) {
        instance.slogon = slogon;
        return this;
    }

    @Override
    public Builder setContinent(String continent) {
        instance.continent = continent;
        return this;
    }

    @Override
    public Builder setType(ChampionType type) {
        instance.type = type;
        return this;
    }

    @Override
    public Champion build() {
        return instance;
    }
}
