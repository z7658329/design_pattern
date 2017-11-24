package com.design.pattern.decorator.headfirst.decorator.impl;

import com.design.pattern.decorator.headfirst.component.Beverage;
import com.design.pattern.decorator.headfirst.decorator.CondimentDecorator;

/**
 * 具体装饰者：各种调料(豆浆)
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;
  
    public Soy(Beverage beverage) {  
        this.beverage = beverage;  
    }
    @Override
    public String getDescription() {  
        return beverage.getDescription() + ", 豆浆Soy";
    }
    @Override
    public double cost() {  
        return .15 + beverage.cost();  
    }  
}  