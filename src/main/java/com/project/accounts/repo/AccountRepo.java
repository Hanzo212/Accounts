package com.project.accounts.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.accounts.model.AccountNasabah;

import jakarta.transaction.Transactional;

@Repository
public interface AccountRepo extends JpaRepository<AccountNasabah, Integer>{
	
	@Query("select balance from AccountNasabah where no_rek=?1")
	Double lastBal(int no_rek);
	
	@Transactional
	@Modifying
	@Query(value="Update AccountNasabah set balance=?1 where no_rek=?2 ", nativeQuery=true)
	void updateBalance(Double balance, int no_rek);
	
}