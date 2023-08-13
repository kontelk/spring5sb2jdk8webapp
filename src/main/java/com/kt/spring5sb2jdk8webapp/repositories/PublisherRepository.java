package com.kt.spring5sb2jdk8webapp.repositories;

import com.kt.spring5sb2jdk8webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kontelk on 8/13/23.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
