package com.cai.proxypattern;

public class Proxy implements Subject {
    private Subject subject;
    public Proxy(Subject subject){
        this.subject=subject;
    };
    @Override
    public void request() {
        System.out.println("代理做：");
        subject.request();
    }
}
