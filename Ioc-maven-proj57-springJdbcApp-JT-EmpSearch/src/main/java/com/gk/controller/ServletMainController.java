package com.gk.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.service.EmployeeService;
import com.gk.service.EmployeeServiceImpl;
@WebServlet("/controller")
public class ServletMainController extends HttpServlet{
	private ApplicationContext ctx=null;
	public void init() throws ServletException{
		System.out.println("ServletMainController.init()");
		//create ion container
		ctx= new ClassPathXmlApplicationContext("com/gk/cfgs/applicationContext.xml");
		
	}
	public void destroy() {
		((AbstractApplicationContext) ctx).close();
	}
	
 @Override
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("ServletMainController.doGet()");
	 String desg[]=null;
	EmployeeService service=null;
	List<Map<String,Object>> listMap=null;
	RequestDispatcher rd=null;
	//read form data
	desg=req.getParameterValues("job");
	//getService class Object
	service=ctx.getBean("service",EmployeeServiceImpl.class);
	try {
		//invoke method
		System.out.println("ServletMainController.doGet()");
		listMap=service.fetchEmpsByDesgs(desg);
		System.out.println("listmap"+listMap);
		//keep the result in req scope
		req.setAttribute("listMap",listMap);
		//forward the  request to result.jsp
	rd=req.getRequestDispatcher("/result.jsp");
	rd.forward(req, resp);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("ServletMainController.doPost()");
	doGet(req, resp);
}

}
