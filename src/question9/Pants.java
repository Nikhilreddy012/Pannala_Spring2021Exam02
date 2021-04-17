/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Nikhil Reddy Pannala
 */
public class Pants implements Clothes {
    private int waistSize;

    public Pants(int waistSize) {
        this.waistSize = waistSize;
    }
    
    @Override
    public int getPrice(int waistSize){
        int p=0;
        switch(waistSize){
            case 30:
                p=10;
                break;
            case 32:
                p=15;
                break;
            case 34:
                p=20;
                break;
        }
        return p;
    }
}
