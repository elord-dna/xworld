package com.hzl.xworld.base.skill.impl;

import com.hzl.xworld.EnvContext;
import com.hzl.xworld.StageRound;
import com.hzl.xworld.base.role.Role;
import com.hzl.xworld.base.role.impl.Pla;
import com.hzl.xworld.base.skill.AbstractSkill;
import java.util.List;

public class NormalAtk extends AbstractSkill {
    private int tempDmg = 0;
    @Override
    public void affect(Role role) {
        StageRound sr = EnvContext.getRoundContext().getStageRound();
        switch (sr) {
            case ON_ATK:
                calDmg(role);
                // todo trigger
                break;
            case AFT_ATK:
                doDmg(role);
                // todo trigger
                break;
            default: break;
        }

    }

    @Override
    public void affect(List<Role> roles) {

    }

    @Override
    public void affectAll() {

    }

    private void calDmg(Role des) {
        if (fromRole instanceof Pla && des instanceof Pla) {
            tempDmg = ((Pla) fromRole).getAtk() - ((Pla) des).getDef();
        } else {
            tempDmg = 0;
        }
    }
    private void doDmg(Role des) {
        if (des instanceof Pla) {
            int curHp = ((Pla) des).getHp();
            if (curHp > tempDmg) {
                ((Pla) des).setHp(curHp - tempDmg);
            } else {
                ((Pla) des).setHp(0);
            }
        }
    }
}
