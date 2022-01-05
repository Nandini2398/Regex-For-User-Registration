package com.bridgelabz.regex;
import java.util.regex.*;

public class UserRegistration {
	private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	private static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	private static final String EMAIL_REGEX = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+[a-z]+$";

	public void register(UserDetails userDetail) {
		boolean isFirstNameValid = validateUserDetails(FIRST_NAME_REGEX,userDetail.getFirstName());
		boolean isLastNameValid = validateUserDetails(LAST_NAME_REGEX,userDetail.getLastName());
		boolean isEmailValid = validateUserDetails(EMAIL_REGEX,userDetail.getEmail());

		if(isFirstNameValid && isLastNameValid && isEmailValid) {
			System.out.println("Details entered are valid");
		}
		else {
			System.out.println("Details entered are invalid");
		}
	}
	private boolean validateUserDetails(String regex, String dataToBeValidated) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(dataToBeValidated);
		return matcher.matches();
	}
}