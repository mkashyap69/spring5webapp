
package guru.springframework.spring5webapp.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Authors {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;

	
	private String firstName;
	private String lastName;
	
	@ManyToMany
	@JoinTable(name="author_book",joinColumns=@JoinColumn(name="book_id"), inverseJoinColumns=@JoinColumn(name="author_id"))
	private Set<Books> books;
	public Authors() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Authors(String firstName, String lastName, Set<Books> books) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.books = books;
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Set<Books> getBooks() {
		return books;
	}
	public void setBooks(Set<Books> books) {
		this.books = books;
	}
	
	
	
}