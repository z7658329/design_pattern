package com.design.pattern.strategy;

public class SubtractStrategy implements Strategy {
  
    public int calculate(int a, int b) {  
        return a - b;  
    }  
}  