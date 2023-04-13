package com.project.accounts.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.accounts.model.AccountNasabah;

import jakarta.transaction.Transactional;

@Repository
public interface AccountRepo extends JpaRepository<AccountNasabah, String>{
	
	@Transactional
	@Query(value="Update account_nasabah set balance=?1 where no_rek=?2")
	void updateBalance(Double balance, int no_rek);
}
