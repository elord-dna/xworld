package com.hzl.xworld;

public enum StageRound {
    // fight begin
    BEGIN,
    // round pre start
    PRE_START,
    // round start
    START,
    // pre atk
    PRE_ATK,
    // pre be hit
    PRE_HIT,
    // atk ing
    ON_ATK,
    // being hit
    ON_HIT,
    // after atk
    AFT_ATK,
    // after be hit
    AFT_HIT,
    // before round end
    PRE_STOP,
    // round end
    STOP,
    // fight end
    END;
}
