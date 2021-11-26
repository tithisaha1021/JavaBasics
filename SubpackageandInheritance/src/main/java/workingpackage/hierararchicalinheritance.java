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
class hierarchicalinheritance
{
public void methodA()
{
System.out.println("methodA of Class hierarchicalinheritance");
}
}
class B extends hierarchicalinheritance
{
public void methodB()
{
System.out.println("methodB of Class B which extends hierarchicalinheritance");
}
}
class C extends hierarchicalinheritance
{
public void methodC()
{
System.out.println("methodC of Class C which extends hierarchicalinheritance");
}
}
