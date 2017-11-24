package com.design.pattern.decorator.original;

/**
 * 定义：装饰模式是在不必改变原类文件和使用继承的情况下，动态的扩展一个对象的功能。它是通过创建一个包装对象，也就是装饰来包裹真实的对象。
 *
 * 抽象组件角色(Component)：定义一个对象接口，以规范准备接受附加责任的对象，
 即可以给这些对象动态地添加职责。
 具体组件角色(ConcreteComponent) :被装饰者，定义一个将要被装饰增加功能的类。
 可以给这个类的对象添加一些职责
 抽象装饰器(Decorator):维持一个指向构件Component对象的实例，
 并定义一个与抽象组件角色Component接口一致的接口
 具体装饰器角色（ConcreteDecorator):向组件添加职责。

 Decorator模式至少有两个主要优点和两个缺点：
 1) 比静态继承更灵活： 与对象的静态继承（多重继承）相比， Decorator模式提供了更加灵活的向对象添加职责的方式。可以用添加和分离的方法，用装饰在运行时刻增加和删除职责。相比之下，继承机制要求为每个添加的职责创建一个新的子类。这会产生许多新的类，并且会增加系统的复杂度。此外，为一个特定的Component类提供多个不同的 Decorator类，这就使得你可以对一些职责进行混合和匹配。使用Decorator模式可以很容易地重复添加一个特性。
 2) 避免在层次结构高层的类有太多的特征 Decorator模式提供了一种“即用即付”的方法来添加职责。它并不试图在一个复杂的可定制的类中支持所有可预见的特征，相反，你可以定义一个简单的类，并且用 Decorator类给它逐渐地添加功能。可以从简单的部件组合出复杂的功能。这样，应用程序不必为不需要的特征付出代价。同时更易于不依赖于 Decorator所扩展（甚至是不可预知的扩展）的类而独立地定义新类型的 Decorator。扩展一个复杂类的时候，很可能会暴露与添加的职责无关的细节。
 3) Decorator与它的Component不一样 Decorator是一个透明的包装。如果我们从对象标识的观点出发，一个被装饰了的组件与这个组件是有差别的，因此，使用装饰不应该依赖对象标识。
 4) 有许多小对象 采用Decorator模式进行系统设计往往会产生许多看上去类似的小对象，这些对象仅仅在他们相互连接的方式上有所不同，而不是它们的类或是它们的属性值有所不同。尽管对于那些了解这些系统的人来说，很容易对它们进行定制，但是很难学习这些系统，排错也很困难。
 */
public class TestDecorator {

    public static void main(String[] args) {
        Component component =new ConcreteComponent();//原来的对象
        System.out.println("------------------------------");
        component.method();//原来的方法
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);//装饰成A
        System.out.println("------------------------------");
        concreteDecoratorA.method();//原来的方法
        concreteDecoratorA.methodA();//装饰成A以后新增的方法
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(component);//装饰成B
        System.out.println("------------------------------");
        concreteDecoratorB.method();//原来的方法
        concreteDecoratorB.methodB();//装饰成B以后新增的方法
        concreteDecoratorB = new ConcreteDecoratorB(concreteDecoratorA);//装饰成A以后再装饰成B
        System.out.println("------------------------------");
        concreteDecoratorB.method();//原来的方法
        concreteDecoratorB.methodB();//装饰成B以后新增的方法
    }
}