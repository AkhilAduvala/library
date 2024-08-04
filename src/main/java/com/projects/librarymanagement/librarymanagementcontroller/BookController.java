package com.projects.librarymanagement.librarymanagementcontroller;

import com.projects.librarymanagement.librarymanagementdto.BookDTO;
import com.projects.librarymanagement.librarymanagementservice.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping("/newbook")
    public void newBook(@RequestBody BookDTO bookDTO){
        bookService.addBook(bookDTO);
    }

    @GetMapping("/getBook")
    public void searchBook(){
        System.out.println("inside get method");
    }
}