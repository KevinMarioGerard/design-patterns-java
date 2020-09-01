package com.kmg.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SingletonClassTest {
    @Test
    void testSingletonClass() {
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();

        assertEquals(singletonClass1, singletonClass2);
    }
}