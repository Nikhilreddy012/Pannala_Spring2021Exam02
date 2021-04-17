/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Nikhil Reddy Pannala
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 5 \nBy Nikhil Reddy Pannala");
        Person p = new Person("Nikhil", "521 E 7th Street", "1234567890", "nikhil@gmail.com");
        Employee e = new Employee(7, 20000, "05/05/2015", "Nikhil", "521 E 7th Street", "1234567890", "nikhil@gmail.com");
        Student std = new Student(9.5, "Nikhil", "521 E 7th Street", "1234567890", "nikhil@gmail.com");
        Faculty f = new Faculty(8.5, 3, 7, 20000, "05/05/2015", "Nikhil", "521 E 7th Street", "1234567890", "nikhil@gmail.com");
        Staff stf = new Staff("Computer Science", 7, 20000, "05/05/2015", "Nikhil", "521 E 7th Street", "1234567890", "nikhil@gmail.com");
        System.out.println(p.toString());
        System.out.println(e.toString());
        System.out.println(std.toString());
        System.out.println(f.toString());
        System.out.println(stf.toString());
    }

}
