package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.domain.Authors;
import guru.springframework.spring5webapp.domain.Books;
import guru.springframework.spring5webapp.domain.Publishers;
import guru.springframework.spring5webapp.repositories.AuthorRepositories;
import guru.springframework.spring5webapp.repositories.BookRepositories;
import guru.springframework.spring5webapp.repositories.PublisherRepositories;

@Component
public class BootStrapData implements CommandLineRunner {
	
	private final AuthorRepositories authorRepository;
	private final BookRepositories bookRepository;
	private final PublisherRepositories publisherRepository;

	
	
	public BootStrapData(AuthorRepositories authorRepository, BookRepositories bookRepository, PublisherRepositories publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository=publisherRepository;
	}



	@Override
	public void run(String... args) throws Exception {

Authors manish=new Authors("Manish","Kashyap");
Books ddd=new Books("HEEHEH","123123");
Publishers pub=new Publishers("Publishers","Colony","tata","jharkhand","832165");
manish.getBooks().add(ddd);
ddd.getAuthor().add(manish);

authorRepository.save(manish);
bookRepository.save(ddd);
publisherRepository.save(pub);


   System.out.println("Started in Bootstrap");
   
   System.out.println(bookRepository.count());

	}

}
