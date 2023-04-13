package com.project.accounts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="account_nasabah")
@NoArgsConstructor
public class AccountNasabah {
	
	@Id
	@Column (name = "no_rek")
	private int no_rek;
	@Column (name = "nama_nasabah")
	private String nama_nasabah;
	@Column (name = "email_nasabah")
	private String email_nasabah;
	@Column (name = "balance")
	private double balance;
	@Column (name = "status_rek")
	private String status_rek;
	//untuk type rekening debit atau CC
	@Column (name="type_rek")
	private String type_rek;
}
