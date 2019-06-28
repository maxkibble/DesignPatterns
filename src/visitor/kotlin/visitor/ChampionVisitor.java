package visitor.kotlin.visitor;

import visitor.kotlin.champion.Champion;
import visitor.kotlin.champion.Darius;
import visitor.kotlin.champion.Draven;
import visitor.kotlin.champion.Noxus;

/**
 * Created by kvirus on 2019/6/28 20:16
 * Email @ caoyingkui@pku.edu.cn
 * <p>
 * |   *******    **      **     **     **
 * |  **            **  **       **  **
 * |  **              **         ***
 * |  **              **         **  **
 * |   *******        **         **     **
 */
public abstract class ChampionVisitor {

    public boolean visit(Noxus champion) {
        return true;
    }

    public boolean postVisit(Noxus champion) {
        return true;
    }

    public boolean visit(Draven champion) {
        return true;
    }

    public boolean postVisit(Draven champion) {
        return true;
    }

    public boolean visit(Darius champion) {
        return true;
    }

    public boolean postVisit(Darius champion) {
        return true;
    }
}
