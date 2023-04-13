package com.project.accounts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.accounts.model.AccountNasabah;
import com.project.accounts.repo.AccountRepo;
import com.project.accounts.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountService accountService;
	@Autowired
	AccountRepo accountRepo;

	// inquiry no rekening
	@GetMapping("/act/{no-rek}")
	public List<AccountNasabah> getDetailAccount(@PathVariable("no-rek") int no_rek) {
		return accountService.getAccountByNoRek(no_rek);
	}

	// update balance
	@PutMapping("/act/bal/{nom}/{no-rek}")
	public AccountNasabah updateBalance(@RequestBody AccountNasabah accountNasabah, @PathVariable("nom") Double balance, @PathVariable("no-rek")int no_rek) {
		accountNasabah.setBalance(balance);
		accountNasabah.setNo_rek(no_rek);
		return accountRepo.save(accountNasabah);
		
	}
}
