package com.curso.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import com.curso.entidades.*;
/**
 * Servlet implementation class SaludoServlet
 */
@WebServlet({ "/SaludoServlet", "/saludo" })
public class SaludoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaludoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("paramNombre");
		if(nombre == null) {
			nombre = "Amigo";
		}else {
			//nombre = nombre.toUpperCase();
		}
		//PrintWriter out = response.getWriter();
		//out.print("Hola " + nombre);
		// ahora despachamos la generación de la httpREquest a un jsp
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/saludo.jsp");
		request.setAttribute("nombre", nombre);
		request.setAttribute("visible", false);
		
		// nombre para ir a un servicio que devuelve lista empleados
		List<Empleado> lista = new ArrayList<Empleado>();
		lista.add(new Empleado(1,"Luis Ramos"));
		lista.add(new Empleado(2, "Marta Blanco"));
		
		request.setAttribute("listaEmpleados", lista);
		
		rd.forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
