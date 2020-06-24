package com.gk.test;


import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.config.AppConfig;



public class I18nSpringTest {

	public static void main(String[] args) {
		String lsno=null,lsname=null,lsadd=null,cap1=null,cap2=null,cap3=null,cap4=null;
		JFrame frame=null;
		JLabel lno=null,lname=null,ladd=null;
		JTextField tno=null,tname=null,tadd=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null;
	    ApplicationContext ctx=null;
	    //create locale object
	    Locale locale=new Locale(args[0],args[1]);
		// create Ioc container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		lsno=ctx.getMessage("sno.label", new Object[]{"Customer"},"msg1", locale);
	    lsname=ctx.getMessage("sname.label", new Object[]{},"msg2", locale);
		lsadd=ctx.getMessage("sadd.label", new Object[]{},"msg3", locale);
		cap1=ctx.getMessage("btn1.cap", new Object[]{},"msg4", locale);
		cap2=ctx.getMessage("btn2.cap", new Object[]{},"msg5", locale);
		cap3=ctx.getMessage("btn3.cap", new Object[]{},"msg6", locale);
		cap4=ctx.getMessage("btn4.cap", new Object[]{},"msg7", locale);
		//String label11=ctx.getMessage("sno.label", new Object[]{"Customer","label"},new Locale("hi","IN"));
	
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
        
 ((AbstractApplicationContext) ctx).close();
	}

}
