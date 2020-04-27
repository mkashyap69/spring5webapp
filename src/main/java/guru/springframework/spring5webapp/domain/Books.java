@@ -1,73 +0,0 @@

package guru.springframework.spring5webapp.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Books {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	private String title;
	private String isBn;
	
	@ManyToMany
	private Set<Authors> authors;
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Books(String title, String isBn, Set<Authors> authors) {
		super();
		this.title = title;
		this.isBn = isBn;
		this.authors = authors;
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
	public Set<Authors> getAuthor() {
		return authors;
	}
	public void setAuthor(Set<Authors> author) {
		this.authors = authors;
	}
	
	
}