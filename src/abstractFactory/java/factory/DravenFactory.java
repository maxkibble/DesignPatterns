package abstractFactory.java.factory;

import abstractFactory.java.draven.DravenAbility;
import abstractFactory.java.draven.DravenConfig;

/**
 * Created by kvirus on 2019/6/7 19:43
 * Email @ caoyingkui@pku.edu.cn
 * <p>
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
public class DravenFactory implements ChampionFactory{
    @Override
    public ChampionAbility getAbilities() {
        return new DravenAbility();
    }

    @Override
    public ChampionConfig getConfig() {
        return new DravenConfig();
    }
}
