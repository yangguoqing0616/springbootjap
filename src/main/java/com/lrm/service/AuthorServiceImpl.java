package com.lrm.service;

import com.lrm.domain.Author;
import com.lrm.domain.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by limi on 2017/9/10.
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepostiory;

    @Transactional
    @Override
    public Author updateAuthor() {
        Author author = new Author();
        author.setPhone("9999999999");
        author.setNickName("自由自在1");
        author.setSignDate(new Date());
        Author author1 = authorRepostiory.save(author);

        author1.setPhone("111111111");
        Author author2 = authorRepostiory.save(author1);

        int i = 8/0;
        return author2;
    }


    @Override
    public Author saveAuthor(Author author) {
        return authorRepostiory.save(author);
    }

    @Override
    public Author updateAuthor(Author author) {
        return authorRepostiory.save(author);
    }

    @Override
    public Author findAuthor(Long id) {
       // return authorRepostiory.findOne(id);
        return null;
    }

    @Override
    public void deleteAuthor(Long id) {
        //authorRepostiory.delete(id);
    }


}
