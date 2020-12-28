package com.kmg.factoryobj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ShapeFactoryTest {

  @Test
  void shouldInstantiateCirle() {
      Shape shape = ShapeFactory.getShape("CIRCLE");
      assertTrue(shape instanceof Circle);
  }

  @Test
  void shouldInstantiateRectangle() {
      Shape shape = ShapeFactory.getShape("RECTANGLE");
      assertTrue(shape instanceof Rectangle);
  }

  @Test
  void shouldInstantiateSquare() {
      Shape shape = ShapeFactory.getShape("SQUARE");
      assertTrue(shape instanceof Square);
  }
}

