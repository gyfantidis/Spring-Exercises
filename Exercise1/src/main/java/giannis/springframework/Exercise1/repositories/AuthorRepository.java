package giannis.springframework.Exercise1.repositories;

import org.springframework.data.repository.CrudRepository;
import giannis.springframework.Exercise1.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
