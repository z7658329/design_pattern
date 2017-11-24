package com.design.pattern.decorator.headfirst.component.impl;

import com.design.pattern.decorator.headfirst.component.Beverage;

/**
 * 具体组件角色(ConcreteComponent)：无咖啡因咖啡
 * DarkRoast（深焙）、HouseBlend（综合）、Decaf（低咖啡因）及Espresso（浓咖啡）
 */
public class Decaf extends Beverage {
    public Decaf() {
		description = "低咖啡因Decaf Coffee";
	}
	@Override
	public double cost() {
		return 1.05;
	}
}