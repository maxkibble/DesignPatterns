package abstractFactory.java.factory;

import abstractFactory.java.Ability;

/**
 * Created by kvirus on 2019/6/7 19:12
 * Email @ caoyingkui@pku.edu.cn
 * <p>
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
public abstract class ChampionAbility {
    protected Ability p;
    protected Ability q;
    protected Ability w;
    protected Ability e;
    protected Ability r;

    public abstract String getDescription();
}
