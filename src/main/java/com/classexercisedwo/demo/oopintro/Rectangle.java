package com.classexercisedwo.demo.oopintro;

public class Rectangle extends Shape implements Shape.PerimeterInterface
{
    private double length;
    private double width;

    public Rectangle(ShapeType shapeType, double length, double width) {
        super(shapeType);
        this.length = length;
        this.width = width;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    void calculateArea() {
      area = length * width;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2*(length +width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", shapeType=" + shapeType +
                '}';
    }
}
