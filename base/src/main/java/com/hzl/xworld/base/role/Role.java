package com.hzl.xworld.base.role;

import com.hzl.xworld.base.buff.Buff;

public class Role {
    protected String id;
    protected String name;
    protected RoleType roleType = RoleType.DEFAULT;
    protected int lv = 0;

    /**
     * 触发效果
     * @param buff
     */
    public void trigger(Buff buff) {
        buff.trigger();
    }
}
