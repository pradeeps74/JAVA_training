package com.training.second;

public class Dvd extends Publication{
int playingTime;
public Dvd()
{
	playingTime=5;
}
public Dvd(int playingTime)
{
	this.playingTime=playingTime;
}
public Dvd(int playingTime,String title,float price)
{super(title,price);
	this.playingTime=playingTime;
}
public String user_input()
{
	return "playingTime is :"+playingTime;
}
public String display() 
{
	System.out.println(super.display());
	return "Playing time of DvD is"+playingTime;
}
public String display(int playingTime) 
{
	System.out.println(super.display());
	this.playingTime=playingTime;
	return "Playing time of DvD is"+playingTime;
}

}
