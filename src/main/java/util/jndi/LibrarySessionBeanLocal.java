package util.jndi;

import java.util.List;

import javax.ejb.Local;

@Local
public interface LibrarySessionBeanLocal {
	
	void addBook(String bookName);
	List<String> getBooks();

}
