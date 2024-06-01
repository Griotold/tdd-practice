package org.study.tddpasswordchecker.book.ch7.userregister;

public class SpyEmailNotifier implements EmailNotifier{
    private boolean isCalled;
    private String email;
    public boolean isCalled() {
        return isCalled;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void sendRegisterEmail(String email) {
        this.email = email;
        isCalled = true;
    }
}
