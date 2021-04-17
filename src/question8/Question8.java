/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

import java.util.Scanner;

/**
 *
 * @author Nikhil Reddy Pannala
 */
public class Question8{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 8 \nBy Nikhil Reddy Pannala");
        Shirts s = new Shirts("S");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of shirt: ");
        String size = scan.next();
        System.out.println("The price of a "+size+" shirt is: "+s.getPrice(size));
    }
    
}
