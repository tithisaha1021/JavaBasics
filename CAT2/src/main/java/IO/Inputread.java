/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

/**
 *
 * @author ASUS
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



/**
 *
 * @author ASUS
 */
public class Inputread {
   public static void main(String args[]) throws IOException {  
      BufferedReader in = new BufferedReader(new FileReader("input.txt"));
      BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
      try {
          String line = null;  String[] lineItems = null;
         while((line = in.readLine()) != null){
               lineItems = line.split(" ");   
            }
         for (int i= 0;i<lineItems.length;i++){
              System.out.println(lineItems[i]);
              out.write(lineItems[i]+"\t");
        }
         
      }catch(IOException e){}
         finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }    
    
}
