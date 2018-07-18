package com.hzl.xworld.base.skill;

import com.hzl.xworld.base.role.Role;
import com.hzl.xworld.base.action.IFightAction;
import java.util.List;

public interface ISkill extends IFightAction {
    /**
     * 技能需要选择角色使用，如果没有角色，环境会根据当前状态获取合适的角色，然后就是技能效果对角色的影响
     * @param role
     */
    void affect(Role role);
    void affect(List<Role> roles);

    /**
     * 给出一个能够影响全部的方法
     */
    void affectAll();

    /**
     * 这个方法都必须实现，必须要有来源，默认来源不存在或者来源于一个不存在的事物
     * @return
     */
    default Role getFromRole() {
        return null;
    }
}
