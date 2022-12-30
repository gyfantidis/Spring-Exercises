package giannis.springframework.Exercise1.repositories;

import giannis.springframework.Exercise1.domain.Publisher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
