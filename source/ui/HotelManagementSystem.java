package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class HotelManagementSystem extends JFrame implements ActionListener{

  JLabel jl1=new JLabel("Customer ID: ");
  JLabel jl2=new JLabel("First Name: ");
  JLabel jl3=new JLabel("Last Name: ");
  JLabel jl4=new JLabel("Phone: ");
  JLabel jl5=new JLabel("Email: ");
  JLabel jl6=new JLabel("Address: ");
  JLabel jl7=new JLabel("Post Code: ");
  JLabel jl8=new JLabel("Nationality: ");
  JLabel jl9=new JLabel("Date Of Birth: ");
  JLabel jl10=new JLabel("Gender: ");
  JLabel jl11=new JLabel("ID Type: ");
  JLabel jl12=new JLabel("Check In Date: ");
  JLabel jl13=new JLabel("Check Out Date: ");
  JLabel jl14=new JLabel("Meal: ");
  JLabel jl15=new JLabel("Room Type: ");
  JLabel jl16=new JLabel("Room No: ");
  JLabel jl17=new JLabel("Room Ext. No: ");
  JLabel jl18=new JLabel("Tax: ");
  JLabel jl19=new JLabel("Sub Total: ");
  JLabel jl20=new JLabel("Total: ");
  JLabel jl21=new JLabel("Total Days: ");


  JTextField jtf1=new JTextField();
  JTextField jtf2=new JTextField();
  JTextField jtf3=new JTextField();
  JTextField jtf4=new JTextField();
  JTextField jtf5=new JTextField();
  JTextField jtf6=new JTextField();
  JTextField jtf7=new JTextField();
  JTextField jtf8=new JTextField();
  JTextField jtf9=new JTextField();
  JTextField jtf10=new JTextField();
  JTextField jtf11=new JTextField();
  JTextField jtf12=new JTextField();
  JTextField jtf13=new JTextField();
  JTextField jtf14=new JTextField();
  JTextField jtf15=new JTextField();

  JTextField jjtf1=new JTextField();
  JTextField jjtf2=new JTextField();
  JTextField jjtf3=new JTextField();
  JTextField jjtf4=new JTextField();
  JTextField jjtf5=new JTextField();
  JTextField jjtf6=new JTextField();
  JTextField jjtf7=new JTextField();
  JTextField jjtf8=new JTextField();
  JTextField jjtf9=new JTextField();
  JTextField jjtf10=new JTextField();
  JTextField jjtf11=new JTextField();
  JTextField jjtf12=new JTextField();
  JTextField jjtf13=new JTextField();
  JTextField jjtf14=new JTextField();
  JTextField jjtf15=new JTextField();
  JTextField jjtf16=new JTextField();
  JTextField jjtf17=new JTextField();
  JTextField jjtf18=new JTextField();
  JTextField jjtf19=new JTextField();
  JTextField jjtf20=new JTextField();

  JComboBox jcb1=new JComboBox();
  JComboBox jcb2=new JComboBox();
  JComboBox jcb3=new JComboBox();
  JComboBox jcb4=new JComboBox();
  JComboBox jcb5=new JComboBox();
  JComboBox jcb6=new JComboBox();

  JButton jb1=new JButton("Total Cost");
  JButton jb2=new JButton("Update");
  JButton jb3=new JButton("Delete");
  JButton jb4=new JButton("Reset");
  JButton jb5=new JButton("Exit");

  JTable jtb1=new JTable();

  int days=0;
  int singleRoom=1500;
  int doubleRoom=2500;
  int familyRoom=4000;
  int oneMeal=250;
  int twoMeal=450;
  int threeMeal=700;
  double totalCost=0;
  double subTotal=0;
  double tax=0;

    public HotelManagementSystem(){

      setTitle("Hotel Management System");
      setSize(1600,700);
      setVisible(true);
      setLayout(null);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

      jl1.setFont(new Font("Tahoma", 0, 14));
      jl2.setFont(new Font("Tahoma", 0, 14));
      jl3.setFont(new Font("Tahoma", 0, 14));
      jl4.setFont(new Font("Tahoma", 0, 14));
      jl5.setFont(new Font("Tahoma", 0, 14));
      jl6.setFont(new Font("Tahoma", 0, 14));
      jl7.setFont(new Font("Tahoma", 0, 14));
      jl8.setFont(new Font("Tahoma", 0, 14));
      jl9.setFont(new Font("Tahoma", 0, 14));
      jl10.setFont(new Font("Tahoma", 0, 14));
      jl11.setFont(new Font("Tahoma", 0, 14));
      jl12.setFont(new Font("Tahoma", 0, 14));
      jl13.setFont(new Font("Tahoma", 0, 14));
      jl14.setFont(new Font("Tahoma", 0, 14));
      jl15.setFont(new Font("Tahoma", 0, 14));
      jl16.setFont(new Font("Tahoma", 0, 14));
      jl17.setFont(new Font("Tahoma", 0, 14));
      jl18.setFont(new Font("Tahoma", 0, 14));
      jl19.setFont(new Font("Tahoma", 0, 14));
      jl20.setFont(new Font("Tahoma", 0, 14));
      jl21.setFont(new Font("Tahoma", 0, 14));

      jtf1.setFont(new Font("Tahoma", 0, 14));
      jtf2.setFont(new Font("Tahoma", 0, 14));
      jtf3.setFont(new Font("Tahoma", 0, 14));
      jtf4.setFont(new Font("Tahoma", 0, 14));
      jtf5.setFont(new Font("Tahoma", 0, 14));
      jtf6.setFont(new Font("Tahoma", 0, 14));
      jtf7.setFont(new Font("Tahoma", 0, 14));
      jtf8.setFont(new Font("Tahoma", 0, 14));
      jtf9.setFont(new Font("Tahoma", 0, 14));
      jtf10.setFont(new Font("Tahoma", 0, 14));
      jtf11.setFont(new Font("Tahoma", 0, 14));
      jtf12.setFont(new Font("Tahoma", 0, 14));
      jtf13.setFont(new Font("Tahoma", 0, 14));
      jtf14.setFont(new Font("Tahoma", 0, 14));
      jtf15.setFont(new Font("Tahoma", 0, 14));

      jjtf1.setFont(new Font("Tahoma", 0, 10));
      jjtf2.setFont(new Font("Tahoma", 0, 10));
      jjtf3.setFont(new Font("Tahoma", 0, 10));
      jjtf4.setFont(new Font("Tahoma", 0, 10));
      jjtf5.setFont(new Font("Tahoma", 0, 10));
      jjtf6.setFont(new Font("Tahoma", 0, 10));
      jjtf7.setFont(new Font("Tahoma", 0, 10));
      jjtf8.setFont(new Font("Tahoma", 0, 10));
      jjtf9.setFont(new Font("Tahoma", 0, 10));
      jjtf10.setFont(new Font("Tahoma", 0, 10));
      jjtf11.setFont(new Font("Tahoma", 0, 10));
      jjtf12.setFont(new Font("Tahoma", 0, 10));
      jjtf13.setFont(new Font("Tahoma", 0, 10));
      jjtf14.setFont(new Font("Tahoma", 0, 10));
      jjtf15.setFont(new Font("Tahoma", 0, 10));
      jjtf16.setFont(new Font("Tahoma", 0, 10));
      jjtf17.setFont(new Font("Tahoma", 0, 10));
      jjtf18.setFont(new Font("Tahoma", 0, 10));
      jjtf19.setFont(new Font("Tahoma", 0, 10));
      jjtf20.setFont(new Font("Tahoma", 0, 10));


      jcb1.setFont(new Font("Tahoma", 0, 14));
      jcb2.setFont(new Font("Tahoma", 0, 14));
      jcb3.setFont(new Font("Tahoma", 0, 14));
      jcb4.setFont(new Font("Tahoma", 0, 14));
      jcb5.setFont(new Font("Tahoma", 0, 14));
      jcb6.setFont(new Font("Tahoma", 0, 14));

      jb1.setFont(new Font("Tahoma", 1, 18));
      jb2.setFont(new Font("Tahoma", 1, 18));
      jb3.setFont(new Font("Tahoma", 1, 18));
      jb4.setFont(new Font("Tahoma", 1, 18));
      jb5.setFont(new Font("Tahoma", 1, 18));

      jtb1.setFont(new Font("Tahoma", 0, 12));

      jl1.setBounds(10,10,150,25);
      jl2.setBounds(10,40,150,25);
      jl3.setBounds(10,70,150,25);
      jl4.setBounds(10,100,150,25);
      jl5.setBounds(10,130,150,25);
      jl6.setBounds(10,160,150,25);
      jl7.setBounds(10,190,150,25);
      jl8.setBounds(10,220,150,25);
      jl9.setBounds(10,250,150,25);
      jl10.setBounds(10,280,150,25);
      jl11.setBounds(10,310,150,25);
      jl12.setBounds(10,340,150,25);
      jl13.setBounds(10,370,150,25);
      jl14.setBounds(10,400,150,25);
      jl15.setBounds(10,430,150,25);
      jl16.setBounds(10,460,150,25);
      jl17.setBounds(10,490,150,25);
      jl18.setBounds(10,550,150,25);
      jl19.setBounds(10,580,150,25);
      jl20.setBounds(10,610,150,25);
      jl21.setBounds(10,520,150,25);

      jtf1.setBounds(130,10,150,25);
      jtf2.setBounds(130,40,150,25);
      jtf3.setBounds(130,70,150,25);
      jtf4.setBounds(130,100,150,25);
      jtf5.setBounds(130,130,150,25);
      jtf6.setBounds(130,160,150,25);
      jtf7.setBounds(130,190,150,25);
      jtf8.setBounds(130,220,150,25);
      jtf9.setBounds(130,550,150,25);
      jtf10.setBounds(130,580,150,25);
      jtf11.setBounds(130,610,150,25);
      jtf12.setBounds(130,250,150,25);
      jtf13.setBounds(130,340,150,25);
      jtf14.setBounds(130,370,150,25);
      jtf15.setBounds(130,520,150,25);

      jcb1.setBounds(130,280,150,25);
      jcb2.setBounds(130,310,150,25);
      jcb3.setBounds(130,400,150,25);
      jcb4.setBounds(130,430,150,25);
      jcb5.setBounds(130,460,150,25);
      jcb6.setBounds(130,490,150,25);

      jb1.setBounds(400,550,180,85);
      jb2.setBounds(640,550,180,85);
      jb3.setBounds(880,550,180,85);
      jb4.setBounds(1120,550,180,85);
      jb5.setBounds(1360,550,180,85);

      jtb1.setBounds(400,41,1140,475);

      jjtf1.setBounds(400,10,57,30);
      jjtf2.setBounds(457,10,57,30);
      jjtf3.setBounds(514,10,57,30);
      jjtf4.setBounds(571,10,57,30);
      jjtf5.setBounds(628,10,57,30);
      jjtf6.setBounds(685,10,57,30);
      jjtf7.setBounds(742,10,57,30);
      jjtf8.setBounds(799,10,57,30);
      jjtf9.setBounds(856,10,57,30);
      jjtf10.setBounds(913,10,57,30);
      jjtf11.setBounds(970,10,57,30);
      jjtf12.setBounds(1027,10,57,30);
      jjtf13.setBounds(1084,10,57,30);
      jjtf14.setBounds(1141,10,57,30);
      jjtf15.setBounds(1198,10,57,30);
      jjtf16.setBounds(1255,10,57,30);
      jjtf17.setBounds(1312,10,57,30);
      jjtf18.setBounds(1369,10,57,30);
      jjtf19.setBounds(1426,10,57,30);
      jjtf20.setBounds(1483,10,58,30);

      jjtf1.setText("Customer ID");
      jjtf2.setText("First Name");
      jjtf3.setText("Last Name");
      jjtf4.setText("Phone");
      jjtf5.setText("Email");
      jjtf6.setText("Address");
      jjtf7.setText("Post Code");
      jjtf8.setText("Nationality");
      jjtf9.setText("Date of Birth");
      jjtf10.setText("Gender");
      jjtf11.setText("ID Type");
      jjtf12.setText("Check In");
      jjtf13.setText("Check Out");
      jjtf14.setText("Meal");
      jjtf15.setText("Room Type");
      jjtf16.setText("Room No");
      jjtf17.setText("Room Ext. No");
      jjtf18.setText("Tax");
      jjtf19.setText("Sub Total");
      jjtf20.setText("Total");

      jtf15.setText("1");


      jcb1.setModel(new DefaultComboBoxModel(new String[]{"Male","Female","Others"}));
      jcb2.setModel(new DefaultComboBoxModel(new String[]{"National ID", "Passport ID", "Birth Certificate", "Student ID", "Driving Licence"}));
      jcb3.setModel(new DefaultComboBoxModel(new String[]{"1", "2", "3"}));
      jcb4.setModel(new DefaultComboBoxModel(new String[]{"Single", "Double", "Family"}));
      jcb5.setModel(new DefaultComboBoxModel(new String[]{"001", "002", "003", "004", "005", "006", "007", "008", "009", "010", "011", "012"}));
      jcb6.setModel(new DefaultComboBoxModel(new String[]{"101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112"}));

      jtb1.setModel(new javax.swing.table.DefaultTableModel(
          new Object [][] {},
          new String [] {
              "Customer ID", "First Name", "Last Name", "Phone", "Email", "Address", "Post Code", "Nationality", "Date of Birth", "Gender", "ID Type", "Check In", "Check Out", "Meal", "Room Type", "Room No", "Room Ext. No", "Tax", "Sub Total", "Total"
          }
      ));

      add(jl1);
      add(jl2);
      add(jl3);
      add(jl4);
      add(jl5);
      add(jl6);
      add(jl7);
      add(jl8);
      add(jl9);
      add(jl10);
      add(jl11);
      add(jl12);
      add(jl13);
      add(jl14);
      add(jl15);
      add(jl16);
      add(jl17);
      add(jl18);
      add(jl19);
      add(jl20);
      add(jl21);

      add(jtf1);
      add(jtf2);
      add(jtf3);
      add(jtf4);
      add(jtf5);
      add(jtf6);
      add(jtf7);
      add(jtf8);
      add(jtf9);
      add(jtf10);
      add(jtf11);
      add(jtf12);
      add(jtf13);
      add(jtf14);
      add(jtf15);

      add(jcb1);
      add(jcb2);
      add(jcb3);
      add(jcb4);
      add(jcb5);
      add(jcb6);

      add(jb1);
      add(jb2);
      add(jb3);
      add(jb4);
      add(jb5);

      add(jtb1);

      add(jjtf1);
      add(jjtf2);
      add(jjtf3);
      add(jjtf4);
      add(jjtf5);
      add(jjtf6);
      add(jjtf7);
      add(jjtf8);
      add(jjtf9);
      add(jjtf10);
      add(jjtf11);
      add(jjtf12);
      add(jjtf13);
      add(jjtf14);
      add(jjtf15);
      add(jjtf16);
      add(jjtf17);
      add(jjtf18);
      add(jjtf19);
      add(jjtf20);

      jb1.addActionListener(this);
      jb2.addActionListener(this);
      jb3.addActionListener(this);
      jb4.addActionListener(this);
      jb5.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e){

      if(e.getSource()==jb1){

        String s=jtf15.getText();
        days=Integer.parseInt(s);
        if(jcb3.getSelectedItem()=="1"){

          if(jcb4.getSelectedItem()=="Single"){

            subTotal=days*(singleRoom+oneMeal);
            tax=subTotal*.25;
            totalCost=subTotal+tax;
            jtf9.setText(Double.toString(tax));
            jtf10.setText(Double.toString(subTotal));
            jtf11.setText(Double.toString(totalCost));

          }
          else if(jcb4.getSelectedItem()=="Double"){

            subTotal=days*(doubleRoom+oneMeal);
            tax=subTotal*.25;
            totalCost=subTotal+tax;
            jtf9.setText(Double.toString(tax));
            jtf10.setText(Double.toString(subTotal));
            jtf11.setText(Double.toString(totalCost));
          }
          else if(jcb4.getSelectedItem()=="Family"){

            subTotal=days*(familyRoom+oneMeal);
            tax=subTotal*.25;
            totalCost=subTotal+tax;
            jtf9.setText(Double.toString(tax));
            jtf10.setText(Double.toString(subTotal));
            jtf11.setText(Double.toString(totalCost));
          }

        }
        else if(jcb3.getSelectedItem()=="2"){

          if(jcb4.getSelectedItem()=="Single"){

            subTotal=days*(singleRoom+twoMeal);
            tax=subTotal*.25;
            totalCost=subTotal+tax;
            jtf9.setText(Double.toString(tax));
            jtf10.setText(Double.toString(subTotal));
            jtf11.setText(Double.toString(totalCost));
          }
          else if(jcb4.getSelectedItem()=="Double"){

            subTotal=days*(doubleRoom+twoMeal);
            tax=subTotal*.25;
            totalCost=subTotal+tax;
            jtf9.setText(Double.toString(tax));
            jtf10.setText(Double.toString(subTotal));
            jtf11.setText(Double.toString(totalCost));
          }
          else if(jcb4.getSelectedItem()=="Family"){

            subTotal=days*(familyRoom+twoMeal);
            tax=subTotal*.25;
            totalCost=subTotal+tax;
            jtf9.setText(Double.toString(tax));
            jtf10.setText(Double.toString(subTotal));
            jtf11.setText(Double.toString(totalCost));
          }
        }
        else if(jcb3.getSelectedItem()=="3"){

          if(jcb4.getSelectedItem()=="Single"){

            subTotal=days*(singleRoom+threeMeal);
            tax=subTotal*.25;
            totalCost=subTotal+tax;
            jtf9.setText(Double.toString(tax));
            jtf10.setText(Double.toString(subTotal));
            jtf11.setText(Double.toString(totalCost));
          }
          else if(jcb4.getSelectedItem()=="Double"){

            subTotal=days*(doubleRoom+threeMeal);
            tax=subTotal*.25;
            totalCost=subTotal+tax;
            jtf9.setText(Double.toString(tax));
            jtf10.setText(Double.toString(subTotal));
            jtf11.setText(Double.toString(totalCost));
          }
          else if(jcb4.getSelectedItem()=="Family"){

            subTotal=days*(familyRoom+threeMeal);
            tax=subTotal*.25;
            totalCost=subTotal+tax;
            jtf9.setText(Double.toString(tax));
            jtf10.setText(Double.toString(subTotal));
            jtf11.setText(Double.toString(totalCost));
          }

        }
      }

      else if(e.getSource()==jb2){

        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jtb1.getModel();
        model.addRow(new Object[]{
        jtf1.getText(),
        jtf2.getText(),
        jtf3.getText(),
        jtf4.getText(),
        jtf5.getText(),
        jtf6.getText(),
        jtf7.getText(),
        jtf8.getText(),
        jtf12.getText(),
        jcb1.getSelectedItem(),
        jcb2.getSelectedItem(),
        jtf13.getText(),
        jtf14.getText(),
        jcb3.getSelectedItem(),
        jcb4.getSelectedItem(),
        jcb5.getSelectedItem(),
        jcb6.getSelectedItem(),
        jtf9.getText(),
        jtf10.getText(),
        jtf11.getText()
      });

        if(jtb1.getSelectedRow()==-1){
            if(jtb1.getRowCount()==0){
                JOptionPane.showConfirmDialog(null, "Hotel Booking Update Confirmed", "Hotel Management System",JOptionPane.OK_OPTION);
            }
        }

      }
      else if(e.getSource()==jb3){

        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jtb1.getModel();
        if(jtb1.getSelectedRow()==-1){
            if(jtb1.getRowCount()==0){
                JOptionPane.showConfirmDialog(null, "Hotel Booking Update Confirmed", "Hotel Management System",JOptionPane.OK_OPTION);
            }
            else{
                JOptionPane.showConfirmDialog(null, "Select a row to delete", "Hotel Management System", JOptionPane.OK_OPTION);
            }
        }
        else{
            model.removeRow(jtb1.getSelectedRow());
        }

      }
      else if(e.getSource()==jb4){

        jtf1.setText(null);
        jtf2.setText(null);
        jtf3.setText(null);
        jtf4.setText(null);
        jtf5.setText(null);
        jtf6.setText(null);
        jtf7.setText(null);
        jtf8.setText(null);
        jtf9.setText(null);
        jtf10.setText(null);
        jtf11.setText(null);
        jtf12.setText(null);
        jtf13.setText(null);
        jtf14.setText(null);
        jtf15.setText("1");
        jcb1.setSelectedIndex(0);
        jcb2.setSelectedIndex(0);
        jcb3.setSelectedIndex(0);
        jcb4.setSelectedIndex(0);
        jcb5.setSelectedIndex(0);
        jcb6.setSelectedIndex(0);


      }

      else if(e.getSource()==jb5){

        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit","Hotel Management System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
      }

    }

}
