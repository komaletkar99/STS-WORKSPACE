package com.element.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.element.entity.Account;
import com.element.service.AccountService;

public interface AccountDao extends JpaRepository<Account, Serializable> {

}
