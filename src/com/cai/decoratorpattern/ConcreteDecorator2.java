package com.cai.decoratorpattern;

public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component){
        super(component);
    }
    private void method2(){
        System.out.println("修饰方法2");
    }

    @Override
    public void operate() {
        method2();
        super.operate();
    }
}