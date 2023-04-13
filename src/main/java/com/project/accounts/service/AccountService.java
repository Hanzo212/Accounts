package com.project.accounts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.accounts.model.AccountNasabah;
import com.project.accounts.repo.AccountRepo;

@Service
public class AccountService {
	
	@Autowired
	AccountRepo accountRepo;
	
	public List<AccountNasabah> getAccountByNoRek(int no_rek) {
		return accountRepo.x(no_rek);
	}

}
