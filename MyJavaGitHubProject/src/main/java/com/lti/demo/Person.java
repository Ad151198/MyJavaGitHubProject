package com.lti.demo;

public class Person {
	
	private int perId;
	private String pName;
	private double psal;
	
	public Person() {
		super();
	}

	public Person(int perId, String pName, double psal) {
		super();
		this.perId = perId;
		this.pName = pName;
		this.psal = psal;
	}

	public int getPerId() {
		return perId;
	}

	public void setPerId(int perId) {
		this.perId = perId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getPsal() {
		return psal;
	}

	public void setPsal(double psal) {
		this.psal = psal;
	}

	@Override
	public String toString() {
		return "Person [perId=" + perId + ", pName=" + pName + ", psal=" + psal + "]";
	}

}
