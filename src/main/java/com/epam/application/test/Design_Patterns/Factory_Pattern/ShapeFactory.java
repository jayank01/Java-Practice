package com.epam.basics.java8.java8.Design_Patterns.Factory_Pattern;

public class ShapeFactory {

    public Shape createShape(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        return switch (type) {
            case "CIRCLE" -> new Circle();
            case "SQUARE" -> new Square();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
