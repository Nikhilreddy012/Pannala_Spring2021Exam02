/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Nikhil Reddy Pannala
 */
public class Triangle extends GeometricObject {
    private double side1, side2, side3;
    private String color;
    private boolean filled;

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
        this.filled = filled;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean isFilled() {
        return filled;
    }
    
    @Override
    public double getArea(){
        double half = (side1 + side2 + side3)/2.0;
        return Math.sqrt(half*(half-side1)*(half-side2)*(half-side3));
    }
    
    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Area: "+getArea()+"\nPerimeter: "+getPerimeter()+"\nColor: "+getColor()+"\nFilled: "+isFilled();
    }
    
}
