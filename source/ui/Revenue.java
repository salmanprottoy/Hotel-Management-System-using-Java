import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Revenue extends JFrame implements ActionListener{

  JButton jb1=new JButton("Daily Revenue");
  JButton jb2=new JButton("Monthly Revenue");
  JButton jb3=new JButton("Yearly Revenue");

  JTextField jtf1=new JTextField();
  JTextField jtf2=new JTextField();
  JTextField jtf3=new JTextField();



    public Revenue(){

      setTitle("Hotel Management System");
      setSize(345,150);
      setVisible(true);
      setLayout(null);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

      jb1.setFont(new Font("Tahoma", 0, 14));
      jb2.setFont(new Font("Tahoma", 0, 14));
      jb3.setFont(new Font("Tahoma", 0, 14));

      jtf1.setFont(new Font("Tahoma", 0, 14));
      jtf2.setFont(new Font("Tahoma", 0, 14));
      jtf3.setFont(new Font("Tahoma", 0, 14));

      jb1.setBounds(10,10,150,25);
      jb2.setBounds(10,40,150,25);
      jb3.setBounds(10,70,150,25);

      jtf1.setBounds(170,10,150,25);
      jtf2.setBounds(170,40,150,25);
      jtf3.setBounds(170,70,150,25);


      add(jb1);
      add(jb2);
      add(jb3);

      add(jtf1);
      add(jtf2);
      add(jtf3);

      jb1.addActionListener(this);
      jb2.addActionListener(this);
      jb3.addActionListener(this);

    }

      public void actionPerformed(ActionEvent e){

          if(e.getSource()==jb1){


          }
          else if(e.getSource()==jb1){


          }
          else if(e.getSource()==jb1){


          }

      }

}
