package com.bridgelabz.regex;
import java.util.Scanner;

public class RegexMain {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First-Name: ");
			String firstName = sc.next();
			System.out.println("Enter Last-Name: ");
			String lastName = sc.next();
			System.out.println("Enter Email: ");
			String email = sc.next();
			System.out.println("Enter Phone-Number");
			String number = sc.next();
			System.out.println("Enter Password: ");
			String password = sc.next();
			UserDetails userdetails = new UserDetails(firstName,lastName,email,number,password);
			UserRegistration registration = new UserRegistration();
			registration.register(userdetails);
		}
	}
