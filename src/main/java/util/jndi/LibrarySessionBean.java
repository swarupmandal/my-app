package util.jndi;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

@Stateless
public class LibrarySessionBean implements LibrarySessionBeanLocal {

	List<String> bookShelf;
	
	public LibrarySessionBean() {
		bookShelf = new ArrayList<String>();
	}

	public void addBook(String bookName) {
		bookShelf.add(bookName);
		
	}

	public List<String> getBooks() {
		return bookShelf;
	}
	
	

}
