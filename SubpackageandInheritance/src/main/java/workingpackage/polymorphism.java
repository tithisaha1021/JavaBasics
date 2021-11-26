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
public class polymorphism {
    
}
class Bank{
float getRateOfInterest(){return 0;}
}
class SBI extends Bank{
@Override
float getRateOfInterest(){return 8.4f;}
}
class ICICI extends Bank{
@Override
float getRateOfInterest(){return 7.3f;}
}
class AXIS extends Bank{
@Override
float getRateOfInterest(){return 9.7f;}
}
