/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PACK1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Fibonacci {
    public static int n1=0,n2=1,n3=0; 
    public static int Takeint(){
        int count;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your limit");
        count=sc.nextInt();
        return count;        
    }
    public static void printFibonacci(int x){ 
       if(x>0){ 
           if(n1==0){  
               n1=1;
               n2=1;
               n3=2;
               System.out.print(n1+" "+n2);
               printFibonacci(x-1);
           }else{
            n3 = n1 + n2;    
            n1 = n2;    
            n2 = n3;    
            System.out.print(" "+n3);   
            printFibonacci(x-1); }   
        }    
    }
    
}
