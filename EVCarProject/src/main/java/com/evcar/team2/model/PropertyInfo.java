package com.evcar.team2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PropertyInfo {

	@Id
	private int propertyid;
	private String propertytype;
	private String propertyarea;
	private double propertyprice;
	private String propertyaddress;
	public int getPropertyid() {
		return propertyid;
	}
	public void setPropertyid(int propertyid) {
		this.propertyid = propertyid;
	}
	public String getPropertytype() {
		return propertytype;
	}
	public void setPropertytype(String propertytype) {
		this.propertytype = propertytype;
	}
	public String getPropertyarea() {
		return propertyarea;
	}
	public void setPropertyarea(String propertyarea) {
		this.propertyarea = propertyarea;
	}
	public double getPropertyprice() {
		return propertyprice;
	}
	public void setPropertyprice(double propertyprice) {
		this.propertyprice = propertyprice;
	}
	public String getPropertyaddress() {
		return propertyaddress;
	}
	public void setPropertyaddress(String propertyaddress) {
		this.propertyaddress = propertyaddress;
	}
	
}
	
