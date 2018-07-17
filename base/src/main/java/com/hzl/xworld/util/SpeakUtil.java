package com.hzl.xworld.util;

import java.util.List;
import java.util.Random;

public class SpeakUtil {
    private static Random random = new Random();
    private static final String DEFAULT_WORDS = "...";

    /**
     * FUTURE 将来可以将具体实现的方法集成到这里面，改为void的方法，或者还是返回，但是实现在这儿实现
     * @param words
     * @return
     */
    public static String randomSpeak(List<String> words) {
        if (words == null || words.isEmpty()) {
            return DEFAULT_WORDS;
        }
        int rd = random.nextInt(words.size());
        return words.get(rd);
    }
}
