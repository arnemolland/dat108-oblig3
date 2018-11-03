package no.hvl.dat108;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SignupServlet", urlPatterns = {"signup"})
public class SignupServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	request.getRequestDispatcher("WEB-INF/SignupPage.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String phoneNumber = request.getParameter("phone");
		String gender = request.getParameter("kjonn");
		String password = request.getParameter("password");
		
		Validation isSafe = new Validation(request);
		
		if(!isSafe.isAllInputValid()) {
			
		}
		
		String hashedPsw = PassordUtil.krypterPassord(password);
		
		
		ParticipantEAO peoa = new ParticipantEAO();
		Participant newParticipant = new Participant(gender, firstName + " " + lastName,
				hashedPsw, phoneNumber);
		ParticipantList ParticipantList = peoa.getParticipants();
		ParticipantList.addParticipant(newParticipant);
		peoa.updateParticipants(ParticipantList);
	
		HttpSession session = request.getSession(false);
		if(session == null) {
			session = request.getSession(true);
			session.setMaxInactiveInterval(60);
		}
		
		session.setAttribute("firstname", firstName);
		session.setAttribute("lastname", lastName);
		session.setAttribute("phonenumber", phoneNumber);
		session.setAttribute("gender", gender);

		response.sendRedirect("WEB-INF/SignupConfirmation.jsp");
		
	}

    
    
    
}