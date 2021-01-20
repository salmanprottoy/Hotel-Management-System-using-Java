package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import services.*;

class LoginOption extends JFrame implements ActionListener{

  JButton jb1=new JButton("Login as an admin");
  JButton jb2=new JButton("Login as a reciptionist");

  UserLogin ul;
  AdminLogin al;

    public LoginOption(){

      setTitle("Hotel Management System");
      setSize(410,190);
      setVisible(true);
      setLayout(null);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

      jb1.setFont(new Font("Tahoma", 0, 14));
      jb2.setFont(new Font("Tahoma", 0, 14));

      jb1.setBounds(10,10,180,120);
      add(jb1);
      jb1.addActionListener(this);

      jb2.setBounds(200,10,180,120);
      add(jb2);
      jb2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){

      if(e.getSource()==jb1){

          al=new AdminLogin();
          this.setVisible(false);

      }
      else if(e.getSource()==jb2){

        ul=new UserLogin();
        this.setVisible(false);

      }

    }

    public static void main(String[] args) {

        LoginOption lo=new LoginOption();
    }

}
