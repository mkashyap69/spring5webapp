package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.domain.Authors;
import guru.springframework.spring5webapp.domain.Books;
import guru.springframework.spring5webapp.repositories.AuthorRepositories;
import guru.springframework.spring5webapp.repositories.BookRepositories;

@Component
public class BootStrapData implements CommandLineRunner {
	
	private final AuthorRepositories authorRepository;
	private final BookRepositories bookRepository;

	
	
	public BootStrapData(AuthorRepositories authorRepository, BookRepositories bookRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}



	@Override
	public void run(String... args) throws Exception {

Authors manish=new Authors("Manish","Kashyap");
Books ddd=new Books("HEEHEH","123123");
manish.getBooks().add(ddd);
ddd.getAuthor().add(manish);

authorRepository.save(manish);
bookRepository.save(ddd);

   System.out.println("Started in Bootstrap");

	}

}
