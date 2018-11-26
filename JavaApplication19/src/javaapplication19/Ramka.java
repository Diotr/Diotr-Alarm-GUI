/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;
import java.awt.Font;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.*;  
import java.util.Date;
/**
 *
 * @author Diotr
 */
public class Ramka extends JFrame implements ActionListener{
    JTextField textfield1;
    JTextField textfield2;
    JPanel panel;
    String czas3;
    String alarm;
    public Ramka() {
        new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        textfield1 = new JTextField("",35);
        textfield2 = new JTextField("",35);
        Font font1 =new Font("SansSerif", Font.BOLD, 60);
        panel = new JPanel();
        this.setSize(400, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.add(panel);
        
        panel.add(textfield1);
        panel.add(textfield2);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.red);
        textfield1.setHorizontalAlignment(JTextField.CENTER);
        textfield1.setFont(font1);
        textfield1.setBackground(Color.green);
        
        textfield2.setBackground(Color.red);
        textfield2.setFont(font1);
        
        textfield2.addActionListener(this);
        this.setVisible(true);
    }
    SimpleDateFormat formated = new SimpleDateFormat("HH:mm:ss" );
          public void ustawTekst(Date czas2){
        
        czas3 = formated.format(czas2);
         textfield1.setText(czas3);
}
          
          public  void poleAlarmu(){
          
          textfield2.setText("Alarm! ");
          }

          
          @Override
    public void actionPerformed(ActionEvent e) {
        
        alarm = textfield2.getText();
        System.out.println("Alarm z listenera: "+alarm);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public void alarm(Date time){
        SimpleDateFormat formated = new SimpleDateFormat("HH:mm:ss" );
        String czas = formated.format(time);
        alarm = "19:40:00"+ "";
       if(czas.equals(alarm)){
           System.out.println("Alarm! ");
           poleAlarmu();
       
       }
    


}

    
}
