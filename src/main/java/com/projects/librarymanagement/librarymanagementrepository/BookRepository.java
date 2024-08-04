package com.projects.librarymanagement.librarymanagementrepository;

import com.projects.librarymanagement.librarymanagementmodel.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
