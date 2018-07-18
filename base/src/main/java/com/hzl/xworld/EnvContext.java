package com.hzl.xworld;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class EnvContext {

    private static RoundContext roundContext = null;   // null means there is no round started

    // IMPROVE 这个是扩展，用id同时管理多个round
    private static Map<String, RoundContext> roundContextMap = new HashMap<>();

    public static RoundContext getRoundContext() {
        return roundContext;
    }
    // 这个方法只支持一个round进行
    public static RoundContext startRound() {
        roundContext = new RoundContext();
        return roundContext;
    }
    public static void addRound(String id, RoundContext roundContext) {
        roundContextMap.put(id, roundContext);
    }

}
