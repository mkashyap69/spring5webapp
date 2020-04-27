package guru.springframework.spring5webapp.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	private String title;
	private String isBn;
	
	@ManyToMany
	private Set<Author> author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Book(String title, String isBn, Set<Author> author) {
		super();
		this.title = title;
		this.isBn = isBn;
		this.author = author;
	}


	

	public Long getId() {
		return Id;
	}



	public void setId(Long id) {
		Id = id;
	}



	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsBn() {
		return isBn;
	}
	public void setIsBn(String isBn) {
		this.isBn = isBn;
	}
	public Set<Author> getAuthor() {
		return author;
	}
	public void setAuthor(Set<Author> author) {
		this.author = author;
	}
	
	
}
