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
public abstract class Car {
    private int speed;
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    
    void accelerate(int seconds) {
         speed += engine.accelerate(seconds);
    }
    
       
    public int getSpeed() {
        return speed;
    }
    
    
    abstract void info();
}
    
 