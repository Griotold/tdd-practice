package org.study.tddpasswordchecker;

public class Admin {
    private boolean blockState;

    public boolean isBlocked() {
        return blockState;
    }

    public void block() {
        if (blockState) {
            throw new AlreadyBlockedException();
        }
        blockState = true;
    }

    public void unblock() {
        if (!blockState) {
            throw new NonBlockedException();
        }
    }
}
