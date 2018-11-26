/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.io.IOException;
import java.util.*;
public class JavaApplication19 {

    
    
    
   
    
    
    public static void main(String[] args) throws InterruptedException  {
      
        NewClass cl = new NewClass();
        Ramka ramka = new Ramka();
      
    Thread  getTime = new NewClass();
        getTime.start();
        
        while(true) {
            
        
        Date czas1=cl.pobierzCzas();
            ramka.ustawTekst(czas1);
            ramka.alarm(czas1);
       System.out.println("Czas z main: "+czas1);
        Thread.sleep(1000);}
       //String czas =  
}
    
  
    
    
    
    
    
}