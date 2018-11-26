/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diotr
 */   
public class NewClass extends Thread {
  

   
  
    @Override
    public void run(){
    pobierzCzas();
    
        
    }
    public Date pobierzCzas(){
    
    
       
           Date time = new Date();
           System.out.println("Czas z pętli: "+time);
           
           
           return time;
       
       }
    
    
    
    
    }
    
    
   
   
  

 
    
   
