package com.hzl.xworld;

import com.hzl.xworld.base.IValidChecker;
import java.util.LinkedList;
import java.util.List;

public class ValidateChecker {

    private List<IValidChecker> checkerList;
    private boolean initialized = false;

    // TODO 初始化
    public void init() {
        this.checkerList = new LinkedList<>();
        initialized = true;
    }

    // TODO 注册
    public void register(IValidChecker checker) {
        checkerList.add(checker);
    }

    // CHECK 检验
    public boolean check() {
        if (checkerList != null ) {
            for (IValidChecker checker : checkerList) {
                if (!checker.valid()) {
                    return false;
                }
            }
        }
        return true;
    }
}
