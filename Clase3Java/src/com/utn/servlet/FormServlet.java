package com.utn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Dispatch;

import org.apache.taglibs.standard.tag.common.fmt.RequestEncodingSupport;

import com.utn.dao.ConnectioMySql;
import com.utn.dao.UsuarioFactory;
import com.utn.modelo.Usuario;

public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FormServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String estado = request.getParameter("estado");
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String email = request.getParameter("email");
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		UsuarioFactory us = new UsuarioFactory(new ConnectioMySql());
		RequestDispatcher disp = request.getRequestDispatcher("bienvenido.jsp");
		
		System.out.println(estado);
		HttpSession session = request.getSession(true);
		
		if (estado.equals("login")) {
			 Usuario u =  us.getByUser(user);
			 if(u != null) {
				if( u.getPassword().equals(password) ) {
					session.setAttribute("usuario", u);
					session.setMaxInactiveInterval(10);
					disp.forward(request, response);
				}
				 
			 }else
			 {
				 response.getWriter().println("EL USUARIO NO EXISTE");
			 }
			 
		} else {

			response.getWriter().println(us.save(new Usuario(name, surname, email, user, password)));

		}
	}

}
