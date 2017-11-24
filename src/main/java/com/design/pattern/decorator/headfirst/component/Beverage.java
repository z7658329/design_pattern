package com.design.pattern.decorator.headfirst.component;

/**
 * 抽象组件角色(Component)：Beverage（饮料）
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage(饮料)";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}