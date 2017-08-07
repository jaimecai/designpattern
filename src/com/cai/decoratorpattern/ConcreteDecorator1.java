package com.cai.decoratorpattern;

public class ConcreteDecorator1 extends Decorator{
    public ConcreteDecorator1(Component component){
        super(component);
    };
    private void method1(){
        System.out.println("修饰方法1");
    }

    @Override
    public void operate() {
        method1();
        super.operate();
    }
}
