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
public class Faculty extends Employee {
    private double officeHours;
    private int numOfSubjects;

    public Faculty(double officeHours, int numOfSubjects, int office, double salary, String dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.officeHours = officeHours;
        this.numOfSubjects = numOfSubjects;
    }

    public double getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(double officeHours) {
        this.officeHours = officeHours;
    }

    public int getNumOfSubjects() {
        return numOfSubjects;
    }

    public void setNumOfSubjects(int numOfSubjects) {
        this.numOfSubjects = numOfSubjects;
    }

    @Override
    public String toString() {
        return "Class Name: Faculty" + "\nPerson's Name: " + super.getName();
    }
    
}
