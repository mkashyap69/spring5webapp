package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.domain.Books;


public interface BookRepositories extends CrudRepository<Books,Long>{

}
