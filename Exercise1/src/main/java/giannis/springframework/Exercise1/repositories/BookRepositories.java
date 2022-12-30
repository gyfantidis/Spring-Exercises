package giannis.springframework.Exercise1.repositories;

import org.springframework.data.repository.CrudRepository;
import giannis.springframework.Exercise1.domain.Book;

public interface BookRepositories extends CrudRepository<Book, Long> {
}
