package com.project.accounts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.accounts.model.AccountNasabah;
import com.project.accounts.repo.AccountRepo;

@Service
public class AccountService {
	
	
	@Autowired
	AccountRepo accountRepo;
	
	public void updateBalance(Double balance, int no_rek) {
		try {
			Double latestBalance = accountRepo.lastBal(no_rek);
			System.out.println("latestBalance:"+latestBalance);
			System.out.println("balance:"+balance);
			if (latestBalance == 0.0) {

			} else {
				Double fixBalance = latestBalance - balance;
				System.out.println("fixBalance:"+fixBalance);
				if (fixBalance < 0) {
				} else {
					 accountRepo.updateBalance(fixBalance, no_rek);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
