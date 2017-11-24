package com.design.pattern.decorator.headfirst.component.impl;

import com.design.pattern.decorator.headfirst.component.Beverage;

/**
 * DarkRoast（深焙）、HouseBlend（综合）、Decaf（低咖啡因）及Espresso（浓咖啡）
 * 具体组件角色(ConcreteComponent)：浓缩咖啡
 */
public class Espresso extends Beverage {
    
    public Espresso() {  
        description = "浓缩咖啡Espresso";
    }
    @Override
    public double cost() {  
        return 1.99;  
    }  
}  