package com.design.pattern.observer;

/**
 * Created by lei02.zou on 2017/11/22.
 */
public class ConcreateObserver1 implements  Observer{

    public void update(String msg) {
        System.out.println(this.getClass().getSimpleName()+" 收到主题发送的消息："+msg);
    }
}
