package com.bridgelabz.regex;
import java.util.regex.*;

public class UserRegistration {
	private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	private static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	private static final String EMAIL_REGEX = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+[a-z]+$";
	private static final String PHONE_NUMBER_REGEX = "^[0-9]{2}[\\s][0-9]{10}$";

	public void register(UserDetails userDetail) {
		boolean isFirstNameValid = validateUserDetails(FIRST_NAME_REGEX,userDetail.getFirstName());
		boolean isLastNameValid = validateUserDetails(LAST_NAME_REGEX,userDetail.getLastName());
		boolean isEmailValid = validateUserDetails(EMAIL_REGEX,userDetail.getEmail());
		boolean isPhoneNumberValid = validateUserDetails(PHONE_NUMBER_REGEX,userDetail.getPhoneNumber());

		if(isFirstNameValid && isLastNameValid && isEmailValid && isPhoneNumberValid) {
			System.out.println("Details entered are valid");
		}
		else {
			System.out.println("Details entered are invalid");
		}
	}
	private boolean validateUserDetails(String regex, String dataToBeValidated
			) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(dataToBeValidated);
		return matcher.matches();
	}
}