package protype.java;

/**
 * Created by kvirus on 2019/6/21 16:10
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
        Draven draven = new Draven();

        Draven backup = draven.clone();

        System.out.println(draven == backup);

        Draven test = null;
        long start = System.currentTimeMillis(), end;
        for(int i = 0; i < 10000; i ++)
            test = new Draven();
        end = System.currentTimeMillis();
        System.out.println("way 'new' time: " + (end - start));

        start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i ++)
            test = draven.clone();
        end = System.currentTimeMillis();
        System.out.println("way 'clone' time: " + (end - start));



    }
}
