package com.design.pattern.decorator.headfirst.decorator;

import com.design.pattern.decorator.headfirst.component.Beverage;

/**
 * 调味品；佐料:Condiment
 * 装饰者角色：CondimentDecorator
 */
public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}