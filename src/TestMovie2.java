//Archana Venkatesh
// 4/20/15
// This program uses the insertion sort to sort the title,year and studio 
//of a movie in ascending or descending order
public class TestMovie2 
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
		movie = sortTitles(movie,1);
		System.out.println("Sorted by Title - ascending: ");
		printResults(movie);
		System.out.println();
		System.out.println();
		movie = sortYears(movie,2);
		System.out.println("Sorted by Year - descending: ");
		printResults(movie);
		System.out.println();
		System.out.println();
		movie = sortStudios(movie,1);
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
	public static Movie2[] sortTitles(Movie2[] source, int choose)
	{
		Movie2[] dest = new Movie2[ source.length ];
		if ( choose == 1)
		{
		  for ( int i = 0 ; i < source.length ; i++ )
	       {
	           Movie2 next = source[ i ];
	           int insertindex = 0;
	           int k = i;
	           while ( k > 0 && insertindex == 0 )
	           {
	              if ( next.getTitle().compareTo(dest[k-1].getTitle()) > 0)
	              {
	                  insertindex = k;
	              }
	              else
	              {
	                 dest[ k ] = dest[ k - 1 ];
	              }
	               k--;
	           }

	           dest[ insertindex ] = next;
	       } 
		}
		if (choose == 2)
		{
			for ( int i = 0 ; i < source.length ; i++ )
		       {
		           Movie2 next = source[ i ];
		           int insertindex = 0;
		           int k = i;
		           while ( k > 0 && insertindex == 0 )
		           {
		              if ( next.getTitle().compareTo(dest[k-1].getTitle()) < 0)
		              {
		                  insertindex = k;
		              }
		              else
		              {
		                 dest[ k ] = dest[ k - 1 ];
		              }
		               k--;
		           }

		           dest[ insertindex ] = next;
		       } 
		}
		  return dest;
	}
	
	 public static Movie2[] sortYears(Movie2[] source, int choose)
	   {
	       Movie2[] dest = new Movie2[ source.length ];
	     if (choose == 1)
	     {
		       for ( int i = 0 ; i < source.length ; i++ )
		       {
		           Movie2 next = source[ i ];
		           int insertindex = 0;
		           int k = i;
		           while ( k > 0 && insertindex == 0 )
		           {
		              if ( next.getYear() > dest[k-1].getYear() )
		              {
		                  insertindex = k;
		              }
		              else
		              {
		                 dest[ k ] = dest[ k - 1 ];
		              }
		               k--;
		           }
	
		           dest[ insertindex ] = next;
		       } 
	     }
	     if (choose == 2)
	     {
	    	 for ( int i = 0 ; i < source.length ; i++ )
		       {
		           Movie2 next = source[ i ];
		           int insertindex = 0;
		           int k = i;
		           while ( k > 0 && insertindex == 0 )
		           {
		              if ( next.getYear() < dest[k-1].getYear() )
		              {
		                  insertindex = k;
		              }
		              else
		              {
		                 dest[ k ] = dest[ k - 1 ];
		              }
		               k--;
		           }
	
		           dest[ insertindex ] = next;
		       }  
	     }
	       return dest;
	  }
	 public static Movie2[] sortStudios(Movie2[] source, int choose)
	 {
		 Movie2[] dest = new Movie2[ source.length ];
			if ( choose == 1)
			{
			  for ( int i = 0 ; i < source.length ; i++ )
		       {
		           Movie2 next = source[ i ];
		           int insertindex = 0;
		           int k = i;
		           while ( k > 0 && insertindex == 0 )
		           {
		              if ( next.getStudio().compareTo(dest[k-1].getStudio()) > 0)
		              {
		                  insertindex = k;
		              }
		              else
		              {
		                 dest[ k ] = dest[ k - 1 ];
		              }
		               k--;
		           }

		           dest[ insertindex ] = next;
		       } 
			}
			if (choose == 2)
			{
				for ( int i = 0 ; i < source.length ; i++ )
			       {
			           Movie2 next = source[ i ];
			           int insertindex = 0;
			           int k = i;
			           while ( k > 0 && insertindex == 0 )
			           {
			              if ( next.getStudio().compareTo(dest[k-1].getStudio()) < 0)
			              {
			                  insertindex = k;
			              }
			              else
			              {
			                 dest[ k ] = dest[ k - 1 ];
			              }
			               k--;
			           }

			           dest[ insertindex ] = next;
			       } 
			}
			  return dest;
	 }

}
