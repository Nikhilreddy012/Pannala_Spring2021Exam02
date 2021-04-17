/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Nikhil Reddy Pannala
 */
public class Shirts extends Clothes {
    private String size;

    public Shirts(String size) {
        this.size = size;
    }
    
    
    
    @Override
    public int getPrice(String size){
        int p=0;
        switch(size.toUpperCase()){
            case "S":
                p=10;
                break;
            case "M":
                p=15;
                break;
            case "L":
                p=20;
                break;
        }
        return p;
    }
}
