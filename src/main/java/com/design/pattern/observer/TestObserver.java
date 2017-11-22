package com.design.pattern.observer;

/**
 * Created by lei02.zou on 2017/11/22.
 */
public class TestObserver {
    public static void main(String[] args) {
        ConcreateSubject subjct = new ConcreateSubject("主题更新了");
        Observer observer1 = new ConcreateObserver1();
        Observer observer2 = new ConcreateObserver2();

        subjct.registerObserver(observer1);
        subjct.registerObserver(observer2);

        subjct.notifyAllObservers();

        System.out.println("===============测试removeObserver,然后重新更新==================");
        subjct.removeObserver(observer2);
        subjct.setNotifyMsg("主题再次更新V2");

        subjct.notifyAllObservers();
    }
}
