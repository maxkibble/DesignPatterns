package memeoto

/**
 * Created by kvirus on 2019/7/26 22:46
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class Originator {
    private var state: String = ""

    fun getState(): String {
        return state
    }

    fun setState(state: String) {
        this.state = state
    }

    fun print(){
        println(state)
    }

    fun saveStateToMemeoto(): Memeoto{
        var memeoto = Memeoto(state)
        return memeoto
    }

    fun restoreFromMemeoto(memeoto: Memeoto?) {
        this.state = memeoto!!.getState()
    }
}