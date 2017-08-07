package com.cai.proxypattern;

public class Client {
    public static void main(String[] args) {
        RealSubject rs=new RealSubject();
        Proxy p=new Proxy(rs);
        p.request();
    }
}
