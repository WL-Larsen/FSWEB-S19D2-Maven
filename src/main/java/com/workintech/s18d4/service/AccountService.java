package com.workintech.s18d4.service;

import com.workintech.s18d4.entity.Account;
import com.workintech.s18d4.entity.Customer;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account find(long id);
    Account save(Account account);
    Account delete(long id);
}
