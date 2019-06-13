package builder.java.builder;

import builder.java.champion.Champion;

import static builder.java.champion.Champion.*;

/**
 * Created by kvirus on 2019/6/13 18:49
 * Email @ caoyingkui@pku.edu.cn
 * <p>
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
public interface Builder {
    public Builder setNickname(String nickname);

    public Builder setSlogon(String slogon);

    public Builder setContinent(String continent);

    public Builder setType(ChampionType type);

    public Champion build();
}
