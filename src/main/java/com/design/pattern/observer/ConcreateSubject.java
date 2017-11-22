package com.design.pattern.observer;

import java.util.ArrayList;

import com.google.common.collect.Lists;

/**
 * Created by lei02.zou on 2017/11/22.
 */
public class ConcreateSubject implements Subject{

    private ArrayList<Observer> observers = Lists.newArrayList();

    private String notifyMsg;

    public ConcreateSubject(String notifyMsg) {
        this.notifyMsg = notifyMsg;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer:observers) {
            observer.update(notifyMsg);
        }
    }

    public void setNotifyMsg(String notifyMsg) {
        this.notifyMsg = notifyMsg;
    }
}
