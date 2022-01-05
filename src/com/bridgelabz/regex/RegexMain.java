package com.bridgelabz.regex;
import java.util.Scanner;

public class RegexMain {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First-Name:");
			String firstName = sc.next();
			UserDetails userdetails = new UserDetails(firstName);
			UserRegistration registration = new UserRegistration();
			registration.register(userdetails);
		}
	}
