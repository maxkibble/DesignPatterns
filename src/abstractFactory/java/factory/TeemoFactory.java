package abstractFactory.java.factory;

import abstractFactory.java.temmo.TeemoAbility;
import abstractFactory.java.temmo.TeemoConfig;

/**
 * Created by kvirus on 2019/6/7 19:44
 * Email @ caoyingkui@pku.edu.cn
 * <p>
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
public class TeemoFactory implements ChampionFactory {
    @Override
    public ChampionAbility getAbilities() {
        return new TeemoAbility();
    }

    @Override
    public ChampionConfig getConfig() {
        return new TeemoConfig();
    }
}
