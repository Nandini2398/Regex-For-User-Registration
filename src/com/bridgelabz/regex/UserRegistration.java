package com.bridgelabz.regex;
import java.util.regex.*;

public class UserRegistration {
	private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	public void register(UserDetails userDetail) {
		validateUserDetails(userDetail);
	}
	private void validateUserDetails(UserDetails userDetail) {
		Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
		Matcher matcher = pattern.matcher(userDetail.getFirstName());
		boolean isValid = matcher.matches();
		if(isValid) {
			System.out.println("Name is valid");
		}
		else {
			System.out.println("Name is not valid");
		}
	}
}