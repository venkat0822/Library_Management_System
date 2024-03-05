package com.system.Library.BookService;

import com.system.Library.BookData.BookData;

import java.util.LinkedList;
import java.util.Scanner;

public class BookService {

	public static LinkedList<BookData> bookList = new LinkedList<>();
	Scanner s = new Scanner(System.in);

	public void addBook() {

		System.out.println("Enter the book id: ");
		int bid = s.nextInt();
		System.out.println("Enter the book title: ");
		s.nextLine();
		String title = s.nextLine();
		System.out.println("Enter the book author: ");
		String author = s.nextLine();
		System.out.println("Enter the published year: ");
		String year = s.nextLine();

		bookList.add(new BookData(bid, title, author, year, "Available"));

		System.out.println("Book has been added successfully!!");
	}

	public void showAllBooks() {
		
		boolean flag=false;
		for (BookData book : bookList) {

			System.out.println();
			System.out.println("The Book id: " + book.getBookId());
			System.out.println("The Book titile: " + book.getBookTitle());
			System.out.println("The Book Author: " + book.getBookAuthor());
			System.out.println("The Published year: " + book.getPublishYear());
			System.out.println("The status: " + book.getStatus());
			flag=true;
		}
		
		if(flag==false)
			System.out.println("There are no books in the library !!");
	}

	public void showAvailableBooks() {

		boolean flag = false;
		if (bookList.size() > 0) {
			for (BookData book : bookList) {

				if (book.getStatus().equals("Available")) {
					System.out.println();
					System.out.println("The Book id: " + book.getBookId());
					System.out.println("The Book titile: " + book.getBookTitle());
					System.out.println("The Book Author: " + book.getBookAuthor());
					System.out.println("The Published year: " + book.getPublishYear());
					System.out.println("The status: " + book.getStatus());
					flag = true;
				}
			}
		}
		if (flag == false)
			System.out.println("No books are available!..");
	}

	public void issueBook(String bname) {

		boolean flag = false;
		for (BookData book : bookList) {

			if (book.getBookTitle().equals(bname) && book.getStatus().equals("Available")) {
				flag = true;
				System.out.println("Book has been issued Successfully !!");
				book.setStatus("Not Available");
				System.out.println("Issued book details " + book);
			}
		}
		if (flag == false)
			System.out.println("The book cannot be issued as it is not available");

	}

	public void returnBook(String bname) {

		boolean flag = false;
		for (BookData book : bookList) {

			if (book.getBookTitle().equals(bname) && book.getStatus().equals("Not Available")) {
				flag = true;
				System.out.println("Book has been returned Successfully !!");
				book.setStatus("Available");
				System.out.println("Returned book details " + book);
			}
		}
		if (flag == false)
			System.out.println("The book cannot be returned");
	}

}
