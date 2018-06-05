package ui.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.model.Dier;
import domain.model.DierSoort;

/**
 * ui.controller.Servlet implementation class ui.controller.Servlet
 */
@WebServlet("/ui.controller.Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String destination = "voegToe.jsp";
		
		String naam = request.getParameter("naam");
		String soort = request.getParameter("soort");
		String voedsel = request.getParameter("voedsel");
		
		if (naam!=null && soort!=null && voedsel!=null) {
			if (!naam.isEmpty() && !soort.isEmpty() && !voedsel.isEmpty()) {
				Dier dier = new Dier(naam, DierSoort.valueOf(soort), Integer.parseInt(voedsel));
				request.setAttribute("dier", dier);
				destination ="bevestiging.jsp";
			}
		}
		
		RequestDispatcher view = request.getRequestDispatcher(destination);
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
