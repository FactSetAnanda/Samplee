package com.beans.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.management.relation.Role;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.braintrain.beans.Login;
import com.braintrain.servicefactory.ServiceFactory;
import com.braintree.logservice.LoginService;

/**
 * Servlet implementation class LoginsServlet
 */
public class LoginsServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doget");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//PrintWriter out=response.getWriter();
		
		int registrationId=Integer.parseInt(request.getParameter("loginText"));
		Login loginInfo=new Login();
		String role="";
		loginInfo.setRegistrationId(registrationId);
		LoginService loginservice=ServiceFactory.getLoginService();
		try{
		    role=loginservice.validateUser(loginInfo);
		    System.out.println(role);
		}
		catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
			if(role.equalsIgnoreCase("manish")){
				HttpSession session=request.getSession();
				session.setAttribute("registrationID", registrationId);
				RequestDispatcher rd=request.getRequestDispatcher("TopicCatalog.html");
				rd.forward(request, response);
			}
			else if(!role.equalsIgnoreCase("manish")){
				
				HttpSession session=request.getSession();
				session.setAttribute("registrationID", registrationId);
				RequestDispatcher rd=request.getRequestDispatcher("TopicCatalog.html");
				rd.forward(request, response);
			}
			
	}	
	}