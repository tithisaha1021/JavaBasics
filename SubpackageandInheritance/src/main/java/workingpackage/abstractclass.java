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
abstract class Person {
    private String name;
    private String desig;
    public Person(String nm, String des){
        this.name=nm;
        this.desig=des;
    }
    public abstract void work();
    @Override
    public String toString(){
        return "Name is "+this.name+" and the designation is "+this.desig;
    }
    public void changeName(String newName) {
        this.name = newName;
    }
}
public class abstractclass extends Person {
    private int empId;
    public abstractclass(String nm, String des, int id) {
        super(nm, des);
        this.empId=id;
    }
    public void work() {
        if(empId == 0){
        System.out.println("Not working");
        }else{
        System.out.println("Working as employee!!");
        }
    } 
}
