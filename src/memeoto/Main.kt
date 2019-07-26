package memeoto

/**
 * Created by kvirus on 2019/7/26 22:51
 * Email @ caoyingkui@pku.edu.cn
 *
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
fun main() {
    // 状态历史
    var backup = CareTaker()

    var subject = Originator()

    subject.setState("state 0!")

    backup.addMemeoto(subject.saveStateToMemeoto())
    subject.setState("state 1!")

    backup.addMemeoto(subject.saveStateToMemeoto())
    subject.setState("state 2!")

    println("Current state: " + subject.getState())

    subject.restoreFromMemeoto(backup.getMemeoto(0))
    println("Roll back to state 0: " + subject.getState())

    subject.restoreFromMemeoto(backup.getMemeoto(1))
    println("Roll back to state 1: " + subject.getState())

}