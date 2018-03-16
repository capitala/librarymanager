package com.practice.projects.librarymanagement.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookStatus {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private String status;
private Date borrowingDate;
private Date expectedReturnDate;
private MemberDetail borrower;
public long getId() {
	return id;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Date getBorrowingDate() {
	return borrowingDate;
}
public void setBorrowingDate(Date borrowingDate) {
	this.borrowingDate = borrowingDate;
}
public Date getExpectedReturnDate() {
	return expectedReturnDate;
}
public void setExpectedReturnDate(Date expectedReturnDate) {
	this.expectedReturnDate = expectedReturnDate;
}
public MemberDetail getBorrower() {
	return borrower;
}
public void setBorrower(MemberDetail borrower) {
	this.borrower = borrower;
}
@Override
	public String toString() {
		return this.getId()+this.getBorrower().getId()+this.getStatus()+this.getBorrowingDate()+this.getExpectedReturnDate();
	}
}
