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
public class Subscriber {
    private String name;
    private Channel channel = new Channel();
    
    public Subscriber(String name){
        super();
        this.name = name;
    }
    
    public void update(){
        System.out.println("Hey"   +  name  +  "Video Uploaded");
    }
    public void subscriberChannel(Channel ch){
        channel = ch;
    }

    
    
}
