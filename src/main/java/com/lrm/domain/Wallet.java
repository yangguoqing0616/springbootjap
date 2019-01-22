package com.lrm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

/**
 * Created by limi on 2017/9/10.
 */
@Entity
public class Wallet {

    @Id
    @GeneratedValue
    private Long id;

    private BigDecimal balance;

    @OneToOne(mappedBy = "wallet")
    //@OneToOne(mappedBy = "wallet") 表示当前表(Wallet) 与 Author表有关联关系,这个关系一般是外键
    //这个外键用的是Author表里面的wallet属性(一般是表)的id值(可以指定那个字段) 的值. 这个外键放在了Author表里面
    private Author author;

    public Wallet() {
    }

    public Wallet(BigDecimal balance) {
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
