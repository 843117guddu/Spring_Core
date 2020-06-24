package com.gk.test;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class I18CoreJavaApp {
	public static void main(String[] args) {
		Locale locale=null;
		ResourceBundle bundle=null;
		String lsno=null,lsname=null,lsadd=null,cap1=null,cap2=null,cap3=null,cap4=null;
		JFrame frame=null;
		JLabel lno=null,lname=null,ladd=null;
		JTextField tno=null,tname=null,tadd=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null;
		//create locale object
		locale=new Locale(args[0],args[1]);
		//locate the properties file
		bundle=ResourceBundle.getBundle("com/gk/commons/App",locale);
        lsno=bundle.getString("sno.label");
        lsname=bundle.getString("sname.label");
        lsadd=bundle.getString("sadd.label");
        cap1=bundle.getString("btn1.cap");
        cap2=bundle.getString("btn2.cap");
        cap3=bundle.getString("btn3.cap");
        cap4=bundle.getString("btn4.cap");
	//create jframe
        frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setBackground(Color.cyan);
        frame.setTitle("Internationalization App");
       //add lno  label
        lno=new JLabel(lsno);
        frame.add(lno);
        //add txt field
        tno=new JTextField(10);
        frame.add(tno);
        
        
      //add lno  label
        lname=new JLabel(lsname);
        frame.add(lname);
        //add txt field
        tname=new JTextField(10);
        frame.add(tname);
        
        
      //add lno  label
        ladd=new JLabel(lsadd);
        frame.add(ladd);
        //add txt field
        tadd=new JTextField(10);
        frame.add(tadd);
       // create button
      btn1=new JButton(cap1);
      btn2=new JButton(cap2);
      btn3=new JButton(cap3);
      btn4=new JButton(cap4);
      
      //add the button to the frame
      frame.add(btn1);
      frame.add(btn2);
      frame.add(btn3);
      frame.add(btn4);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
	}

}
