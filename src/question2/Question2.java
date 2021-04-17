/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Scanner;

/**
 *
 * @author Nikhil Reddy Pannala
 */
public class Question2 {

    public static boolean equals(int[][] m1, int[][] m2){
        for(int i=0; i<m1.length; i++){
            for(int j=0; j<m1[i].length; j++){
                if(m1[i][j] != m2[i][j])
                    return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        System.out.print("Enter list1: ");
        for (int[] el : m1) {
            for (int i = 0; i < el.length; i++) {
                el[i] = scan.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        for (int[] el : m2) {
            for (int i = 0; i < el.length; i++) {
                el[i] = scan.nextInt();
            }
        }
        System.out.println("Question 2 \nBy Nikhil Reddy Pannala");
        if(equals(m1,m2)){
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }
    
}
