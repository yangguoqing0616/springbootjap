package com.lrm.service;

import com.lrm.domain.Author;

/**
 * Created by limi on 2017/9/10.
 */
public interface AuthorService {

    Author updateAuthor();

    Author saveAuthor(Author author);

    Author updateAuthor(Author author);

    Author findAuthor(Long id);

    void deleteAuthor(Long id);

}
