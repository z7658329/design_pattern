package com.design.pattern.decorator.headfirst;

import com.design.pattern.decorator.headfirst.component.Beverage;
import com.design.pattern.decorator.headfirst.component.impl.DarkRoast;
import com.design.pattern.decorator.headfirst.component.impl.Espresso;
import com.design.pattern.decorator.headfirst.component.impl.HouseBlend;
import com.design.pattern.decorator.headfirst.decorator.impl.Mocha;
import com.design.pattern.decorator.headfirst.decorator.impl.Soy;
import com.design.pattern.decorator.headfirst.decorator.impl.Whip;

/**
 * Created by lei02.zou on 2017/11/24.
 *
 *
 * 装饰者模式的定义
 　　装饰者模式动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案。

 1.抽象组件角色(Component)：定义一个对象接口，以规范准备接受附加责任的对象， 即可以给这些对象动态地添加职责。
 2.具体组件角色(ConcreteComponent) :被装饰者，定义一个将要被装饰增加功能的类。 可以给这个类的对象添加一些职责
 3.抽象装饰器(Decorator):维持一个指向构件Component对象的实例， 并定义一个与抽象组件角色Component接口一致的接口
 4.具体装饰器角色（ConcreteDecorator):向组件添加职责。

 * 咖啡店的类设计：
 为星巴兹咖啡连锁店设计饮料菜单，咖啡可加的调料有豆浆、牛奶、摩卡 奶泡等。可在咖啡的基础上加入不同的调料，
 星巴兹会根据所加的调料收取不同的费用，要注意到，以后可能有新的调料被加入进来供顾客选择。
 并且本店现有DarkRoast（深焙）、HouseBlend（综合）、Decaf（低咖啡因）及Espresso（浓咖啡）四种类型的咖啡，
 而且以后可能会添加新的咖啡种类。

 使用装饰者模式，四种咖啡为具体组件，调料为具体装饰者。
 　　一个饮料基类，各种饮料类继承这个基类，并且计算各自的价钱。

 　　饮料中需要加入各种调料，考虑在基类中加入一些布尔值变量代表是否加入各种调料，基类的cost()中的计算各种调料的价钱，子类覆盖cost()，并且在其中调用超类的cost()，加上特定饮料的价钱，计算出子类特定饮料的价钱。

 　　缺点：类数量爆炸、基类加入的新功能并不适用于所有的子类、调料价钱的改变、新调料的出现都会要求改变现有代码；有的子类并不适合某些调料等情况……

 解决咖啡店饮料问题的方法：

 　　以饮料为主体，然后在运行时以调料来“装饰”饮料。

 　　比如，顾客想要摩卡（Mocha）和奶泡（Whip）深焙咖啡（DarkRoast）：

 　　DarkRoast继承自Beverage，有一个cost()方法。

 　　第一步，以DarkRoast对象开始；

 　　第二步，顾客想要摩卡，所以建立一个Mocha装饰者对象，并用它将DarkRoast对象包装（wrap）起来；

 　　第三步，顾客想要奶泡，所以建立一个Whip装饰者对象，并用它将Mocha对象包起来；（Mocha和Whip也继承自Beverage，有一个cost()方法）；

 　　最后，为顾客算钱，通过调用最外圈装饰者（Whip）的cost()就可以。Whip()的cost()会先委托它装饰的对象（Mocha）计算出价钱，然后在加上奶泡的价钱。Mocha的cost()也是类似。
 */

public class TestHeadFirstDecorator {

    public static void main(String[] args) {
        /**
         * 去resource目录下 看类图 一看就明白
         * 四种咖啡价格：
         * DarkRoast（深焙）:0.99、
         * HouseBlend（综合）:.89
         * Decaf（低咖啡因）:1.05
         * Espresso（浓咖啡）:1.99
         *
         * 调料价格：
         * Milk 牛奶：.10
         * Mocha 摩卡：.20
         * Soy 豆浆：.15
         * Whip 奶泡：.1
         */
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
