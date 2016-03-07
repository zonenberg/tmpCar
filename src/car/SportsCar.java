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
public class SportsCar extends Car {
    
    void info() {
        System.out.println("Aktualni rychlost sportaku: " + getSpeed());
    }

    public SportsCar(Engine engine) {
        super(engine);
    }
    
}
