package com.spring.dao;

import com.spring.model.Account;

import java.util.List;

public interface IAccountDao {
    Integer save(List<Account> account);
   List<Account> select();
}
