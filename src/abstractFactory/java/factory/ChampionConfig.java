package abstractFactory.java.factory;

/**
 * Created by kvirus on 2019/6/7 19:08
 * Email @ caoyingkui@pku.edu.cn
 * <p>
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
public abstract class ChampionConfig {
    public int health;
    public int attack;
    public int armor;
    public int attackSpeed;
    public int magicResist;
    public int moveSpeed;

    public abstract String getDescription();
}
