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
public class SuperEngine extends Engine {

    public SuperEngine(int acc) {
        super(acc);
    }
   
    public int accelerate(int seconds) {
       return  2 * super.accelerate(seconds);
    }
    
}
