package com.kmg.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CircularShapeStoreTest {

    @Test
    void shouldInstantiateCircle() {
        ShapeStore shapeStore = new CircularShapeStore();

        assertTrue(shapeStore.getShape("CIRCLE") instanceof Circle);
    }

    @Test
    void shouldInstantiateEllipse() {
        ShapeStore shapeStore = new CircularShapeStore();

        assertTrue(shapeStore.getShape("ELLIPSE") instanceof Ellipse);
    }
}

