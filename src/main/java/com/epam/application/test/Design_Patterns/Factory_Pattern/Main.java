package com.epam.basics.java8.java8.Design_Patterns.Factory_Pattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.createShape("CIRCLE");
        Shape shape2 = shapeFactory.createShape("SQUARE");
        Shape shape3 = shapeFactory.createShape("RECTANGLE");

        shape1.draw();
        shape2.draw();
        shape3.draw();

    }
}
