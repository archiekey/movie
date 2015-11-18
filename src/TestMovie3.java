//Archana Venkatesh
// 4/20/15
// This program uses the selection sort to sort the title,year and studio 
//of a movie in ascending or descending order
public class TestMovie3 
{
	public static void main (String [] args)
	{
		Movie2[] movie = new Movie2[10];
		movie[0] = new Movie2("The Muppets take Manhattan", 2001, "Columbia Tristar");
		movie[1] = new Movie2("Mulan Special Edition", 2004, "Disney");
		movie[2] = new Movie2("Shrek 2", 2004, "Dreamworks");
		movie[3] = new Movie2("The Incredibles", 2004, "Pixar");
		movie[4] = new Movie2("Nanny Mcphee", 2006, "Universal");
		movie[5] = new Movie2("The Curse of the Were-Rabbit", 2006, "Aardman");
		movie[6] = new Movie2("Ice Age", 2002, "20th Century Fox");
		movie[7] = new Movie2("Lilo and Stitch", 2002, "Disney");
		movie[8] = new Movie2("Robots", 2005, "20th Century Fox");
		movie[9] = new Movie2("Monsters Inc.", 2001, "Pixar");
		
		System.out.println("Before Sorting: ");
		printResults(movie);
		System.out.println();
		sortTitles(movie,2);
		System.out.println("Sorted by Title - descending: ");
		printResults(movie);
		System.out.println();
		System.out.println();
		sortYears(movie,2);
		System.out.println("Sorted by Year - descending: ");
		printResults(movie);
		System.out.println();
		System.out.println();
		sortStudios(movie,1);
		System.out.println("Sorted by Studio - ascending: ");
		printResults(movie);
		System.out.println();
		System.out.println();
	}
	public static void printResults(Movie2[] n)
	{
		for ( int i = 0; i < n.length; i ++)
		{
			System.out.println(n[i]);
		}
	}
	public static void sortTitles(Movie2[] source, int choose)
	{
		
		  int i;
	      int k;
	      int posmax;
	      Movie2 temp;
	      if (choose == 1)
	      {
		      for ( i = source.length - 1 ; i >= 0 ; i-- )
		      {
		          // find largest element in the i elements
		          posmax = 0;
		          for ( k = 0 ; k <= i ; k++ )
		          {
		              if ( source[ k ].getTitle().compareTo(source[ posmax ].getTitle()) > 0 ) // next.getTitle().compareTo(dest[k-1].getTitle()) > 0)
	
		                 posmax = k;
		          }
		          // swap the largest with the position i
		          // now the item is in its proper location 
		          temp = source[ i ];
		          source[ i ] = source[posmax ];
		          source[ posmax ] = temp;
		     }
	     }
	     if (choose == 2)
	     {
	    	 for ( i = source.length - 1 ; i >= 0 ; i-- )
		      {
		          // find largest element in the i elements
		          posmax = 0;
		          for ( k = 0 ; k <= i ; k++ )
		          {
		              if ( source[ k ].getTitle().compareTo(source[ posmax ].getTitle()) < 0 ) // next.getTitle().compareTo(dest[k-1].getTitle()) > 0)
	
		                 posmax = k;
		          }
		          // swap the largest with the position i
		          // now the item is in its proper location 
		          temp = source[ i ];
		          source[ i ] = source[posmax ];
		          source[ posmax ] = temp;
		     }
	     }
	}
	public static void sortYears(Movie2[] source, int choose)
	{
		int i;
	      int k;
	      int posmax;
	      Movie2 temp;
	      if (choose == 1)
	      {
		      for ( i = source.length - 1 ; i >= 0 ; i-- )
		      {
		          // find largest element in the i elements
		          posmax = 0;
		          for ( k = 0 ; k <= i ; k++ )
		          {
		              if ( source[ k ].getYear() > source[ posmax ].getYear() )
		                 posmax = k;
		          }
		          // swap the largest with the position i
		          // now the item is in its proper location 
		          temp = source[ i ];
		          source[ i ] = source[posmax ];
		          source[ posmax ] = temp;
		     }
	     }
	     if ( choose == 2)
	     {
	    	 for ( i = source.length - 1 ; i >= 0 ; i-- )
		      {
		          // find largest element in the i elements
		          posmax = 0;
		          for ( k = 0 ; k <= i ; k++ )
		          {
		              if ( source[ k ].getYear() < source[ posmax ].getYear() )
		                 posmax = k;
		          }
		          // swap the largest with the position i
		          // now the item is in its proper location 
		          temp = source[ i ];
		          source[ i ] = source[posmax ];
		          source[ posmax ] = temp;
		     }
	     }
	}
	public static void sortStudios(Movie2[] source, int choose)
	{
		
		  int i;
	      int k;
	      int posmax;
	      Movie2 temp;
	      if (choose == 1)
	      {
		      for ( i = source.length - 1 ; i >= 0 ; i-- )
		      {
		          // find largest element in the i elements
		          posmax = 0;
		          for ( k = 0 ; k <= i ; k++ )
		          {
		              if ( source[ k ].getStudio().compareTo(source[ posmax ].getStudio()) > 0 ) // next.getTitle().compareTo(dest[k-1].getTitle()) > 0)
	
		                 posmax = k;
		          }
		          // swap the largest with the position i
		          // now the item is in its proper location 
		          temp = source[ i ];
		          source[ i ] = source[posmax ];
		          source[ posmax ] = temp;
		     }
	     }
	     if (choose == 2)
	     {
	    	 for ( i = source.length - 1 ; i >= 0 ; i-- )
		      {
		          // find largest element in the i elements
		          posmax = 0;
		          for ( k = 0 ; k <= i ; k++ )
		          {
		              if ( source[ k ].getStudio().compareTo(source[ posmax ].getStudio()) < 0 ) // next.getTitle().compareTo(dest[k-1].getTitle()) > 0)
	
		                 posmax = k;
		          }
		          // swap the largest with the position i
		          // now the item is in its proper location 
		          temp = source[ i ];
		          source[ i ] = source[posmax ];
		          source[ posmax ] = temp;
		     }
	     }
	}
	
}
