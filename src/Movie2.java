// Archana Venkatesh
//4/20/15
// This program gets the title year and studio of a movie
// test
// this line is to test the synce of github
public class Movie2 
{
	private String title;
	private int year;
	private String studio;
	
	public Movie2 (String t, int y, String s)
	{
		title = t;
		year = y;
		studio = s;
	}
	public String getTitle()
	{
		return title;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public String getStudio()
	{
		return studio;
	}
	
	public String toString()
	{
		return  title + ", " + year + ", " + studio;
	}
}
