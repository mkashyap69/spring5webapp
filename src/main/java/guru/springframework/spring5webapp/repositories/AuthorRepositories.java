package guru.springframework.spring5webapp.repositories;
import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Authors;

public interface AuthorRepositories extends CrudRepository<Authors,Long> {

}
