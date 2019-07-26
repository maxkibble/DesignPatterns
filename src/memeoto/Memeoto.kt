package memeoto

/**
 * Created by kvirus on 2019/7/26 22:32
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */

class Memeoto (state: String){
    private var state: String = ""

    init {
        this.state = state
    }

    public fun getState(): String {
        return state
    }

    public fun setState(state: String) {
        this.state = state
    }

}