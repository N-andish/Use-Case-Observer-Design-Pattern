/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author localadmin
 */
public class Channel {
    private List<Subscriber> subs = new ArrayList<>();
    private String title;
    
    public void subscribe(Subscriber sub){
        subs.add(sub);
    }
    public void unSubscribe(Subscriber sub){
        subs.remove(sub);
    }
    public void notifySubscribers(){
        for(Subscriber sub : subs){
            sub.update();
        }
        
    }
    public void upload(String title){
        this.title = title;
        notifySubscribers();
    }

   

    
}
