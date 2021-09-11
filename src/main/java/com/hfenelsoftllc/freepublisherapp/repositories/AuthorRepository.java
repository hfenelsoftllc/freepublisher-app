package com.hfenelsoftllc.freepublisherapp.repositories;

import com.hfenelsoftllc.freepublisherapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
