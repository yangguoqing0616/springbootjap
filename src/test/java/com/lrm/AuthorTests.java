package com.lrm;

import com.alibaba.fastjson.JSON;
import com.lrm.domain.Author;
import com.lrm.domain.AuthorRepository;
import com.lrm.domain.Wallet;
import com.lrm.domain.WalletRepository;
import com.lrm.service.AuthorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by limi on 2017/9/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorTests {

    @Autowired
    private AuthorRepository authorRepostiory;

    @Autowired
    private WalletRepository walletRepository;

    @Autowired
    private AuthorService authorService;

    @Test
    public void saveAuthorTest() {
        Author author = new Author();
        author.setNickName("Arvin");
        author.setPhone("18217687652");
        author.setSignDate(new Date());
        author.setWallet(new Wallet(new BigDecimal(188.23)));

        authorRepostiory.save(author);
    }

    @Test
    public void updateAuthor() {
        Author author = authorService.findAuthor(2L);
        author.setPhone("18217564563");
        Wallet wallet = author.getWallet();
        wallet.setBalance(new BigDecimal(288.88));
        author.setWallet(wallet);

        authorService.updateAuthor(author);
    }





    @Test
    public void findAuthorTest() {
        Author author = authorService.findAuthor(2L);
        System.out.println(JSON.toJSONString(author,true));
    }


    @Test
    public void deleteAuthorTest() {
        authorService.deleteAuthor(2L);
    }


    @Test
    public void findAuthorForPageTest() {

        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Pageable pageable = new PageRequest(1,5,sort);
        Page<Author> page = authorRepostiory.findAll(pageable);

        System.out.println(JSON.toJSONString(page,true));
    }


    @Test
    public void transactionalTest() {
        authorService.updateAuthor();
    }


    @Test
    public void findWalletTest() {

        /*Wallet wallet = walletRepository.findOne(1L);
        System.out.println(JSON.toJSONString(wallet,true));*/
    }



}
