package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
import com.model.EmployeeManager;


@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
  private static final long serialVersionUID = 1L;
       
    
    public AddEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

  
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    response.setContentType("text/html");
    PrintWriter pw= response.getWriter();
    EmployeeManager EM = new EmployeeManager();
    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("name");
    Employee E = new Employee();
    E.setId(id);
    E.setName(name);
    String ack = EM.insertData(E);
    pw.println(ack);
  }

  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    doGet(request, response);
  }

}