package factory.java;

/**
 * Created by kvirus on 2019/6/2 21:40
 * Email @ caoyingkui@pku.edu.cn
 * <p>
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
public abstract class Champion {
    public String name;

    public String ability;

    public String url = "";

    public String getInfo() {
        return "The champion name is " + name + ". His or her ability is '" + ability + "'.";
    }
}
