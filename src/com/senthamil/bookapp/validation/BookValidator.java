package com.senthamil.bookapp.validation;

import java.util.List;
import java.util.Scanner;

import com.senthamil.bookapp.book.Book;
import com.senthamil.bookapp.dao.BookDao;
public class BookValidator {
public static void main(String args[]) throws Exception
{
	System.out.println("       welcome to library \n enter the choice");
	int user_value;
	System.out.println(" 1.Return book \n 2.view book \n 3.take book");
	Scanner inp=new Scanner(System.in);
	user_value=inp.nextInt();
	String bookname;
	String authorname;
	int booknumber;
	switch(user_value)
	{
	case 1:
		Book m = new Book();
		System.out.println("enter the book name and author name");
		bookname=inp.next();
	    authorname=inp.next();
		m.setBook_name(bookname);
		m.setAuthor_name(authorname);
		BookDao book = new BookDao();
		book.insert(m);
		break;
	case 2:
		BookDao booklist = new BookDao();
		List<Book> l1 =booklist.list();
		for (Book bookl1 : l1) {
			System.out.println(bookl1.getBook_id()+""+ bookl1.getBook_name()+""+ bookl1.getAuthor_name());
		}
		break;
	case 3:
		BookDao booklist1 = new BookDao();
		System.out.println("enter the book number");
		booknumber=inp.nextInt();
		int rs1;
		rs1=booklist1.remove(booknumber);
		if(rs1==1)
			System.out.println("record deleted success");
		else
			System.out.println("no record available");
	default:
		System.out.println("invalid access");
	}	
	inp.close();
}
}
