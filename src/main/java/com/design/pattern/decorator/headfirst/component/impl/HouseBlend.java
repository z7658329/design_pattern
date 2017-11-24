package com.design.pattern.decorator.headfirst.component.impl;

import com.design.pattern.decorator.headfirst.component.Beverage;

/**
 * DarkRoast（深焙）、HouseBlend（综合）、Decaf（低咖啡因）及Espresso（浓咖啡）
 * 具体组件角色(ConcreteComponent)
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {  
        description = "综合House Blend Coffee";
    }
    @Override
    public double cost() {  
        return .89;  
    }  
}  