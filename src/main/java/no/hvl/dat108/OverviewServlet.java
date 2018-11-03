package no.hvl.dat108;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( name = "OverviewServlet" , urlPatterns = "overview")
public class OverviewServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
    	
    }
    
    protected void doPost(HttpServlet request, HttpServletResponse response){
    	
    }
}