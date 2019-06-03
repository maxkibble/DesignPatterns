package factory.java;

/**
 * Created by kvirus on 2019/6/2 21:49
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
        Factory draven = () -> { return new Draven();};

        Factory teemo  = () -> { return new Temmo();};

        System.out.println(draven.nextChampion().getInfo());
        System.out.println(teemo.nextChampion().getInfo());
    }
}
