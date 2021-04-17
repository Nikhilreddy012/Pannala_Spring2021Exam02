/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.util.Scanner;

/**
 *
 * @author Nikhil Reddy Pannala
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pants p = new Pants(30);
        Scanner scan = new Scanner(System.in);
        System.out.println("Question 9 \nBy Nikhil Reddy Pannala");
        System.out.println("Enter the waist size: ");
        int ws = scan.nextInt();
        System.out.println("The price of the pant is: "+p.getPrice(ws));
    }
    
}
