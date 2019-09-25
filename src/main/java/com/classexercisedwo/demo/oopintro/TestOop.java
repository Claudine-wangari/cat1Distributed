package com.classexercisedwo.demo.oopintro;

public class TestOop
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(ShapeType.TWO_D, 12, 12);
        System.out.println(rectangle.toString());

        Circle circle = new Circle(ShapeType.TWO_D, 7);
        System.err.println(circle.toString());

        Triangle triangle = new Triangle(ShapeType.THREE_D, 12, 12);
        System.out.println(triangle.toString());
    }
}