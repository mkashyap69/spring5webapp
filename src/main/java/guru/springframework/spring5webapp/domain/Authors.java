
package guru.springframework.spring5webapp.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Authors {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;

	
	private String firstName;
	private String lastName;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="author_book",joinColumns=@JoinColumn(name="book_id"), inverseJoinColumns=@JoinColumn(name="author_id"))
	private Set<Books> books=new HashSet<>() ;
	public Authors() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Authors(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Authors other = (Authors) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Authors [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", books=" + books + "]";
	}
	
	
	
}