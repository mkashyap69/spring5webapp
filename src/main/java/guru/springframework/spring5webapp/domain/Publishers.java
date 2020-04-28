package guru.springframework.spring5webapp.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Publishers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;

	private String name;
	private String adressLine1;
	private String city;
    private String state;
    private String zip;
    
    
    @OneToMany(cascade= {CascadeType.ALL})
    @JoinColumn(name="publishers_id")
    private Set<Books> books=new HashSet<>();
	public Publishers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Publishers(String name, String adressLine1, String city, String state, String zip) {
		super();
		this.name = name;
		this.adressLine1 = adressLine1;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	
	
	public Set<Books> getBooks() {
		return books;
	}
	public void setBooks(Set<Books> books) {
		this.books = books;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdressLine1() {
		return adressLine1;
	}
	public void setAdressLine1(String adressLine1) {
		this.adressLine1 = adressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
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
		Publishers other = (Publishers) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Publlishers [Id=" + Id + ", name=" + name + ", adressLine1=" + adressLine1 + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + "]";
	}
    
    
	
	
}
