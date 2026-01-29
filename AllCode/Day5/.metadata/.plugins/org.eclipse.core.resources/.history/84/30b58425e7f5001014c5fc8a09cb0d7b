package com.java.lib.dao;

import java.util.List;

import com.java.lib.model.Books;
import com.java.lib.model.LibUsers;
import com.java.lib.model.TranBook;

public interface LibraryDao {
	int authenticate(LibUsers libUsers);
	List<Books> search(String searchType, String searchValue);
	String issueBook(int bookId,String user);
	List<TranBook> showIssuedBooks(String user);
	
}
