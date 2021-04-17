/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Nikhil Reddy Pannala
 */
public class Question1 {
    
     public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> distinctList = new ArrayList<>();
        for(Integer i: list){
            if(!distinctList.contains(i)){
                distinctList.add(i);
            }
        }
        System.out.print("The distinct integers are ");
        for(Integer i : distinctList){
            System.out.print(i+" ");
        }
         System.out.println();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter ten integers: ");
        for(int i=0; i<10; i++){
            list.add(scan.nextInt());
        }
        System.out.println("Question 1 \nBy Nikhil Reddy Pannala");
        removeDuplicate(list);
    }
}