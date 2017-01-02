package com.senthamil.bookapp.dao;


public class TestDelete {
	public static void main(String[] args) throws Exception
	{
		BookDao booklist = new BookDao();
		int rs1;
		rs1=booklist.remove(2);
		if(rs1==1)
			System.out.println("record deleted success");
		else
			System.out.println("no record available");
	}
}
