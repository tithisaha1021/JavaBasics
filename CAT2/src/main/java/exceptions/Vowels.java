/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author ASUS
 */
public class Vowels {
    public void Exception(String s){
        String vowelall[]={"a","A","e","E","i","I","o","O","u","U"};
        int count = 0; 
                for(int j = 0; j < vowelall.length; j++){
                    if(s.contains(vowelall[j])){
                        count++;
                }
            }
        
        if(count==0){throw new ArithmeticException("the user have entered a wrong phrase");} 
    }  
    public static void main(String[]args){ 
        Vowels v =new Vowels();
        v.Exception("hobby");
    }
}

