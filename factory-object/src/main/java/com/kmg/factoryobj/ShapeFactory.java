package com.kmg.factoryobj;

public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if (shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equals("SQUARE")) {
            return new Square();
        } else {
            throw new IllegalArgumentException("Invalid argument for shapeType.");
        }
    }
}