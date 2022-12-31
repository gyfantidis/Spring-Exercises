package giannis.springframework.Exercise1.controllers;

import giannis.springframework.Exercise1.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class AuthorController {
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){

        model.addAttribute("authors", authorRepository.findAll());

        return "authors/list";

    }
}
