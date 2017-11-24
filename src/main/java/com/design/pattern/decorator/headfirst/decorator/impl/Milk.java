package com.design.pattern.decorator.headfirst.decorator.impl;

import com.design.pattern.decorator.headfirst.component.Beverage;
import com.design.pattern.decorator.headfirst.decorator.CondimentDecorator;

/**
 * 具体装饰者：各种调料（牛奶）
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;
  
    public Milk(Beverage beverage) {  
        this.beverage = beverage;  
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 牛奶Milk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}