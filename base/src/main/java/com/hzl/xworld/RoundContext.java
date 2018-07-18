package com.hzl.xworld;

import java.util.UUID;

public class RoundContext {
    private String id; // context id
    private StageRound stageRound;

    public RoundContext() {
        id = UUID.randomUUID().toString();
        EnvContext.addRound(id, this);
    }

    public StageRound getStageRound() {
        return stageRound;
    }

    public void setStageRound(StageRound stageRound) {
        this.stageRound = stageRound;
    }
}
