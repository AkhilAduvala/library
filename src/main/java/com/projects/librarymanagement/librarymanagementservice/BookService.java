package com.projects.librarymanagement.librarymanagementservice;

import com.projects.librarymanagement.librarymanagementdto.BookDTO;
import com.projects.librarymanagement.librarymanagementmodel.Book;
import com.projects.librarymanagement.librarymanagementrepository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void addBook(BookDTO bookDTO){

        Book book = new Book();
        book.setBookName(bookDTO.getBookName());
        book.setPublicationId(bookDTO.getPublicationId());
        book.setAuthorId(bookDTO.getAuthorId());
        book.setPublishedDate(bookDTO.getPublishedDate());

        bookRepository.save(book);
    }
}
