/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda;

/**
 *
 * @author ASUS
 */
class lambda1 {
    
    public static void main(String args[]){  
        deperciation d=/*new deperciation(){
        @Override
        public double currentvalue*/(double actualcost,double years,double deperciation)->//lambda->
        { 
            return (actualcost-years*deperciation*actualcost);
        }; //} 
        //double currentval= d.currentvalue(0, 0, 0);
        laptop l=new  laptop();
        System.out.println(d.currentvalue(l.actual_cost,l.no_of_years,l.deperciation_index) );
    }
}

