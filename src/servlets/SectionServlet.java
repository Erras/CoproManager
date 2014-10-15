package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.testBean;


public class SectionServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException{
		
		
		//creation et init du msg
		String paramContenu = req.getParameter("contenu");
		String msg = "transmission de variables OK ! " + paramContenu;
		
		req.setAttribute("test", msg);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Index.jsp").forward(req, rep);
	}
}
