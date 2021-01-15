package edu.bit.ex.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.ex.command.ECommand;
import edu.bit.ex.command.EListCommand;

/**
 * Servlet implementation class EmpFController
 */
@WebServlet("*.do")
public class EFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo");
		
	    request.setCharacterEncoding("EUC-KR");
	    
	    String viewPage = null;
	    ECommand command = null;
	    RequestDispatcher dispatcher = null;
	    
	    String uri = request.getRequestURI();	// ��û�� uri ������
	    String conPath = request.getContextPath();	// ���ؽ�Ʈ �н� ������
	    String com = uri.substring(conPath.length());	// ���ؽ�Ʈ�н����� uri �޺κ� �߶� ������
	    
	    System.out.println(uri);
	    System.out.println(conPath);
	    System.out.println(com); // ������ �͵� ���������� ����ض�
	    
	    if(com.equals("/list.do")){
	         command = new EListCommand();
	         command.execute(request, response);
	         viewPage = "list.jsp";
		} else if (com.equals("/success.do")){
		     command = new EListCommand();
		     command.execute(request, response);
		     viewPage = "success.jsp";
		} 
	         
	      dispatcher = request.getRequestDispatcher(viewPage);
	      dispatcher.forward(request, response);
	   }
	    

}
