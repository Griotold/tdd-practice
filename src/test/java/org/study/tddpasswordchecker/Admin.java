package org.study.tddpasswordchecker;

public class Admin {
    private boolean blockState;

    public boolean isBlocked() {
        return blockState;
    }

    public void block() {
        blockState = true;
    }
}
