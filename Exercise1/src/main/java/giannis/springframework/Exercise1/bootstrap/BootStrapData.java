package giannis.springframework.Exercise1.bootstrap;

import giannis.springframework.Exercise1.domain.Author;
import giannis.springframework.Exercise1.domain.Book;
import giannis.springframework.Exercise1.domain.BookRepository;
import giannis.springframework.Exercise1.domain.Publisher;
import giannis.springframework.Exercise1.repositories.AuthorRepository;
import giannis.springframework.Exercise1.repositories.BookRepositories;
import giannis.springframework.Exercise1.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository  authorRepository;
    private final BookRepositories bookRepositories;
    private final PublisherRepository publisherRepository;


    public BootStrapData(AuthorRepository authorRepository, BookRepositories bookRepositories,
                         PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepositories = bookRepositories;

        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in BootStrap");

        Publisher publisher = new Publisher();
        publisher.setName("Psaltos");
        publisher.setCity("Kilkis");
        publisher.setState("GR");

        publisherRepository.save(publisher);

        System.out.println("Publisher Count: " + publisherRepository.count());

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driver Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepositories.save(ddd);
        publisherRepository.save(publisher);

        Author rob = new Author("Rob", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        rob.getBooks().add(noEJB);
        noEJB.getAuthors().add(rob);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);


        authorRepository.save(rob);
        bookRepositories.save(noEJB);
        publisherRepository.save(publisher);


        System.out.println("Number of Books: "+ bookRepositories.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());


    }
}
