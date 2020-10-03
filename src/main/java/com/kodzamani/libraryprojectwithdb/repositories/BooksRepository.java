package com.kodzamani.libraryprojectwithdb.repositories;

import com.kodzamani.libraryprojectwithdb.dataBaseVariables.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books,Long> {

}
