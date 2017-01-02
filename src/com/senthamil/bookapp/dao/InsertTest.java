package com.senthamil.bookapp.dao;

import com.senthamil.bookapp.book.Book;

public class InsertTest {
	public static void main(String[] args) throws Exception
	{
	Book m = new Book();
	m.setBook_name("abc");
	m.setAuthor_name("");
	BookDao book = new BookDao();
	book.insert(m);
}
}