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
public enum Wonders {
    GREATWALLOFCHINA("China"),CHRISTTHEREDEEMERSTATUE("Rio de Janerio"),MACHUPICHHU("Peru"),ChICHENITZA("Mexico"),COLOSSEUM("Rome"),TAJMAHAL("India"),PETRA("Jordan");
    private final String location;

    private Wonders(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
    
}
