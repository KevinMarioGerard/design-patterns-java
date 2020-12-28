package com.kmg.factorymethod;

public abstract class ShapeStore {
    public void draw(String shapeType) {
        Shape shape = getShape(shapeType);
        shape.draw();
    }

    protected abstract Shape getShape(String shapeType);
}