package com.senthamil.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.senthamil.bookapp.book.Book;
import com.senthamil.bookapp.connection.ModelConnection;

public class BookDao {
	public void insert(Book m) throws Exception {

		Connection con = ModelConnection.getConnection();
		String sql = "insert into book ( book_name,author) values ( ?,? )";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, m.getBook_name());
		pst.setString(2, m.getAuthor_name());
		int rows = pst.executeUpdate();
		if(rows==1)
			System.out.println("book registered ------ thankyou");
	}
	

	public List<Book> list() throws Exception {

		List<Book> bookList = new ArrayList<>();
		Connection con = ModelConnection.getConnection(); 
		String sql = "select book_id,book_name,author from book";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("book_id");
			String book_name = rs.getString("book_name");
			String author_name=rs.getString("author");
			Book m = new Book();
			m.setBook_id(id);
			m.setBook_name(book_name);
			m.setAuthor_name(author_name);
			bookList.add(m);
		}
		return bookList;
	}
	public int remove(int book_num) throws Exception
	{
		Connection con=ModelConnection.getConnection();
		String str="delete from book where book_id=?";
		PreparedStatement pst=con.prepareStatement(str);
		pst.setInt(1,book_num);
		int rs=pst.executeUpdate();
		return rs;
	}
}
