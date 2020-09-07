package com.kmg.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class QuadShapeStoreTest {

    @Test
    void shouldInstantiateSquare() {
        ShapeStore shapeStore = new QuadShapeStore();

        assertTrue(shapeStore.getShape("SQUARE") instanceof Square);
    }

    @Test
    void shouldInstantiateRectangle() {
        ShapeStore shapeStore = new QuadShapeStore();

        assertTrue(shapeStore.getShape("RECTANGLE") instanceof Rectangle);
    }
}

