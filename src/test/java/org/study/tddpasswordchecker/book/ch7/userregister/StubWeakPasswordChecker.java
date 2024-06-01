package org.study.tddpasswordchecker.book.ch7.userregister;

public class StubWeakPasswordChecker implements WeakPasswordChecker{
    private boolean weak;

    public void setWeak(boolean weak) {
        this.weak = weak;
    }

    public boolean checkPassword(String pw) {
        return weak;
    }
}
