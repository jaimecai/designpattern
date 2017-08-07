package com.cai.decoratorpattern;


public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("do something");
    }
}
