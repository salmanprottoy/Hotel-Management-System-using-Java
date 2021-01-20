package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import services.*;

class UserLogin extends JFrame implements ActionListener{

    JButton jb1=new JButton("Login");
	  JButton jb2=new JButton("Exit");

    JTextField username=new JTextField();
    JPasswordField password=new JPasswordField();

    JLabel jl1=new JLabel("Username");
    JLabel jl2=new JLabel("Password");
    UsersLoginService uls=new UsersLoginService();
    AdminLoginService als=new AdminLoginService();

    HotelManagementSystem hms;

    public UserLogin(){
        setTitle("Hotel Management System");
        setSize(540,350);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jl1.setBounds(80,100,100,30);
        add(jl1);
        username.setBounds(200,100,120,30);
        add(username);

        jl2.setBounds(80,150,100,30);
        add(jl2);
        password.setBounds(200,150,120,30);
        add(password);



        jb1.setBounds(350,100,80,30);
        add(jb1);
        jb1.addActionListener(this);

		    jb2.setBounds(350,150,80,30);
        add(jb2);
        jb2.addActionListener(this);


    }

	  public void actionPerformed(ActionEvent e){
		if(e.getSource()==jb1){
      if(username.getText().equals("")){
          JOptionPane.showMessageDialog(null,"Username Required !!","Error",JOptionPane.ERROR_MESSAGE);
      }
      else if(password.getText().equals("")){
          JOptionPane.showMessageDialog(null,"Password Required !!","Error",JOptionPane.ERROR_MESSAGE);
      }
      else{
          if(uls.userValidation(username.getText(),password.getText())){
              JOptionPane.showMessageDialog(null,"Login Successfull !!","Verified",JOptionPane.INFORMATION_MESSAGE);
              HotelManagementSystem hms=new HotelManagementSystem();
              setVisible(false);
          }
          else if(als.userValidation(username.getText(),password.getText())){
              JOptionPane.showMessageDialog(null,"Login Successfull !!","Verified",JOptionPane.INFORMATION_MESSAGE);
              HotelManagementSystem hms=new HotelManagementSystem();
              setVisible(false);
          }
          else{
              JOptionPane.showMessageDialog(null,"Login Failed !!","Verification Denied",JOptionPane.ERROR_MESSAGE);
          }
      }
		}
		else if(e.getSource()==jb2){
				System.exit(0);
		}
	}
}
