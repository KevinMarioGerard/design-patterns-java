package com.kmg.factorymethod;

public class QuadShapeStore extends ShapeStore {
    
    protected Shape getShape(String shapeType) {
        if (shapeType.equals("SQUARE")) {
            return new Square();
        } else if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        } else {
            throw new IllegalArgumentException("Invalid argument for shapeType.");
        }
    }
}