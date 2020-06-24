package com.gk.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.gk.dto.PassengerDetailsDto;
import com.gk.service.RailwayTicketReservationService;
import com.gk.service.RailwayTicketReservationServiceImpl;

public class BatchJdbcTest {

	public static void main(String[] args) {
		
		Scanner sc=null;
		String pname=null;
		float price=0;
		String splace=null,dplace=null;
		int groupSize=0;
		int age=0;
		List<PassengerDetailsDto> listDto=new ArrayList<PassengerDetailsDto>();
		String result=null;
		String gender=null;
		PassengerDetailsDto dto=null;
		String result1=null;
		//take input from the  user
		sc=new Scanner(System.in);
		try {
	
			System.out.println("Enter group size");
			groupSize=sc.nextInt();
			if(groupSize>0) {
				System.out.println("Enter source place");
				splace=sc.next();
			
				System.out.println("Enter destination place");
				dplace=sc.next();
				System.out.println("Enter ticket fare");
				price=sc.nextFloat();
				
			for(int i=1;i<=groupSize;i++) {
				System.out.println("Enter "+i+"passenger details");
				System.out.println("Enter passenger Name");
				pname=sc.next();
				System.out.println("Enter passenger age");
			    age=sc.nextInt();
			    System.out.println("Enter passenger gender");
			    gender=sc.next();
			    //add each passenger to dto
			    
				dto=new PassengerDetailsDto();
				dto.setPname(pname);
				dto.setAge(age);
				dto.setSplace(splace);
				dto.setDplace(dplace);
				dto.setPrice(price);
				dto.setGender(gender);
				//add each dto to list
				listDto.add(dto);
		    }//for end
		}//if end
			else {
				System.out.println("Invalid group size");
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		// create ioc container
		ApplicationContext  ctx = null;
		// create bean factory
		ctx = new ClassPathXmlApplicationContext("com/gk/cfgs/applicationContext.xml");

		// get Controller class obect
		RailwayTicketReservationService service = ctx.getBean("service", RailwayTicketReservationServiceImpl.class);
		try {
			// invoke method
			result1 =service.groupTicketReservation(listDto);	
		 System.out.println(result1);	
					
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
				((AbstractApplicationContext)ctx).close();
	}

}
