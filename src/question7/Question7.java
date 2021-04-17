/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author Nikhil Reddy Pannala
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a planet name: ");
        String pName = scan.next();
        System.out.println("Enter one of the wonders: ");
        String wName = scan.next();
        System.out.println("Question 7 \nBy Nikhil Reddy Pannala");
        switch(pName.toUpperCase()){
            case "MERCURY":
                System.out.println("The position of "+pName+" is: "+Planets.MERCURY.getPosFromSun());
                break;
             case "VENUS":
                System.out.println("The position of "+pName+" is: "+Planets.VENUS.getPosFromSun());
                break;
             case "EARTH":
                System.out.println("The position of "+pName+" is: "+Planets.EARTH.getPosFromSun());
                break;
             case "MARS":
               System.out.println("The position of "+pName+" is: "+Planets.MARS.getPosFromSun());
               break;
             case "JUPITER":
                System.out.println("The position of "+pName+" is: "+Planets.JUPITER.getPosFromSun());
                break;
              case "SATURN":
                System.out.println("The position of "+pName+" is: "+Planets.SATURN.getPosFromSun());
                break;
              case "URANUS":
                System.out.println("The position of "+pName+" is: "+Planets.URANUS.getPosFromSun());
                break;
              case "NEPTUNE":
                System.out.println("The position of "+pName+" is: "+Planets.NEPTUNE.getPosFromSun());
                break;  
              default:
                  System.out.println("Enter a valid planet");
                  break;
        }
        switch(wName.toUpperCase()){
            case "GREATWALLOFCHINA":
                System.out.println("The "+wName+" is located at: "+Wonders.GREATWALLOFCHINA.getLocation());
                break;
            case "CHRISTTHEREDEEMERSTATUE":
                System.out.println("The "+wName+" is located at: "+Wonders.CHRISTTHEREDEEMERSTATUE.getLocation());
                break;
            case "MACHUPICHHU":
                System.out.println("The "+wName+" is located at: "+Wonders.MACHUPICHHU.getLocation());
                break;
            case "ChICHENITZA":
                System.out.println("The "+wName+" is located at: "+Wonders.ChICHENITZA.getLocation());
                break;
            case "COLOSSEUM":
                System.out.println("The "+wName+" is located at: "+Wonders.COLOSSEUM.getLocation());
                break;
            case "TAJMAHAL":
                System.out.println("The "+wName+" is located at: "+Wonders.TAJMAHAL.getLocation());
                break;
            case "PETRA":
                System.out.println("The "+wName+" is located at: "+Wonders.PETRA.getLocation());
                break;
            default:
                System.out.println("Enter a valid wonder");
                break;
        }
    }
    
}
