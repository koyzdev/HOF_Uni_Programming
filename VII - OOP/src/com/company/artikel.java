package com.company;

public class artikel
{
	//
	// Constructors
	//
	public artikel()
	{

	}

	public artikel(int id, double price)
	{
		this.id = id;
		this.price = price;
	}

	//
	// getters and setters
	//
	public int get_id() { return id; }
	public void set_id(int id) { this.id = id; }

	public double get_price() { return price; }
	public void set_price(double price) { this.price = price; }

	//
	// Variables
	//
	private int id = 0;
	private double price = 0.0;
}
