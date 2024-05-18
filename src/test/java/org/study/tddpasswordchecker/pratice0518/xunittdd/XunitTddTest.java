package org.study.tddpasswordchecker.pratice0518.xunittdd;
/**
 * TDD 로 XUnit 프레임워크 만들기
 * */
public class XunitTddTest {
    public static void main(String[] args) {
        WasRun wasRun = new WasRun();
        System.out.println(wasRun.wasRun); // false
        wasRun.testMethod();
        System.out.println(wasRun.wasRun); // true
    }
}
