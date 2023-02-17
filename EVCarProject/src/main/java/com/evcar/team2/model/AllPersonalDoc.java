package com.evcar.team2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AllPersonalDoc {
	@Id
	 private int documentID;
	 private int customerID;
	 private byte[] adharcard;
	 private byte[] pancard;
	 private byte[] addressproof;
	 
	public int getDocumentID() {
		return documentID;
	}
	public void setDocumentID(int documentID) {
		this.documentID = documentID;
	}
	public byte[] getAdharcard() {
		return adharcard;
	}
	public void setAdharcard(byte[] adharcard) {
		this.adharcard = adharcard;
	}
	public byte[] getPancard() {
		return pancard;
	}
	public void setPancard(byte[] pancard) {
		this.pancard = pancard;
	}
	public byte[] getAddressproof() {
		return addressproof;
	}
	public void setAddressproof(byte[] addressproof) {
		this.addressproof = addressproof;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	
	
}
