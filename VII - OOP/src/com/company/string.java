package com.company;

import java.util.ArrayList;

public class string
{
	//
	// Constructors
	//
	public string(char[] chars)
	{
		alloc = new ArrayList<>();

		for (var a : chars)
			alloc.add(a);
	}

	//
	// Functions
	//
	public char char_at(int i)
	{
		return alloc.get(i);
	}

	public int length()
	{
		return alloc.size();
	}

	public string sub_string(int begin, int end)
	{
		char[] tmp = new char[end - begin];
		for(int i = begin, j = 0; i < end; i++, j++)
			tmp[j] = alloc.get(i);

		return new string(tmp);
	}

	public string to_lower_case()
	{
		char[] tmp = new char[alloc.size()];
		for(int i = 0, j = 0; i < alloc.size(); i++, j++)
			tmp[j] = (char)(alloc.get(i) | 0x20);

		return new string(tmp);
	}

	public boolean equals(string s)
	{
		if(s.alloc.size() != alloc.size())
			return false;

		for(var i = 0; i < s.alloc.size(); i++)
		{
			if(s.alloc.get(i) != alloc.get(i))
				return false;
		}

		return true;
	}

	public static string value_of(int i)
	{
		return new string(Integer.toString(i).toCharArray());
	}

	//
	// Variables
	//
	private ArrayList<Character> alloc;
}
