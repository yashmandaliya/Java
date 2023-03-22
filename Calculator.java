

package com.mycompany.calculator;


import javax.swing.*;
import java.awt.event.*;
public  class Calculator extends JFrame implements ActionListener 
{
    JTextField tf1,tf2,tf3;
    JButton b1,b2,b3,b4;
    Calculator()
    {
     JFrame f=new JFrame("Calculator");
     JLabel l1 = new JLabel("A :-");
     tf1 = new JTextField();
     JLabel l2 = new JLabel("B:-");
     tf2 = new JTextField();
     JLabel l3 = new JLabel("Ans :-");
     tf3 = new JTextField();
     b1  =new JButton("+");
     b2 = new JButton("-");
     b3 =new JButton("*");
     b4 = new JButton("/");
     l1.setBounds(50,50,95,30);
     l2.setBounds(50,100,95,30);
     l3.setBounds(50,150,95,30);
     tf1.setBounds(100,50,130,30);
     tf2.setBounds(100,100,130,30);
     tf3.setBounds(100,150,130,30);
     b1.setBounds(100,200,95,30);
     b2.setBounds(100,250,95,30);
     b3.setBounds(100,300,95,30);
     b4.setBounds(100,350,95,30);
     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     f.add(l1);
     f.add(tf1);
     f.add(l2);
     f.add(tf2);
     f.add(l3);
     f.add(tf3);
     f.add(b1);
     f.add(b2);
     f.add(b3);
     f.add(b4);
     f.setSize(800,600);
     f.setLayout(null);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.setVisible(true); 
    }
     public void actionPerformed(ActionEvent e)
    {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if(e.getSource() == b1) 
        {
            c = a+b;
        }
        else if(e.getSource() == b2) 
        {
            c = a-b;
        }
        else if(e.getSource() == b3) 
        {
            c = a*b;
        }
        else if(e.getSource() == b4) 
        {
            c = a/b;
        }
        String s3 = String.valueOf(c);
        tf3.setText(s3);
    }
 public static void main(String[] args) 
 {
        new Calculator();
 }

}