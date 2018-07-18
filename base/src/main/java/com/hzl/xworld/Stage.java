package com.hzl.xworld;

public class Stage {
    private RoundContext context;
    private Team team1;
    private Team team2;
//    private boolean bt1 = false;
//    private boolean bt2 = false;
    private Team curTeam;

    public Team getCurTeam() {
        return curTeam;
    }

    // TODO
    public void beginStage(Team t1, Team t2) {
        RoundContext context = EnvContext.getRoundContext();
        if (context == null) {
            context = EnvContext.startRound();
        }
        context.setStageRound(StageRound.BEGIN);
        this.context = context;
        team1 = t1; team2 = t2; curTeam = t1;
        // todo trigger all roles event and buff
    }
    // TODO
    public void preStartStage() {
        context.setStageRound(StageRound.PRE_START);
    }
    // TODO
    public void startStage() {
        context.setStageRound(StageRound.START);

        // auto-test
        preAtk();
    }

    // TODO
    public void preAtk() {
        context.setStageRound(StageRound.PRE_ATK);
    }

    // TODO
    public void atkStage() {
        context.setStageRound(StageRound.ON_ATK);

        // auto-test
        stopStage();
    }

    // TODO
    public void stopStage() {
        context.setStageRound(StageRound.STOP);
    }

    // TODO
    public void endStage() {
        context.setStageRound(StageRound.END);
    }

    public void roundSwitch() {
        if (curTeam == team1) {
            curTeam = team2;
        } else {
            curTeam = team1;
        }
    }
}
