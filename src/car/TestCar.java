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
public class TestCar {
    private Car[] carList = new Car[3];
    
    public TestCar() {
        carList[0] = new SportsCar(new Engine(5));
        carList[1] = new Traktor(new SuperEngine(1));
        carList[2] = new Suv(new Engine(3));

    }
    
    public void testujRychlost() {
        // zrychluje 3 vtetiny
        // zrychluje 5 vtetin
        for(int i = 0; i < 3; i++) {
            carList[i].accelerate(2);
            carList[i].info();
        }
        // zrychluje 10 vtetin     
        for(int i = 0; i < 3; i++) {
            carList[i].accelerate(5);
            carList[i].info();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestCar test = new TestCar();
        test.testujRychlost();       
    }    
}