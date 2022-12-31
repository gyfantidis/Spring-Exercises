package giannis.springframework.Exercise1.controllers;


import giannis.springframework.Exercise1.repositories.BookRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class BookController {

    private final BookRepositories bookRepositories;

    public BookController(BookRepositories bookRepositories) {
        this.bookRepositories = bookRepositories;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookRepositories.findAll());

        return "books/list";
    }
}
