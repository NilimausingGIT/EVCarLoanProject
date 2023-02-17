package com.evcar.team2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ledger {
	@Id
	
	private int ledgerId;
	private String ledgerCreatedDate;
	private double totalLoanAmount;
	private double payableAmountWithInterest;
	private int tenure;
	private double monthlyEMI;
	private double amountPaidtillDate;
	private double remainingAmount;
	private String nextEmiDatestart;
	private String nextEmiDateEnd;
	private int defaulterCount;
	private String previousEmiStatus;
	private String currentMonthEmiStatus;
	private String loanEndDate;
	private String loanStatus;
	public int getLedgerId() {
		return ledgerId;
	}
	public void setLedgerId(int ledgerId) {
		this.ledgerId = ledgerId;
	}
	public String getLedgerCreatedDate() {
		return ledgerCreatedDate;
	}
	public void setLedgerCreatedDate(String ledgerCreatedDate) {
		this.ledgerCreatedDate = ledgerCreatedDate;
	}
	public double getTotalLoanAmount() {
		return totalLoanAmount;
	}
	public void setTotalLoanAmount(double totalLoanAmount) {
		this.totalLoanAmount = totalLoanAmount;
	}
	public double getPayableAmountWithInterest() {
		return payableAmountWithInterest;
	}
	public void setPayableAmountWithInterest(double payableAmountWithInterest) {
		this.payableAmountWithInterest = payableAmountWithInterest;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getMonthlyEMI() {
		return monthlyEMI;
	}
	public void setMonthlyEMI(double monthlyEMI) {
		this.monthlyEMI = monthlyEMI;
	}
	public double getAmountPaidtillDate() {
		return amountPaidtillDate;
	}
	public void setAmountPaidtillDate(double amountPaidtillDate) {
		this.amountPaidtillDate = amountPaidtillDate;
	}
	public double getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
	public String getNextEmiDatestart() {
		return nextEmiDatestart;
	}
	public void setNextEmiDatestart(String nextEmiDatestart) {
		this.nextEmiDatestart = nextEmiDatestart;
	}
	public String getNextEmiDateEnd() {
		return nextEmiDateEnd;
	}
	public void setNextEmiDateEnd(String nextEmiDateEnd) {
		this.nextEmiDateEnd = nextEmiDateEnd;
	}
	public int getDefaulterCount() {
		return defaulterCount;
	}
	public void setDefaulterCount(int defaulterCount) {
		this.defaulterCount = defaulterCount;
	}
	public String getPreviousEmiStatus() {
		return previousEmiStatus;
	}
	public void setPreviousEmiStatus(String previousEmiStatus) {
		this.previousEmiStatus = previousEmiStatus;
	}
	public String getCurrentMonthEmiStatus() {
		return currentMonthEmiStatus;
	}
	public void setCurrentMonthEmiStatus(String currentMonthEmiStatus) {
		this.currentMonthEmiStatus = currentMonthEmiStatus;
	}
	public String getLoanEndDate() {
		return loanEndDate;
	}
	public void setLoanEndDate(String loanEndDate) {
		this.loanEndDate = loanEndDate;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
}
