/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Nikhil Reddy Pannala
 */
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setDiameter(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.round(Math.PI*radius*radius*100)/100.0;
    }
    public double getCircumference(){
        return Math.round(2*Math.PI*radius*100)/100.0;
    }

    @Override
    public String toString() {
        return  "The radius of circle is: " + radius + "cms" + "\nThe area of circle is: " + getArea()+"cm\u00b2" + "\nThe circumference of circle is: " + getCircumference()+"cms";
    }
    
}
