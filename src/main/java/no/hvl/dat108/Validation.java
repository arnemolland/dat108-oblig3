package no.hvl.dat108;

import javax.servlet.http.HttpServletRequest;

public class Validation {
	
	private String firstName;
	private String lastName;
	private String phone;
	private String password;
	private String password2;
	private String gender;

	public Validation(HttpServletRequest request) {
		this.firstName = request.getParameter("firstname");
		this.lastName = request.getParameter("lastname");
		this.phone = request.getParameter("phone");
		this.password = request.getParameter("password");
		this.password2 = request.getParameter("passwordconf");
		this.gender = request.getParameter("gender");
	}
	
	public boolean isAllInputValid() {
		return isFirstNameValid() && 
				isLastNameValid() && 
				isPhoneValid() && 
				isPasswordValid() &&
				isPassword2Valid() &&
				isGenderValid();
	}

	public boolean isGenderValid() {
		return gender == "male" || gender == "female";
	}

	public boolean isPassword2Valid() {
		return password2.equals(password);
	}

	public boolean isPasswordValid() {
		return password.length() > 5;
	}

	public boolean isPhoneValid() {
		return phone != null && phone.matches("^\\d{8}$");
	}

	public boolean isLastNameValid() {
		return lastName.length() > 1 && Character.isUpperCase(lastName.charAt(0));
	}

	public boolean isFirstNameValid() {
		return firstName.length() > 1 && Character.isUpperCase(firstName.charAt(0));
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String etternavn) {
		this.lastName = etternavn;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String mobil) {
		this.phone = mobil;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
