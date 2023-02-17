package com.evcar.team2.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	@OneToOne(cascade = CascadeType.ALL)
	private Cibil cibil;
	@OneToOne(cascade = CascadeType.ALL)
	private CurrentLoanDetails currentloandetails;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerVerification customerverification;
	@OneToOne(cascade = CascadeType.ALL)
	private Profession profession;
    @OneToOne(cascade = CascadeType.ALL)
	private AccountDetails accountdetails;
	@OneToOne(cascade = CascadeType.ALL)
    private GuarantorDetail guarantorDetail;
    
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public Cibil getCibil() {
		return cibil;
	}
	public void setCibil(Cibil cibil) {
		this.cibil = cibil;
	}
	public CurrentLoanDetails getCurrentloandetails() {
		return currentloandetails;
	}
	public void setCurrentloandetails(CurrentLoanDetails currentloandetails) {
		this.currentloandetails = currentloandetails;
	}
	public CustomerVerification getCustomerverification() {
		return customerverification;
	}
	public void setCustomerverification(CustomerVerification customerverification) {
		this.customerverification = customerverification;
	}

	public Profession getProfession() {
		return profession;
	}
	public void setProfession(Profession profession) {
		this.profession = profession;
	}
	public AccountDetails getAccountdetails() {
		return accountdetails;
	}
	public void setAccountdetails(AccountDetails accountdetails) {
		this.accountdetails = accountdetails;
	}
	public GuarantorDetail getGuarantorDetail() {
		return guarantorDetail;
	}
	public void setGuarantorDetail(GuarantorDetail guarantorDetail) {
		this.guarantorDetail = guarantorDetail;
	}
	

}
