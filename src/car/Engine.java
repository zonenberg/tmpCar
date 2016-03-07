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
public class Engine {
    private int acc;
    
    public Engine(int acc) {
        this.acc=acc;
    }
    
    public int accelerate(int seconds) {
        return acc * seconds;
    }
    
    
}
