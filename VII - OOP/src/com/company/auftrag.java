package com.company;

public class auftrag
{
	//
	// Constructors
	//
	public auftrag(artikel art, int amount)
	{
		this.art = art;
		this.amount = amount;
	}

	//
	// Functions
	//
	public static double get_summed_amount(auftrag[] a)
	{
		double res = 0.0;
		for (var v : a)
			res += v.art.get_price() * v.amount;

		return res;
	}

	//
	// Variables
	//
	private artikel art;
	private int amount = 0;
}
