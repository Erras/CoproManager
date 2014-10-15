package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.testBean;


public class IndexServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException{
		
		/*
		//creation et init du msg
		String paramAuteur = req.getParameter("auteur");
		String msg = "transmission de variables OK ! " + paramAuteur;
		
		//creation du bean
		testBean tb = new testBean();
		
		//init de ses données
		tb.setNom("Coyote");
		tb.setPrenom("Wile E.");
		
		//stockage du msg
		req.setAttribute("coyote", tb);
		req.setAttribute("test", msg);
		*/
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Index.jsp").forward(req, rep);
	}
}
