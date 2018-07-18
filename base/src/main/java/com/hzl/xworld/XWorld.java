package com.hzl.xworld;

import com.hzl.xworld.base.role.impl.Pla;
import java.util.Scanner;

public class XWorld {
    public static void main(String[] args) {
        Stage stage = new Stage();
        Team a = new Team();
        Pla pa = new Pla();
        a.add(pa);
        Team b = new Team();
        Pla pb = new Pla();
        b.add(pb);

        Scanner scanner;
        stage.beginStage(a, b);
        while (!(a.isOver() || b.isOver())) {
            stage.startStage();
            Team t = stage.getCurTeam();
            scanner = new Scanner(System.in);
            String spell = scanner.nextLine();
            if (spell.equals("1")) {
                Pla p = t.get();

                stage.atkStage();
            }
        }
    }
}
