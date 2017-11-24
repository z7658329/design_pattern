package com.design.pattern.strategy;

/**
 * 抽象策略角色
 * 定义一个抽象的策略类
 * Created by lei02.zou on 2017/11/23.
 */
public interface Strategy {
    /**
     * 定义一个计算的通用接口，根据不同的策略有不同的实现
     * 比如 + - * /
     * @param a
     * @param b
     * @return
     */
    int calculate(int a, int b);
}
