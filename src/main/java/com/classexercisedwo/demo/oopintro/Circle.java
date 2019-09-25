package com.classexercisedwo.demo.oopintro;

public class Circle extends Shape implements Shape.PerimeterInterface
{
    private double radius;

    public Circle(ShapeType shapeType, double radius) {
        super(shapeType);
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        area = Math.PI *radius *radius;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", shapeType=" + shapeType +
                '}';
    }
}
