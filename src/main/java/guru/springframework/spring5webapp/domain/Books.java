

package guru.springframework.spring5webapp.domain;

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
		Books other = (Books) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Books [Id=" + Id + ", title=" + title + ", isBn=" + isBn + ", authors=" + authors + "]";
	}
	
	
}