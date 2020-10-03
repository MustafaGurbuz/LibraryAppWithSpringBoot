package com.kodzamani.libraryprojectwithdb.controller;

import com.kodzamani.libraryprojectwithdb.dataBaseVariables.Books;
import com.kodzamani.libraryprojectwithdb.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class BooksController {


    @Autowired
    BooksRepository booksRepo;

    @GetMapping("/")
    public String getAllBooks(Model model,@RequestParam(defaultValue="0") int page){
        model.addAttribute("data", booksRepo.findAll(PageRequest.of(page, 4)));
        model.addAttribute("currentPage",page);
        return "index";
    }

    @PostMapping("/save")
    public String save(Books b){
        booksRepo.save(b);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteBooks(long id){
        booksRepo.deleteById(id);

        return "redirect:/";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Optional<Books> findOneBooks(long id){
        return booksRepo.findById(id);
    }
}
