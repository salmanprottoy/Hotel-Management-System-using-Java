package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import services.*;

class HmsOption extends JFrame implements ActionListener{

    JButton jb1=new JButton("Sign Up for New User");
    JButton jb2=new JButton("Go to HMS");
    JButton jb3=new JButton("Sign out");
    JButton jb4=new JButton("Exit");

    HotelManagementSystem hms;
    AdminLogin al;
    SignupUser su;

    public HmsOption(){

      setTitle("Hotel Management System");
      setSize(430,390);
      setVisible(true);
      setLayout(null);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

      jb1.setFont(new Font("Tahoma", 0, 14));
      jb2.setFont(new Font("Tahoma", 0, 14));
      jb3.setFont(new Font("Tahoma", 0, 14));
      jb4.setFont(new Font("Tahoma", 0, 14));

      jb1.setBounds(10,10,180,150);
      jb2.setBounds(220,10,180,150);
      jb3.setBounds(10,180,180,150);
      jb4.setBounds(220,180,180,150);

      add(jb1);
      add(jb2);
      add(jb3);
      add(jb4);

      jb1.addActionListener(this);
      jb2.addActionListener(this);
      jb3.addActionListener(this);
      jb4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){

      if(e.getSource()==jb1){

        this.setVisible(false);
        su=new SignupUser();

      }
      else if(e.getSource()==jb2){

        this.setVisible(false);
        hms=new HotelManagementSystem();

      }
      else if(e.getSource()==jb3){

        this.setVisible(false);
        al=new AdminLogin();
      }
      else if(e.getSource()==jb4){

        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit","Hotel Management System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
          System.exit(0);
      }
    }
  }

}
