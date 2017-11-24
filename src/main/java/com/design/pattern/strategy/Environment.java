package com.design.pattern.strategy;

public class Environment {
    private Strategy strategy; //定义的类型是一个抽象类型，这样才能传具体的算法，加减乘除.  
    public Environment(Strategy strategy){  
        this.strategy = strategy;  
    }  
      
    //提供一个Set方法，可以改变将指定的策略传递进去，使用完成之后可以还可以换一种策略。      
    public void setStrategy(Strategy strategy){  
        this.strategy = strategy;  
    }  
    public Strategy getStrategy(){  
        return this.strategy;  
    }  
      
    /*  
     * 这边的到底使用何种算法，是在这里完成的，通过传递strategy参数来决定到底使用何种算法。加减乘除  
     */  
    public int calculate(int a, int b){  
        return strategy.calculate(a, b);  //不管calculate()方法是做什么的，传什么就用什么方法。  
    }  
}  