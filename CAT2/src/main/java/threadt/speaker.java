/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadt;

/**
 *
 * @author ASUS
 */
public class speaker {  
    public static void main(String[] args){
        final seminarhall obj = new seminarhall();
        Thread t1=new Thread(){  
        public void run(){  
        obj.speak("spraker1");  
        }  
        };  
        Thread t2=new Thread(){  
        public void run(){  
        obj.speak("spraker2");  
        }  
        };  
        Thread t3=new Thread(){  
        public void run(){  
        obj.speak("spraker3");  
        }  
        };  
        t1.start();  
        t2.start();
        t3.start();
    }
}
