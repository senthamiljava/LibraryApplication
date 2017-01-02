package com.senthamil.bookapp.dao;

import java.util.List;

import com.senthamil.bookapp.book.Book;


public class ListTest {
public static void main(String[] args) throws Exception
{
	BookDao booklist = new BookDao();
	List<Book> l1 =booklist.list();
	for (Book book : l1) {
		System.out.println(book.getBook_id()+""+book.getBook_name()+""+book.getAuthor_name());
	}
}
}
