package com.example.SaveTravels.Modles;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity	
@Table(name= "travels")	

public class Travels {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotNull
@Size(min = 1, max = 200)
private String expense;

@NotNull
@Size(min = 1, max = 200)
private String descritpion;


@NotNull
@Size(min = 1, max = 200)
private String vendor;

@NotNull
@Min(0)
private Double amount;



@Column(updatable=false)
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date createdAt;
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date updatedAt;


public Travels () {
	
}

public Travels( String expense,String vendor,
		 Double amount , String descritpion) {
	this.expense = expense;
	this.vendor = vendor;
	this.amount = amount;
	this.descritpion=descritpion;
}

@PrePersist
protected void onCreate(){
    this.createdAt = new Date();
}
@PreUpdate
protected void onUpdate(){
    this.updatedAt = new Date();
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getExpense() {
	return expense;
}
public void setExpense(String expense) {
	this.expense = expense;
}
public String getVendor() {
	return vendor;
}
public void setVendor(String vendor) {
	this.vendor = vendor;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public Date getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}
public Date getUpdatedAt() {
	return updatedAt;
}
public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}
public String getDescritpion() {
	return descritpion;
}

public void setDescritpion(String descritpion) {
	this.descritpion = descritpion;
}
}
