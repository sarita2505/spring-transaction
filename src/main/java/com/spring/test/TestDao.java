package com.spring.test;

import com.spring.dao.IAccountDao;
import com.spring.model.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class TestDao implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestDao.class);
    @Autowired
    IAccountDao dao;
    List<Account> list = new ArrayList<>();
//if u put transaction here ..it will check the successful transaction of each invoketion..and it will be rolled back
//when one got failed
   // @Transactional
    @Override
    public void run(String... args) throws Exception {
        Account account = new Account();
        // account.setId(1);
//        account.setAccountNumber("129067856789");
//        account.setName("saritapp");
//        account.setIfscCode("1324");
//        account.setMobileNumber("987654321000");
        Account account1 = new Account();
        //account1.setId(1);
        account1.setAccountNumber("345566789000");
        account1.setName("dipeep");
        account1.setIfscCode("1324");
        account1.setMobileNumber("98765");
        Account account2 = new Account("73872911284", "gadha454", "12345", "576322290");
        Account account3= new Account("73872921183349090", "gadha11000", "12345", "57446333290000");
        Account account4 = new Account("7387292222222849090", "gadha23000", "123455", "5763332900000");

        list=Arrays.asList(account1,account2);
        try {
            dao.save(list);
        } catch (DataAccessException e) {
            LOGGER.info("========duplicate values inserted======" + e);
        }
        list=Arrays.asList(account3,account4);
        try {
            dao.save(list);
        } catch (DataAccessException e) {
            LOGGER.info("========duplicate values inserted======");
        }

        list = dao.select();
        System.out.println("===========" + list);
    }
}
