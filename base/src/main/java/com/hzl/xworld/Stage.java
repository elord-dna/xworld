package com.hzl.xworld;

public class Stage {
    private RoundContext context;

    // TODO
    public void beginStage() {
        RoundContext context = EnvContext.getRoundContext();
        if (context == null) {
            context = EnvContext.startRound();
        }
        context.setStageRound(StageRound.BEGIN);
        this.context = context;
        // todo trigger all roles event and buff
    }
    // TODO
    public void preStartStage() {
        context.setStageRound(StageRound.PRE_START);
    }
    // TODO
    public void startStage() {
        context.setStageRound(StageRound.START);
    }
}
