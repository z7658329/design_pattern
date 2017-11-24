package com.design.pattern.strategy;

/**
 * 策略模式的组成
 a. 抽象策略角色：策略类，通常由一个接口或者抽象类实现[例如 Comparator接口]
 b. 具体策略角色：包装了相关的算法和行为 [例如 实现Comparator这个接口的实现类]
 c. 环境角色：持有一个策略类的引用，最终给客户端调用的。[环境角色例如TreeSet，客户端调用这个构造方法的对象]
 * Created by lei02.zou on 2017/11/23.
 */
public class TestStrategy {
    public static void main(String[] args) {
        //传递加法策略，实现加法操作
        AddStrategy addStrategy = new AddStrategy();
        Environment environment = new Environment(addStrategy);
        System.out.println("加法策略environment.calculate(3, 4) 结果："+environment.calculate(3, 4));

        //传递减法策略，实现减法操作,这边使用了set方法将其策略直接转为减法策略，而不需要再去new这个环境了。
        SubtractStrategy subtractStrategy = new SubtractStrategy();
        environment.setStrategy(subtractStrategy);
        System.out.println("减法策略environment.calculate(3, 4) 结果："+environment.calculate(3, 4));

        //传递乘法策略，实现减法操作,这边使用了set方法将其策略直接转为减法策略，而不需要再去new这个环境了。
        MultiplyStrategy multiplyStrategy = new MultiplyStrategy();
        environment.setStrategy(multiplyStrategy);
        System.out.println("乘法策略environment.calculate(3, 4) 结果："+environment.calculate(3, 4));

        //传递除法策略，实现减法操作,这边使用了set方法将其策略直接转为减法策略，而不需要再去new这个环境了。
        DivideStrategy divideStrategy = new DivideStrategy();
        environment.setStrategy(divideStrategy);
        System.out.println("除法策略environment.calculate(3, 4) 结果："+environment.calculate(3, 4));
    }
}
