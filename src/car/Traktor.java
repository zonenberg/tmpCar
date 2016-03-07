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
public class Traktor extends Car {

    public Traktor(Engine engine) {
        super(engine);
    }
    
    void info() {
        System.out.println("Aktualni rychlost traktoru: " + getSpeed());
    }
    
}