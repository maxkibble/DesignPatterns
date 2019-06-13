package builder.java.champion;

/**
 * Created by kvirus on 2019/6/13 18:07
 * Email @ caoyingkui@pku.edu.cn
 * <p>
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */

public abstract class Champion {
    public static enum ChampionType {
        TANK,           // 坦克
        FIGHTER,        // 战士
        SLAYER,         // 刺客
        MAGE,           // 法师
        CONTROLLER,     // 辅助
        MARKSMAN        // 射手
    }

    public String nickname;     // 英雄别称
    public String slogon;       // 座右铭
    public String continent;    // 出生地
    public ChampionType type;   // 类型

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("\tnickname: " + nickname + "\n");
        info.append("\tslogon: " + slogon + "\n");
        info.append("\tcontinent: " + continent + "\n");
        info.append("\ttype: " + type + "\n");
        return info.toString();
    }
}
