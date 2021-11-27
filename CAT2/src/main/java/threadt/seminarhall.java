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
public class seminarhall {
    synchronized void speak(String s){
         for(int i=1;i<=15;i++){
            System.out.println(s+" is speaking");}
         try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}
     }
    
}
