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
public class Loan {
    private double amount;
    private double interestRate;
    private int numOfMonths;

    public Loan(double amount, double interestRate, int numOfMonths) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.numOfMonths = numOfMonths;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getNumOfMonths() {
        return numOfMonths;
    }

    public void setNumOfMonths(int numOfMonths) {
        this.numOfMonths = numOfMonths;
    }

    public double getInterestAmount(){
        return (numOfMonths*interestRate*amount)/100;
    }
    public double getFullAmount(){
        return getInterestAmount() + amount;
    }

    @Override
    public String toString() {
        return "The loan amount is: $" + amount + "\nThe interest rate is: " + interestRate + "\nNumber of Months: " + numOfMonths + "\nThe interest amount is: $" + getInterestAmount() + "\nThe full amount to be paid: $" + getFullAmount();
    }
    
}
