package com.gk.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.service.CrickBuzzScoreMngmtServiceImpl;


public class CrickBuzzController extends HttpServlet {
	private ApplicationContext ctx;
	@Override
	public void init() throws ServletException {

	//create ioc container
	ctx=new ClassPathXmlApplicationContext("com/gk/cfgs/applicationContext.xml");
	
		
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		//use service 
		try {
			CrickBuzzScoreMngmtServiceImpl service=null;
			//create crikbuzz obj
			
		service=ctx.getBean("service1",CrickBuzzScoreMngmtServiceImpl.class);
		String score=service.findScore(Integer.parseInt(req.getParameter("mid")));
		//keep the record in req scope
				req.setAttribute("scoreCard", score);
				//forward show score.jsp
				RequestDispatcher rd=  req.getRequestDispatcher("/show_score.jsp");
				rd.forward(req, res);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	}
	
	
	public void destroy() {
		//close container
		((AbstractApplicationContext) ctx).close();
	}


}
