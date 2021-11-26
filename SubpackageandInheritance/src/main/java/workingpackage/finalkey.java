/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingpackage;

/**
 *
 * @author ASUS
 */
public class finalkey {
    
}
final class c1{
    final void display(){
        System.out.print("Hello in c1");
    }
}
class c2 //cannot extend c1
{
    void display(){
        System.out.print("Hello in c2");
        final int a=0;
        //cannot assign a value 
        //a=9;
    }
}