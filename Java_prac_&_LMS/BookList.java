package com.Practice;

import java.util.ArrayList;

class Book{
	public int bookId;
	public String bookName;
	public String authorName;
	
	Book(int bookId, String bookName, String authorName){
		this.bookId=bookId;
		this.bookName=bookName;
		this.authorName=authorName;
	}
	  public int getBookId() {
		  return bookId;
	  }
	  public String getbookName() {
		  return bookName;
	  }
	  public String getauthorName() {
		  return authorName;
	  }
}

public class BookList {
	public static void main(String[] args) {
		ArrayList<Book> a1=new ArrayList<>();
		a1.add(new Book(101,"OOPS Concept", "Alan Kay"));
		a1.add(new Book(105,"CPP Programming", "E Balaguruswamy"));
		a1.add(new Book(102,"Engineering Maths", "RD Sharma"));
         
         for(Book o:a1) {
        	 System.out.println("Book id is: "+o.getBookId()+", Book name is: "+o.getbookName()+", Author name is: "+o.getauthorName());
         }
         
         
	}

}
