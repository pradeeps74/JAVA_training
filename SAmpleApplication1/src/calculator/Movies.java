package calculator;

public class Movies {
	String id;
	String title;
	String duration;
	String hero;
	String villan;
	static int count=0;
	public Movies()
	{
		id="Dark night01";
		title="Dark night";
		duration="02:30:00 minutes";
		hero="Christian Bale";
		villan="heath Ledger(The Joker)";
		count++;
	}
	public Movies(String Id,String Title,String Duration,String Hero,String Villan)
	{
		this.id=Id;
		this.title=Title;
		this.duration=Duration;
		this.hero=Hero;
		this.villan=Villan;
		count++;
		
	}
	
	
	public void accept(String id,String title,String duration,String hero,String villain)
	{
		System.out.println("This movie id is"+" "+id);
		System.out.println("This movie name is"+" "+title);
		System.out.println("This movie Duration is "+" "+duration);
		System.out.println("This movie hero name is"+" "+hero);
		System.out.println("This movie villain name is "+" "+villain);
		count++;
	}
	public void display()
	{
		System.out.println("This movie id is"+" "+id);
		System.out.println("This movie name is"+" "+title);
		System.out.println("This movie Duration is "+" "+duration);
		System.out.println("This movie hero name is"+" "+hero);
		System.out.println("This movie villain name is "+" "+villan);
	
		}
	public void total()
	{
		System.out.println("Total no of movies count"+" "+ count);
	}
}


