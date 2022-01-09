package com.company;

public class integer
{
	//
	// Constructors
	//
	public integer(int i)
	{
		this.m = i;
	}

	//
	// getter and setters
	//
	public int get() { return m; }

	//
	// Functions
	//
	public boolean is_even()
	{
		return (m % 2) == 0;
	}

	public boolean is_odd()
	{
		return !is_even();
	}

	public boolean is_prime()
	{
		for(int i = 2; i <= m / 2; i++)
		{
			if((m % i) == 0)
				return false;
		}

		return true;
	}

	public static boolean is_even(int k)
	{
		return (k % 2) == 0;
	}

	public static boolean is_odd(int k)
	{
		return !is_even(k);
	}

	public static boolean is_prime(int k)
	{
		for(int i = 2; i <= k / 2; i++)
		{
			if((k % i) == 0)
				return false;
		}

		return true;
	}

	public static boolean is_even(integer k)
	{
		return (k.get() % 2) == 0;
	}

	public static boolean is_odd(integer k)
	{
		return !is_even(k.get());
	}

	public static boolean is_prime(integer k)
	{
		for(int i = 2; i <= k.get() / 2; i++)
		{
			if((k.get() % i) == 0)
				return false;
		}

		return true;
	}

	public boolean equals(int k)
	{
		return m == k;
	}

	public boolean equals(integer k)
	{
		return k.get() == m;
	}

	public static int parse_int(char[] c)
	{
		int result = 0;
		for (int i = 0; i < c.length; i++)
		{
			result += c[i];

			if(i < c.length - 1)
				result *= 10;
		}

		return result;
	}

	public static int parse_int(String s)
	{
		int result = 0;
		for(int i = 0; i < s.length(); i++)
		{
			result += s.charAt(i);

			if(i < s.length() - 1)
				result *= 10;
		}

		return result;
	}

	//
	// Variables
	//
	private int m = -1;
}
