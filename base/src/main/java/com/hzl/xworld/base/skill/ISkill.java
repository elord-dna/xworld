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
}
