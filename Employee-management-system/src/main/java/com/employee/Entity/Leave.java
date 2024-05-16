package com.employee.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Leave {
	@Id
	@GeneratedValue	
	int id;
	String phone;
	String fromDate;
	String toDate;
	String reasone;
	
	
	
	
	public Leave(int id,String phone, String fromDate, String toDate, String reasone) {
		super();
		this.id=id;
		this.phone = phone;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.reasone = reasone;
	}
	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getReasone() {
		return reasone;
	}
	public void setReasone(String reasone) {
		this.reasone = reasone;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Leave [id=" + id + ", phone=" + phone + ", fromDate=" + fromDate + ", toDate=" + toDate + ", reasone="
				+ reasone + "]";
	}
	
	
}
