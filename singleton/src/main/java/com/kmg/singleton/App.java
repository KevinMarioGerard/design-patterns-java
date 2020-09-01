package com.kmg.singleton;

public class App {
    
    public static void main(String[] args) {
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();

        System.out.println("singletonClass1 = " + singletonClass1);
        System.out.println("singletonClass2 = " + singletonClass2);
    }
}