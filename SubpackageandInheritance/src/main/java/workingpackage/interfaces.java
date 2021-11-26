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
public class interfaces {
    
}
interface inf1{
    int x=10;
    public String eat();
 }
interface inf2{
    int x=100;
    public String travel();
}
class Hello implements inf1,inf2
{
    static int y=inf1.x;
    @Override
    public String eat() { 
        return "Mammal eats food";
    }

    @Override
    public String travel() { 
        return "Mammal travels by feet";
    }
}