package com.system.Library;

import java.util.Scanner;

import com.system.Library.BookService.BookService;
import com.system.Library.UserData.UserData;
import com.system.Library.UserService.UserService;

public class LibraryExecutor {

	public static void main(String[] args) {

		UserData user;
		String flagc = "";
		UserService service = new UserService();
		BookService book = new BookService();
		Scanner obj = new Scanner(System.in);
		outerloop: while (true) {
			System.out.println("Enter the username: ");
			String username = obj.nextLine();
			user = service.returnUser(username);
			if (user == null) {
				System.out.println("User not Found");
				continue;
			}
			System.out.println("Enter the password: ");
			String password = obj.nextLine();
			boolean flag = service.validate(username, password);
			if (!flag){
				System.out.println("Incorrect password");
				continue;
			}
			System.out.println("Welcome to Library Management System");
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
					System.out.println("Do you wanna login again (y/n) ? ");
					String ch = obj.next();
				    obj.nextLine();
					if (ch.equalsIgnoreCase("y"))
						continue outerloop;
					else {
						System.out.println("Thank you.");
						System.exit(0);
						break outerloop;
					}
				default:
					System.out.println("Invalid option!!");
				}
				System.out.println("Do you want to continue (y/n) ???");
				flagc = obj.nextLine();
			} while (flagc.equalsIgnoreCase("y"));
			obj.close();

			break;
		}
	}
}
