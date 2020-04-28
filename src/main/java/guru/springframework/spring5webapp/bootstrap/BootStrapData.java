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

		System.out.println("Started in Bootstrap");

        Publishers publisher = new Publishers();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

        publisherRepository.save(publisher);

        System.out.println("Publisher Count: " + publisherRepository.count());

        Authors eric = new Authors("Eric", "Evans");
        Books ddd = new Books("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthor().add(eric);

        ddd.setPublishers(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Authors rod = new Authors("Rod", "Johnson");
        Books noEJB = new Books("J2EE Development without EJB", "3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAuthor().add(rod);

        noEJB.setPublishers(publisher);
        publisher.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());
    }
	

}
