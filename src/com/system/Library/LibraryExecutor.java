package com.system.Library;

import java.util.Scanner;

import com.system.Library.BookService.BookService;
import com.system.Library.UserData.UserData;
import com.system.Library.UserService.UserService;

public class LibraryExecutor {

	public static void main(String[] args) {

		UserData user = new UserData();
		String ch = "";
		UserService service = new UserService();
		BookService book = new BookService();
		Scanner obj = new Scanner(System.in);

		do {
			System.out.println("1. Login");
			System.out.println("2. Register (If new User)");
			System.out.println("Enter the option(1/2): ");
			int option = obj.nextInt();
			obj.nextLine();
			switch (option) {
			case 1:
				service.loginRun(obj, user, service, book);
				break;
			case 2:
				service.userRegister(obj, user, service, book);
				break;
			default:
				System.out.println("Enter a valid choice !");
			}
			System.out.println("Do you wanna login or register again??");
			obj.nextLine();
			ch = obj.next();
		} while (ch.equalsIgnoreCase("y"));
		
		obj.close();
	}
}
