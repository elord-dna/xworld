package com.hzl.xworld.base.action;

import com.hzl.xworld.base.role.Role;
import com.hzl.xworld.base.role.impl.Pla;
import com.hzl.xworld.base.skill.ISkill;

public interface IFightAction extends IAction {

    /**
     * 一个非常抽象的方法，执行一个命令，但是没有指定任何目标
     * @param skill
     */
    default void cast(ISkill skill) {
        skill.affectAll();
    }

    void cast(ISkill skill, Role des);
}
