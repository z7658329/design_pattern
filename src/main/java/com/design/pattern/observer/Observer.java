package com.design.pattern.observer;

/**
 * Created by lei02.zou on 2017/11/22.
 * 所有观察者需要实现此接口
 */
public interface Observer {

    /**
     * 被观察者（主题Subject） 有变动的时候调用该接口通知各个观察者对象
     * @param msg
     */
    void update(String msg);
}
