package com.projects.librarymanagement.librarymanagementmodel;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "Books")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String bookName;
    private int publicationId;
    private int authorId;
    private Date publishedDate;


}
