package com.prototype;

public class Main {
    public static void main(String[] args) {

        Paint paint1 = new Paint("azul", "matte");
        Paint paint2 = new Paint("rojo", "brilloso");
        Circle circle = new Circle("Bob el circulo", paint1, 12);
        Rectangle rectangle = new Rectangle("Rob el rectangulo", paint2, 10, 14);
        Triangle triangle = new Triangle("Ten el triangulo", paint2, 10, 10, 10);

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

        System.out.println("PAINT");
        System.out.println("Same object: " + (paint2.hashCode() == triangleClone.getPaint().hashCode()));
        System.out.println("Same fields: " + paint2.equals(triangleClone.getPaint()));
        System.out.println("--------------------------");

    }
}
