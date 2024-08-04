package com.projects.librarymanagement.librarymanagementdto;

import lombok.Data;

import java.util.Date;

@Data
public class BookDTO {

    private int bookId;
    private String bookName;
    private int publicationId;
    private int authorId;
    private Date publishedDate;
}
