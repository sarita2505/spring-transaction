package com.spring.utils;

import com.spring.model.Account;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRowMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account=new Account();
       // account.setId(resultSet.getInt("id"));
        account.setAccountNumber(resultSet.getString("account_number"));
        account.setName(resultSet.getString("name"));
        account.setIfscCode(resultSet.getString("ifsc_code"));
        account.setMobileNumber(resultSet.getString("mobile_number"));
        return account;
    }
}
