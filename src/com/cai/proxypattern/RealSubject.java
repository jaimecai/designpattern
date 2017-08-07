package com.cai.proxypattern;

public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("自己做点事");
    }
}
