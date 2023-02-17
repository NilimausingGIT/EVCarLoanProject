package com.evcar.team2.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity


public class CurrentLoanDetails {
	@Id
	
	private int loanId; 
	private double loanAmount; 
	private double loanRoi;
	private int loanTenure; 
	private double loanAmounttobePaid; 
	private double sanctionAmount; 
	@OneToOne(cascade = CascadeType.ALL)
	private EmiDetail emidetails;
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoanDetails previousloandetails;

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getLoanRoi() {
		return loanRoi;
	}

	public void setLoanRoi(double loanRoi) {
		this.loanRoi = loanRoi;
	}

	public int getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}

	public double getLoanAmounttobePaid() {
		return loanAmounttobePaid;
	}

	public void setLoanAmounttobePaid(double loanAmounttobePaid) {
		this.loanAmounttobePaid = loanAmounttobePaid;
	}

	public double getSanctionAmount() {
		return sanctionAmount;
	}

	public void setSanctionAmount(double sanctionAmount) {
		this.sanctionAmount = sanctionAmount;
	}

	public EmiDetail getEmidetails() {
		return emidetails;
	}

	public void setEmidetails(EmiDetail emidetails) {
		this.emidetails = emidetails;
	}

	public PreviousLoanDetails getPreviousloandetails() {
		return previousloandetails;
	}

	public void setPreviousloandetails(PreviousLoanDetails previousloandetails) {
		this.previousloandetails = previousloandetails;
	}

	


}
