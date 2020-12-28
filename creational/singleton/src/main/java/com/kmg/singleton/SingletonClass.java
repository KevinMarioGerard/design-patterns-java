package com.kmg.singleton;

public class SingletonClass {
    
    /**
     * Private constructor to prevent instantiation
    */
     private SingletonClass() {}

    private static final SingletonClass INSTANCE = new SingletonClass();

    /**
     * @return singleton instance 
     */
    public static SingletonClass getInstance() {
        return INSTANCE;
    }
}