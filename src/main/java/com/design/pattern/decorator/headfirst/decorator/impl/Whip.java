package com.design.pattern.decorator.headfirst.decorator.impl;

import com.design.pattern.decorator.headfirst.component.Beverage;
import com.design.pattern.decorator.headfirst.decorator.CondimentDecorator;

/**
 * 具体装饰者：各种调料（奶泡）
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;
   
    public Whip(Beverage beverage) {  
        this.beverage = beverage;  
    }
    @Override
    public String getDescription() {  
        return beverage.getDescription() + ", 奶泡Whip";
    }
    @Override
    public double cost() {  
        return .10 + beverage.cost();  
    }  
}  