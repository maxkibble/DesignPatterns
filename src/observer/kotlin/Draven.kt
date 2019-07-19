package observer.kotlin

import java.util.*

/**
 * Created by kvirus on 2019/7/19 17:52
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class Draven: Observer {
    override fun update(o: Observable?, arg: Any?) {
        println("Draven收到杀手令：${arg.toString()}")
    }
}