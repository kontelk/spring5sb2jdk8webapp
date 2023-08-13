package com.kt.spring5sb2jdk8webapp.repositories;

import com.kt.spring5sb2jdk8webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kontelk on 8/13/23.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
