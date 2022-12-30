package giannis.springframework.Exercise1.bootstrap;

import giannis.springframework.Exercise1.domain.Author;
import giannis.springframework.Exercise1.domain.Book;
import giannis.springframework.Exercise1.domain.BookRepository;
import giannis.springframework.Exercise1.repositories.AuthorRepository;
import giannis.springframework.Exercise1.repositories.BookRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository  authorRepository;
    private final BookRepositories bookRepositories;


    public BootStrapData(AuthorRepository authorRepository, BookRepositories bookRepositories) {
        this.authorRepository = authorRepository;
        this.bookRepositories = bookRepositories;

    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driver Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepositories.save(ddd);

        Author rob = new Author("Rob", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        rob.getBooks().add(noEJB);
        noEJB.getAuthors().add(rob);

        authorRepository.save(rob);
        bookRepositories.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: "+ bookRepositories.count());


    }
}
