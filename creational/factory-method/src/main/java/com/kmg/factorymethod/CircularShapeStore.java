package com.kmg.factorymethod;

public class CircularShapeStore extends ShapeStore {
    protected Shape getShape(String shapeType) {
        if (shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equals("ELLIPSE")) {
            return new Ellipse();
        } else {
            throw new IllegalArgumentException("Invalid argument for shapeType.");
        }
    }
}