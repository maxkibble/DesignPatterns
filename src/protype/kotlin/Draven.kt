package protype.kotlin

import java.io.*

/**
 * Created by kvirus on 2019/6/21 16:21
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */

class Draven: Cloneable, Serializable {
    constructor() {
        nickname = "The Glorious Executor"
        slogn = "Where Draven go, where blood blood"
    }
    var nickname: String = ""
    var slogn: String = ""

    public override fun clone(): Draven {
        var result: Draven? = null
        try {
            val bout = ByteArrayOutputStream()
            val oout = ObjectOutputStream(bout)
            oout.writeObject(this)
            oout.close()
            val bin = ByteArrayInputStream(bout.toByteArray())
            val oin = ObjectInputStream(bin)
            result = oin.readObject() as protype.kotlin.Draven
            oin.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return result!!

    }
}