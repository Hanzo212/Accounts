package com.project.accounts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class account_nasabah {
	
	@Id
	@Column (name = "nama_nasabah")
	private String nama_nasabah;
	@Column (name = "email_nasabah")
	private String email_nasabah;
	@Column (name = "no_rek")
	private int no_rek;
	@Column (name = "balance")
	private double balance;
	@Column (name = "status_rek")
	private String status_rek;
	//untuk type rekening debit atau CC
	@Column (name="type_rek")
	private String type_rek;
}
