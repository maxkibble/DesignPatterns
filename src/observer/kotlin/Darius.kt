package observer.kotlin

import java.util.*

/**
 * Created by kvirus on 2019/7/19 17:55
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class Darius: Observer {
    override fun update(o: Observable?, arg: Any?) {
        println("Darius收到杀手令：${arg.toString()}")
    }
}