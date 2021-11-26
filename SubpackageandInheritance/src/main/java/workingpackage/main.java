/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingpackage;
import mypackage.simpleclass;
import mypackage.subpackage.classA;
/**
 *
 * @author ASUS
 */



public class main {
        public static void main(String[]args){
        /*//----------subpackage---------
        System.out.println("This is working package");
        simpleclass sc = new simpleclass();
        sc.simplemethod();
        System.out.println(sc.s);
        classA ca = new classA();
        ca.methodA();
        System.out.println(ca.st);
        */
        /*//-----HierarchicalInheritance------
        B obj1 = new B();
        C obj2 = new C(); 
        obj1.methodA();
        obj1.methodB();
        obj2.methodA();
        obj2.methodC(); 
        //-------Multilevelinheritance-----
        multilevel obj = new multilevel();
        obj.methodA();
        obj.methodB();
        obj.methodlevel2();*/
        /*//------polygon-------
        polygon obj;
        obj=new sqr(10);
        obj.area();
        obj=new cube(5);
        obj.area();*/
        //------innerclass------ 
        /*outer ob=new outer();
        ob.display(15);
        System.out.println();
        for(int i=0; i<args.length; i++)
        System.out.println("args[" + i + "]: " + args[i]);*/
        //-------polymorphism--------
        /*Bank b;
        b=new SBI();
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
        b=new ICICI();
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
        b=new AXIS();
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());*/
        //--------abstractclass---
        /*abstractclass student = new abstractclass("Shakthi","Team Lead",0);
        abstractclass employee = new abstractclass("Karthik","Developer",123);
        //Person student = new Employee("Shakthi","Team Lead",0);
        //Person employee = new Employee("Karthik","Developer",123);
        //Person p=new Person("aaaa","bbbb",12);
        student.work();
        employee.work();
        employee.changeName("Goutham");
        System.out.println(employee.toString());*/
        /*//-----final keyword-----
        c2 obj = new c2();
        obj.display();
        c1 obj1 = new c1();
        obj1.display();*/
        Hello h=new Hello();
        System.out.println(h.y);
        System.out.println(inf2.x);
        System.out.println(h.eat());
        System.out.println(h.travel());
        
    }
    
}
