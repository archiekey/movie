//Archana Venkatesh
// 4/21/15
// This program uses the merge sort to sort the title,year and studio 
//of a movie in ascending or descending order
public class TestMovie4 
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
		sortTitles(movie,0,movie.length-1);
		System.out.println("Sorted by Title - ascending: ");
		printResults(movie);
		System.out.println();
		System.out.println();
		sortYears(movie,0,movie.length-1);
		System.out.println("Sorted by Year - descending: ");
		printResults(movie);
		System.out.println();
		System.out.println();
		sortStudios(movie,0, movie.length-1);
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
	 public static void sortTitles(Movie2[] a, int low, int high)
	    {
	        if ( low == high )
	            return;

	        int mid = ( low + high ) / 2;

	        sortTitles( a, low, mid ); 
	        sortTitles( a, mid + 1, high); 

	        mergeTitles( a, low, mid, high);
	    }  
	 public static void mergeTitles( Movie2[] a, int low, int mid, int high )
	    {
	        Movie2[] temp = new Movie2[ high - low + 1 ];

	        int i = low, j = mid + 1, n = 0;

	        while ( i <= mid || j <= high )
	        {
	            if ( i > mid )
	            {
	                temp[ n ] = a[ j ];
	                j++;
	            }
	            else if ( j > high )
	            {
	                temp[ n ] = a[ i ];
	                i++;
	            }
	            else if ( a[ i ].getTitle().compareTo(a[ j ].getTitle()) < 0)
	            {
	                temp[ n ] = a[ i ];
	                i++;
	            }
	            else
	            {
	                temp[ n ] = a[ j ];
	                j++;
	            }
	            n++;
	        }

	        for ( int k = low ; k <= high ; k++ )
	            a[ k ] = temp[ k - low ];

	    } // end of merge    
	 public static void sortYears(Movie2[] a, int low, int high)
	    {
		 if ( low == high )
	            return;

	        int mid = ( low + high ) / 2;

	        sortYears( a, low, mid ); 
	        sortYears( a, mid + 1, high); 

	        mergeYears( a, low, mid, high);
	    }  
	 public static void mergeYears( Movie2[] a, int low, int mid, int high )
	    {
		    Movie2[] temp = new Movie2[ high - low + 1 ];

	        int i = low, j = mid + 1, n = 0;

	        while ( i <= mid || j <= high )
	        {
	            if ( i > mid )
	            {
	                temp[ n ] = a[ j ];
	                j++;
	            }
	            else if ( j > high )
	            {
	                temp[ n ] = a[ i ];
	                i++;
	            }
	            else if ( a[ i ].getYear() > a[ j ].getYear() )
	            {
	                temp[ n ] = a[ i ];
	                i++;
	            }
	            else
	            {
	                temp[ n ] = a[ j ];
	                j++;
	            }
	            n++;
	        }

	        for ( int k = low ; k <= high ; k++ )
	            a[ k ] = temp[ k - low ];


	    } // end of merge
	 
	 public static void sortStudios(Movie2[] a, int low, int high)
	    {
	        if ( low == high )
	            return;

	        int mid = ( low + high ) / 2;

	        sortStudios( a, low, mid ); 
	        sortStudios( a, mid + 1, high); 

	        mergeStudios( a, low, mid, high);
	    }  
	 public static void mergeStudios( Movie2[] a, int low, int mid, int high )
	    {
	        Movie2[] temp = new Movie2[ high - low + 1 ];

	        int i = low, j = mid + 1, n = 0;

	        while ( i <= mid || j <= high )
	        {
	            if ( i > mid )
	            {
	                temp[ n ] = a[ j ];
	                j++;
	            }
	            else if ( j > high )
	            {
	                temp[ n ] = a[ i ];
	                i++;
	            }
	            else if ( a[ i ].getStudio().compareTo(a[ j ].getStudio()) <0)
	            {
	                temp[ n ] = a[ i ];
	                i++;
	            }
	            else
	            {
	                temp[ n ] = a[ j ];
	                j++;
	            }
	            n++;
	        }

	        for ( int k = low ; k <= high ; k++ )
	            a[ k ] = temp[ k - low ];

	    } // end of merge    

}
