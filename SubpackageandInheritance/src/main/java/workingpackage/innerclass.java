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
public class innerclass {
       
}
class outer{
    class inner{
        int a;
        inner(){a=0;}
        void print(){System.out.print(++a+" ");}
    }
    inner obj;
    int i;
    outer(){obj=new inner();}
    void display(int n){
        for(i=0;i<n;i++)
        obj.print();
    }
}
