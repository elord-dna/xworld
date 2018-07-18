package com.hzl.xworld.base.skill;

import com.hzl.xworld.base.role.Role;

public abstract class AbstractSkill implements ISkill {
    protected String id;
    protected String name;

    protected Role fromRole;

    @Override
    public Role getFromRole() {
        return fromRole;
    }

    @Override
    public void setFromRole(Role role) {
        fromRole = role;
    }
}
