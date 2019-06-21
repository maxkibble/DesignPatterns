package protype.kotlin

/**
 * Created by kvirus on 2019/6/21 16:29
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
fun main(){
    var draven = Draven();

    var start: Long
    var end: Long

    start = System.currentTimeMillis()
    for (i in 1..10000) {
        draven = Draven()
    }
    end = System.currentTimeMillis()
    println("way 'new' time: ${end - start}")

    start = System.currentTimeMillis()
    for (i in 1..10000) {
        draven = draven.clone()
    }
    end = System.currentTimeMillis()
    println("way 'clone' time: ${end - start}")
}