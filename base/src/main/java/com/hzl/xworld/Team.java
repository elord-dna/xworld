package com.hzl.xworld;

import com.hzl.xworld.base.role.impl.Pla;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String id;
    private String name;
    // FIXME temp
    private List<Pla> plaList;

    public boolean isOver() {
        return plaList == null || plaList.isEmpty();
    }
    public int add(Pla pla) {
        if (plaList == null) {
            plaList = new ArrayList<>();
        }
        plaList.add(pla);
        return plaList.size();
    }
    public Pla get() {
        if (this.isOver()) {
            return null;
        }
        return plaList.get(0);
    }
}
