package com.system.Library.BookData;

public class BookData {
	
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String publishYear;
	private String status;
	
	
	public BookData(int bookId, String bookTitle, String bookAuthor, String publishYear, String status) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.publishYear = publishYear;
		this.status=status;
	}
	
	public BookData() {
		
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(String publishYear) {
		this.publishYear = publishYear;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BookData [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor
				+ ", publishYear=" + publishYear + ", status=" + status + "]";
	}
	
	
	
	
}
