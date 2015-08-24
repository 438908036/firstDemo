package com.zg.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zg.io.GetDirect;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String lujing = request.getParameter("lujing");
		
		GetDirect gd = new GetDirect();
		String[] s = gd.listDemo(lujing);
		
		List list = new ArrayList<>();
		for (String ss : s) {
			System.out.println(ss);
			list.add(ss);
		}
		 request.setAttribute("list", list);
		 request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

}
