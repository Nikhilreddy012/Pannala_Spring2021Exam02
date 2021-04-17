/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author Nikhil Reddy Pannala
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three sides of the triangle: ");
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double side3 = scan.nextDouble();
        System.out.print("Enter a color: ");
        String color = scan.next();
        System.out.println("Is it filled?");
        boolean filled = scan.nextBoolean();
        System.out.println("Question 6 \nBy Nikhil Reddy Pannala");
        Triangle tri = new Triangle(side1,side2,side3,color,filled);
        System.out.println(tri);
    }

}
