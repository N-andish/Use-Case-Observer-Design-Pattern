/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

/**
 *
 * @author localadmin
 */
public class ObserverDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Channel nandish = new Channel();
        
        Subscriber s1 = new Subscriber("Isha");
        Subscriber s2 = new Subscriber("Pranav");
        Subscriber s3 = new Subscriber("Kiran");
        Subscriber s4 = new Subscriber("Neha");
        Subscriber s5 = new Subscriber("Prarthana");
        
        nandish.subscribe(s1);
        nandish.subscribe(s2);
        nandish.subscribe(s3);
        nandish.subscribe(s4);
        nandish.subscribe(s5);
        
        s1.subscriberChannel(nandish);
        s2.subscriberChannel(nandish);
        s3.subscriberChannel(nandish);
        s4.subscriberChannel(nandish);
        s5.subscriberChannel(nandish);
        
        nandish.upload("How to learn Programming");
        
        
        
        // TODO code application logic here
    }
    
}
