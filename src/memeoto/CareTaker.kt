package memeoto

/**
 * Created by kvirus on 2019/7/26 22:40
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
class CareTaker {
    var memeotoes = ArrayList<Memeoto>()

    fun addMemeoto(memeoto: Memeoto) {
        memeotoes.add(memeoto)
    }

    fun getMemeoto(index: Int): Memeoto?{
        if (index >= 0 && index < memeotoes.size)
            return memeotoes[index]
        else
            return null
    }

}
