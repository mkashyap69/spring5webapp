package guru.springframework.spring5webapp.repositories;
import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Publishers;

public interface PublisherRepositories extends CrudRepository<Publishers,Long> {

}
