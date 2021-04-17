/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nikhil Reddy Pannala
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 3 \nBy Nikhil Reddy Pannala");
        ArrayList<Object> al = new ArrayList<>();
        al.add(new Loan(200000,10,12));
        al.add(new Date());
        al.add(new String("ArrayList"));
        al.add(new Circle(5.0));
        
        for(Object i : al){
            System.out.println(i.toString());
        }
    }
    
}
