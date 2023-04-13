package com.project.accounts.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.accounts.model.AccountNasabah;

import jakarta.transaction.Transactional;

@Repository
public interface AccountRepo extends JpaRepository<AccountNasabah, Integer>{
	
	@Transactional
	@Query(value="Update AccountNasabah set balance=?1 where no_rek=?2")
	void updateBalance(Double balance, int no_rek);
	
	@Query(value="select balance, status_rek, type_rek from AccountNasabah where no_rek=?1")
	List<AccountNasabah> accountDetail (int no_rek);
}