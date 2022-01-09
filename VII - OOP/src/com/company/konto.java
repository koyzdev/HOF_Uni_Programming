package com.company;

import java.time.LocalDate;

public class konto
{
	//
	// Constructors
	//
	public konto()
	{
		date_created = LocalDate.now();
	}

	public konto(int id, double balance)
	{
		date_created = LocalDate.now();
		this.id = id;
		this.balance = balance;
	}

	//
	// get and set
	//
	public int get_id() { return id; }
	public void set_id(int id) { this.id = id; }

	public double get_balance() { return balance; }
	public void set_balance(double balance) { this.balance = balance; }

	public double get_annual_interest_rate() { return annual_interest_rate; }
	public void set_annual_interest_rate(double annual_interest_rate) { this.annual_interest_rate = annual_interest_rate; }

	public LocalDate get_date_created() { return date_created; }

	public double get_monthly_interest_rate()
	{
		return (balance * annual_interest_rate) / 12;
	}

	//
	// Functions
	//
	public void withdraw(double money)
	{
		if((balance - money) >= 0)
			balance -= money;
	}

	public void deposit(double money)
	{
		balance += money;
	}

	//
	// Variables
	//
	private int id = 0;
	private double balance = 0;
	private double annual_interest_rate = 0;
	private LocalDate date_created = LocalDate.MIN;
}
