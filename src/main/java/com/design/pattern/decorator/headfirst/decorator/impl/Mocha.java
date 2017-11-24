package com.design.pattern.decorator.headfirst.decorator.impl;

import com.design.pattern.decorator.headfirst.component.Beverage;
import com.design.pattern.decorator.headfirst.decorator.CondimentDecorator;

/**
 * 具体装饰者：各种调料（摩卡）
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;
   
    public Mocha(Beverage beverage) {  
        this.beverage = beverage;  
    }
    @Override
    public String getDescription() {  
        return beverage.getDescription() + ", 摩卡Mocha";
    }
    @Override
    public double cost() {  
        return .20 + beverage.cost();  
    }  
}  