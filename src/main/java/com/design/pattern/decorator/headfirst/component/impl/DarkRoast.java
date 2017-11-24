package com.design.pattern.decorator.headfirst.component.impl;

import com.design.pattern.decorator.headfirst.component.Beverage;

/**
 * 具体组件角色(ConcreteComponent)：深焙咖啡
 * DarkRoast（深焙）、HouseBlend（综合）、Decaf（低咖啡因）及Espresso（浓咖啡）
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
		description = "深焙 Dark Roast Coffee";
	}
	@Override
	public double cost() {
		return 0.99;
	}
}