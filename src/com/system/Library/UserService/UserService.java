package com.system.Library.UserService;

import java.util.LinkedList;
import java.util.Scanner;

import com.system.Library.BookService.BookService;
import com.system.Library.UserData.UserData;

public class UserService {

	UserData user = new UserData();
	public LinkedList<UserData> usersList = user.returnList();

	public void loginRun(Scanner obj, UserData user, UserService service, BookService book) {

		String flagc = "";
		while (true) {
			System.out.println();
			System.out.println("LOGIN");
			System.out.println();
			System.out.println("Enter the username: ");
			String username = obj.next();
			System.out.println("Enter the password: ");
			String password = obj.next();
			boolean flag = validate(username, password);
			if (!flag) {
				System.out.println("Incorrect password");
				continue;
			} else
				System.out.println("Logged in succesfully!!!");
			System.out.println();
			System.out.println("Welcome to Library Management System");
			System.out.println();
			do {
				System.out.println("1. Add Book");
				System.out.println("2. Show All Books");
				System.out.println("3. Show Available Books");
				System.out.println("4. Issue Book");
				System.out.println("5. Return Book");
				System.out.println("6. Logout");
				System.out.println("Enter your choice (1/2/3/4/5/6): ");
				int option = obj.nextInt();
				obj.nextLine();
				switch (option) {
				case 1:
					book.addBook();
					break;
				case 2:
					book.showAllBooks();
					break;
				case 3:
					book.showAvailableBooks();
					break;
				case 4:
					System.out.println("Enter the book that you wanna issue: ");
					String bookname = obj.nextLine();
					book.issueBook(bookname);
					break;
				case 5:
					System.out.println("Enter the book that you wanna issue: ");
					String bname = obj.nextLine();
					book.returnBook(bname);
					break;
				case 6:
					break;
				default:
					System.out.println("Invalid option!!");
				}
				System.out.println("Do you want to continue (y/n) ???");
				flagc = obj.next();
			} while (flagc.equalsIgnoreCase("y"));
		}
	}

	public void userRegister(Scanner obj, UserData user, UserService service, BookService book) {

		System.out.println();
		System.out.println("REGISTER");
		System.out.println();
		System.out.println("Enter the UserId: ");
		int id = obj.nextInt();
		System.out.println("Enter the username: ");
		String username = obj.next();
		System.out.println("Enter the password: ");
		String password = obj.next();

		if (checkUser(username)) {
			System.out.println("UserName Already exists");
		} else {
			usersList.add(new UserData(id, username, password));
			System.out.println("User added successfully !!");
			loginRun(obj, user, service, book);
		}

	}

	public boolean checkUser(String username) {

		for (UserData user : usersList) {

			if (user.getUserName().equals(username))
				return true;
		}
		return false;
	}

	public boolean validate(String username, String password) {

		for (UserData user : usersList) {

			if (user.getUserName().equals(username) && user.getPassword().equals(password))
				return true;
		}
		return false;
	}

}
