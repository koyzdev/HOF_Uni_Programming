package com.company;

import java.time.LocalTime;

public class time
{
	//
	// Constructors
	//
	public time()
	{
		hour = LocalTime.now().getHour();
		minute = LocalTime.now().getMinute();
		second = LocalTime.now().getSecond();
	}

	public time(long ms)
	{
		hour = (int)((ms / (1000 * 60 * 60)) % 24);
		minute = (int)((ms / (1000 * 60)) % 60);
		second = (int)((ms / (1000)) % 60);
	}

	public time(int h, int m, int s)
	{
		hour = h;
		minute = m;
		second = s;
	}

	//
	// getters and setters
	//
	public int get_hour() { return hour; }
	public void set_hour(int hour) { this.hour = hour; }

	public int get_minute() { return minute; }
	public void set_minute(int minute) { this.minute = minute; }

	public int get_second() { return second; }
	public void set_second(int second) { this.second = second; }

	//
	// Functions
	//
	public void set_time(long elapsed_time)
	{
		hour = (int)((elapsed_time / (1000 * 60 * 60)) % 24);
		minute = (int)((elapsed_time / (1000 * 60)) % 60);
		second = (int)((elapsed_time / (1000)) % 60);
	}

	//
	// Variables
	//
	private int hour;
	private int minute;
	private int second;
}
