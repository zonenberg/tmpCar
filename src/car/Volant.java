/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author jiri.sonnenschein
 */
public class Volant {
    private int angle;
    
    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
    

    public void turnLeft() {
        angle -=10;
    }
    
    public void turnRight() {
        angle +=10;
    }
}
