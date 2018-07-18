package com.hzl.xworld.base.action.person;

import com.hzl.xworld.base.action.INormalAction;
import com.hzl.xworld.util.SpeakUtil;

public abstract class PersonAction implements INormalAction {

    /**
     * default say ...
     */
    public void say() {
        System.out.println(SpeakUtil.randomSpeak(null));
    }

    /**
     * TODO 想用脚本语言实现，例如JDK8支持的js脚本
     * 但是目前并不使用脚本实现
     */
    public void communication() {
    }
}
