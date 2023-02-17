package com.evcar.team2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SanctionLetter {
	@Id
	private int sanctionId;
	private String sanctionDate;
	private String applicantName;
	private double contactDetails;
	private double loanAmtSanctioned;
	private String interestType;
	private int rateOfInterest;
	private int loanTenure;
	private double monthlyEmiAmount;
	private String modeOfPayment;
	private String remarks;
	private String termsCondition;
	private String status;
	
	public int getSanctionId() {
		return sanctionId;
	}
	public void setSanctionId(int sanctionId) {
		this.sanctionId = sanctionId;
	}
	public String getSanctionDate() {
		return sanctionDate;
	}
	public void setSanctionDate(String sanctionDate) {
		this.sanctionDate = sanctionDate;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public double getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(double contactDetails) {
		this.contactDetails = contactDetails;
	}
	
	public double getLoanAmtSanctioned() {
		return loanAmtSanctioned;
	}
	public void setLoanAmtSanctioned(double loanAmtSanctioned) {
		this.loanAmtSanctioned = loanAmtSanctioned;
	}
	public String getInterestType() {
		return interestType;
	}
	public void setInterestType(String interestType) {
		this.interestType = interestType;
	}
	public int getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}
	public double getMonthlyEmiAmount() {
		return monthlyEmiAmount;
	}
	public void setMonthlyEmiAmount(double monthlyEmiAmount) {
		this.monthlyEmiAmount = monthlyEmiAmount;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getTermsCondition() {
		return termsCondition;
	}
	public void setTermsCondition(String termsCondition) {
		this.termsCondition = termsCondition;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "SanctionLetter [sanctionId=" + sanctionId + ", sanctionDate=" + sanctionDate + ", applicantName="
				+ applicantName + ", contactDetails=" + contactDetails + ", loanAmtSanctioned=" + loanAmtSanctioned
				+ ", interestType=" + interestType + ", rateOfInterest=" + rateOfInterest + ", loanTenure=" + loanTenure
				+ ", monthlyEmiAmount=" + monthlyEmiAmount + ", modeOfPayment=" + modeOfPayment + ", remarks=" + remarks
				+ ", termsCondition=" + termsCondition + ", status=" + status + "]";
	}
	
	
	















}
