package no.hvl.dat108;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SignupServlet", urlPatterns = {"signup"})
public class SignupServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private PartyEAO peoa = new PartyEAO();

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
		
//		Validation isSafe = new Validation(request);
//		
//		if (!isSafe.isAllInputValid()) {
//			request.getRequestDispatcher("WEB-INF/SignupPage.jsp").forward(request, response);
//			return;
//		}
//		
		String hashedPsw = PassordUtil.krypterPassord(password);
		
		Party participants = peoa.getParticipants();
		Participant newParticipant = new Participant(gender, firstName + " " + lastName,
				hashedPsw, phoneNumber,participants);
		participants.addParticipant(newParticipant);
		peoa.updateParticipants(participants);
		
		request.setAttribute("firstname", firstName);
		request.setAttribute("lastname", lastName);
		request.setAttribute("phonenumber", phoneNumber);
		request.setAttribute("gender", gender);
		
		request.getRequestDispatcher("WEB-INF/SignupConfirmation.jsp").forward(request, response);
	}
}
