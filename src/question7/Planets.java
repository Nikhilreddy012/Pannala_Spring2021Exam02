/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author Nikhil Reddy Pannala
 */
public enum Planets {
    MERCURY(1),VENUS(2), EARTH(3), MARS(4), JUPITER(5), SATURN(6), URANUS(7),NEPTUNE(8);
    private final int posFromSun;

    private Planets(int posFromSun) {
        this.posFromSun = posFromSun;
    }

    public int getPosFromSun() {
        return posFromSun;
    }
    
}
