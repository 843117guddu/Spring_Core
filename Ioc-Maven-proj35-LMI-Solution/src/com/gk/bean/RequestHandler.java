package com.gk.bean;




public class RequestHandler {

private static int count;
	
	public RequestHandler() {
		count++;
		System.out.println("RequestHandler::0-param  constructor::" +count);
		
	}
	
	
	public   void  handle(String data) {
		System.out.println("handling request using object ::"+count + "  having data :::"+data +"-->"+this.hashCode());
	}
	

}
