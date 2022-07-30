package com.beans.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.braintrain.beans.RegisterBean;
import com.braintrain.servicefactory.ServiceFactory;
import com.braintree.logservice.RegistrationService;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("inside Servlet !!!!");
		System.out.println("servlet working");
		System.out.println(request.getParameter("nameText"));
		String name=request.getParameter("nameText");
		
		System.out.println(request.getParameter("ageText"));
		int age=Integer.parseInt(request.getParameter("ageText"));
	System.out.println(request.getParameter("addressText"));
		String address=request.getParameter("addressText");
		System.out.println(request.getParameter("emailIdText"));
		String email=request.getParameter("emailIdText");
		System.out.println(request.getParameter("phoneText"));
		int phoneno=Integer.parseInt(request.getParameter("phoneText"));
		String qualification=request.getParameter("qualification");
		System.out.println(qualification);
		String topic=request.getParameter("topic");
		System.out.println(topic);
		int registrationId = 1;
		RegisterBean register=new RegisterBean();
		register.setName(name);
		register.setAge(age);
		register.setAddress(address);
		register.setEmailId(email);
		register.setPhoneno(phoneno);
		register.setQualification(qualification);
		register.setTopic(topic);
		RegistrationService registrationservice=ServiceFactory.getRegistrationService();
		try{
			registrationId=RegistrationService.AddNewUser(register);
			out.print(registrationId);
			HttpSession session=request.getSession();
			session.setAttribute("registrationId", registrationId);
			request.setAttribute("registrationId", registrationId);
		
		}
		catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
		catch(SQLException sqe){
			sqe.printStackTrace();
		}
		RequestDispatcher rd=request.getRequestDispatcher("Registration.jsp");
		rd.forward(request, response);
	}

}