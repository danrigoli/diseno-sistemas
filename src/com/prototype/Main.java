package com.prototype;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("azul", "matte", 12);
        Rectangle rectangle = new Rectangle("rojo", "brilloso", 10, 14);
        Triangle triangle = new Triangle("verde", "rugoso", 10, 10, 10);

        Circle circleClone = circle.clone();
        Rectangle rectangleClone = rectangle.clone();
        Triangle triangleClone = triangle.clone();

        System.out.println("CIRCLE");
        System.out.println("Same object: " + (circle.hashCode() == circleClone.hashCode()));
        System.out.println("Same fields: " + circle.equals(circleClone));
        System.out.println("--------------------------");

        System.out.println("RECTANGLE");
        System.out.println("Same object: " + (rectangle.hashCode() == rectangleClone.hashCode()));
        System.out.println("Same fields: " + rectangle.equals(rectangleClone));
        System.out.println("--------------------------");

        System.out.println("TRIANGLE");
        System.out.println("Same object: " + (triangle.hashCode() == triangleClone.hashCode()));
        System.out.println("Same fields: " + triangle.equals(triangleClone));
        System.out.println("--------------------------");

    }
}
