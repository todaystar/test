package com.tm.jukebox.fixtures;

import java.util.List;

import com.tm.jukebox.sut.*;

public class CreditsForPayment{
	private double payment;
	private double credits;
	
	public void execute() { // executed after each table row
		this.credits = new JukeBox().calculateCredits(payment);
	}
	public void setPayment(double payment) { // setter method
	this.payment = payment;
	}
	public double credits() { // returning function because of question mark in the test
		return this.credits;
	}
	
	public void reset() {
	}
	
	public void table(List<List<String>> table) {
	}
	
	public void beginTable() {
	}
	
	public void endTable() {
	}
	
}
