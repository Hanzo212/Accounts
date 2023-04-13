package com.project.accounts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.accounts.repo.AccountRepo;

@Service
public class AccountService {
	
	@Autowired
	AccountRepo accountRepo;

}
