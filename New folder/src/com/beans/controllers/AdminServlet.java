package com.beans.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.braintrain.beans.CourseBean;
import com.braintrain.beans.QuestionBean;
import com.braintrain.servicefactory.ServiceFactory;
import com.braintree.logservice.CourseService;
import com.braintree.logservice.QuestionService;

/**
 * Servlet implementation class AdminServlet
 */
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("admin doget");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out=response.getWriter();
		if(request.getParameter("coursetext")!=null)
		{
		String topicname="";
		out.println("inside  ADMIN Servlet !!!!");
		System.out.println(" Admin servlet working");
		String coursename=request.getParameter("coursetext");
		CourseBean course=new CourseBean();
		course.setCourseName(coursename);
		String questionName=request.getParameter("");
		String answer=request.getParameter("");
		String level=request.getParameter("");
		QuestionBean question=new QuestionBean();
		question.setQuestion(questionName);
		question.setAnswer(answer);
		question.setLevel(level);
		CourseService courseservice=ServiceFactory.getCourseService();
		List courselist=new ArrayList<List>();
		try{
			courselist=CourseService.addCourse(course);
			System.out.println("this is passed");
		/*	out.print(topicname);
			ArrayList<CourseBean> al=new ArrayList<CourseBean>();
			al.add(new CourseBean(topicname));*/
			//System.out.println(courselist);
			request.setAttribute("topicname", courselist);
			RequestDispatcher rd=request.getRequestDispatcher("TopicCatalog.jsp");
			rd.forward(request, response);
		 }
		catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		}
		if(request.getParameter("questiontext")!=null){
			out.println("we are in Admin question servlet");
			String questionName=request.getParameter("questiontext");
			String answer=request.getParameter("optiontext");
			String level=request.getParameter("levels");
			QuestionBean question=new QuestionBean();
			question.setQuestion(questionName);
			question.setAnswer(answer);
			question.setLevel(level);
			QuestionService questionservice=ServiceFactory.getQuestionService();
			try{
				QuestionService.addQuestion(question);
			   }
			catch(ClassNotFoundException ce){
				ce.printStackTrace();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}
	}

}