package com.design.pattern.proxy.compiler.test;

import java.lang.reflect.Method;

import com.design.pattern.proxy.proxy.Moveable;

public class Test2 {
	public static void main(String[] args) {
		Method[] methods = Moveable.class.getMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
	}
}
