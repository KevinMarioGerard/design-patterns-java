package com.kmg.factorymethod;

public class App {
    public static void main(String[] args) {
        ShapeStore quadStore = new QuadShapeStore();
        quadStore.draw("SQUARE");
        quadStore.draw("RECTANGLE");

        ShapeStore circularStore = new CircularShapeStore();
        circularStore.draw("CIRCLE");
        circularStore.draw("ELLIPSE");
    }
}
