package abstractFactory.java.factory;

/**
 * Created by kvirus on 2019/6/7 19:41
 * Email @ caoyingkui@pku.edu.cn
 * <p>
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
public interface ChampionFactory {
    public abstract ChampionAbility getAbilities();

    public abstract ChampionConfig getConfig();
}
