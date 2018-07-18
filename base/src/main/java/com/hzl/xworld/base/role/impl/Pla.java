package com.hzl.xworld.base.role.impl;

import com.alibaba.fastjson.JSON;
import com.hzl.xworld.base.action.IFightAction;
import com.hzl.xworld.base.role.Role;
import com.hzl.xworld.base.role.RoleType;
import com.hzl.xworld.base.skill.ISkill;
import java.util.Random;

public class Pla extends Role implements IFightAction {
    private int hp;
    private int atk;
    private int def;

    public Pla() {
        super();
        this.roleType = RoleType.PLAYER;
        Random rd = new Random();
        hp = rd.nextInt(50) + 100;
        atk = rd.nextInt(5) + 10;
        def = rd.nextInt(2) + 5;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    @Override
    public void cast(ISkill skill, Role des) {
    }
}
