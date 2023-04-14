package com.project.accounts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
//@Data
//@NoArgsConstructor
@Table(name="accountnasabah")
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
	
	public int getNo_rek() {
		return no_rek;
	}
	public void setNo_rek(int no_rek) {
		this.no_rek = no_rek;
	}
	public String getNama_nasabah() {
		return nama_nasabah;
	}
	public void setNama_nasabah(String nama_nasabah) {
		this.nama_nasabah = nama_nasabah;
	}
	public String getEmail_nasabah() {
		return email_nasabah;
	}
	public void setEmail_nasabah(String email_nasabah) {
		this.email_nasabah = email_nasabah;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getStatus_rek() {
		return status_rek;
	}
	public void setStatus_rek(String status_rek) {
		this.status_rek = status_rek;
	}
	public String getType_rek() {
		return type_rek;
	}
	public void setType_rek(String type_rek) {
		this.type_rek = type_rek;
	}
}
