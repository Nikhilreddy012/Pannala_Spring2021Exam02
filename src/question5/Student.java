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
public class Student extends Person {
    private double grade;
    private final String status = "Graduate";

    public Student(double grade, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Class Name: Student" + "\nPerson's Name: " + super.getName();
    }
    
}
