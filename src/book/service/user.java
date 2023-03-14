package book.service;

import book.dto.UserTO;
import book.dao.repo;

import java.util.Scanner;

public class user {
	static final Scanner scanner = new Scanner(System.in);
	static repo repository = new repo();

	public static void register() {



		System.out.println("Enter your Name");
		String name = scanner.next();

		System.out.println("Enter your Email");
		String email = scanner.next();

		System.out.println("enter tour pass");
		String pass=scanner.next();

		UserTO user = new UserTO(name, email,pass);

		repository.register(user);

	}
	public static int login() {

		System.out.println("Enter your email");
		String email = scanner.next();
		System.out.println("Enter your password");
		String pass = scanner.next();
		

		return repo.login(email,pass);
	}
}


