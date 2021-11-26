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
 
class polygon
{
polygon()
{
System.out.print("Hello");
}
void area()
{
}
}
class sqr extends polygon
{
protected int side;
sqr(int s)
{
super();
//this();
this.side=s;
}
void area()
{
System.out.println("The area is "+(side*side));
}
}
class cube extends sqr
{
cube(int a)
{
super(a);
}
void area()
{
System.out.println("The area is "+6*(side*side));
}
}
