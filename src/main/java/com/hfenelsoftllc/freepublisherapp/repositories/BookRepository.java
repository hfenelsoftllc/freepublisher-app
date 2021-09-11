package com.hfenelsoftllc.freepublisherapp.repositories;

import com.hfenelsoftllc.freepublisherapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
