package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import services.*;

class SignupUser extends JFrame implements ActionListener{

    JLabel jl1=new JLabel("Username");
    JLabel jl2=new JLabel("Password");
    JLabel jl3=new JLabel("Confirm Password");

    JTextField username=new JTextField();
    JPasswordField password1=new JPasswordField();
    JPasswordField password2=new JPasswordField();

    JButton jb1=new JButton("Sign Up");
    JButton jb2=new JButton("Back");

    HmsOption hmso;
    UserService us=new UserService();

    public SignupUser(){

      setTitle("Hotel Management System");
      setSize(360,240);
      setVisible(true);
      setLayout(null);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

      jl1.setFont(new Font("Tahoma", 0, 18));
      jl2.setFont(new Font("Tahoma", 0, 18));
      jl3.setFont(new Font("Tahoma", 0, 18));

      username.setFont(new Font("Tahoma", 0, 18));
      password1.setFont(new Font("Tahoma", 0, 18));
      password2.setFont(new Font("Tahoma", 0, 18));

      jb1.setFont(new Font("Tahoma", 0, 18));
      jb2.setFont(new Font("Tahoma", 0, 18));

      jl1.setBounds(10,10,150,30);
      add(jl1);
      username.setBounds(180,10,150,30);
      add(username);

      jl2.setBounds(10,40,150,30);
      add(jl2);
      password1.setBounds(180,40,150,30);
      add(password1);

      jl3.setBounds(10,70,150,30);
      add(jl3);
      password2.setBounds(180,70,150,30);
      add(password2);

      jb1.setBounds(10,120,140,60);
      jb2.setBounds(180,120,150,60);

      add(jb1);
      add(jb2);

      jb1.addActionListener(this);
      jb2.addActionListener(this);

    }

      public void actionPerformed(ActionEvent e){

        if(e.getSource()==jb1){

          if(username.getText().equals("")){
              JOptionPane.showMessageDialog(null,"Username Required !!","Error",JOptionPane.ERROR_MESSAGE);
          }
          else if(password1.getText().equals("")){
              JOptionPane.showMessageDialog(null,"Password Required !!","Error",JOptionPane.ERROR_MESSAGE);
          }
          else if(password2.getText().equals("")){
              JOptionPane.showMessageDialog(null,"Confirm Password Required !!","Error",JOptionPane.ERROR_MESSAGE);
          }
          else{
              if(us.addNewUser(username.getText(),password1.getText())){
                  JOptionPane.showMessageDialog(null,"Signup Successfull !!","Verified",JOptionPane.INFORMATION_MESSAGE);
              }
              else{
                  JOptionPane.showMessageDialog(null,"Signup Failed !!","Verification Denied",JOptionPane.ERROR_MESSAGE);
                  }
              }
          }
          else if(e.getSource()==jb2){
            this.setVisible(false);
            HmsOption hmso=new HmsOption();
          }
    }

}
