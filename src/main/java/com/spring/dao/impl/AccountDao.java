package com.spring.dao.impl;

import com.spring.dao.IAccountDao;
import com.spring.model.Account;
import com.spring.utils.AccountRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
//if u put transaction here it will consider every invaketion as a  new transaction
@Transactional
public class AccountDao implements IAccountDao {
    private static final String save = "insert into account(account_number,name,ifsc_code,mobile_number) values (?,?,?,?)";
    private static final String select = "select * from account";

    @Autowired
    private JdbcTemplate template;
    private int i = 0;
//if u put transaction here it will consider every invaketion as a  new transaction
   // @Transactional
    @Override
    public Integer save(List<Account> account) {
        for (Account account1 : account) {
            int i = template.update(save, new Object[]
                    {account1.getAccountNumber(), account1.getName(),
                            account1.getIfscCode(), account1.getMobileNumber()});
        }
        return i;
    }

    @Override
    public List<Account> select() {
        return template.query(select, new AccountRowMapper());
    }
}
