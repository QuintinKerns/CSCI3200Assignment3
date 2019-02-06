package Number3and4;

import java.util.ArrayList;
import java.util.List;

public class Number3and4 {
	public static List<Integer> makeList( int N ) // 5N + 4
	{
		ArrayList<Integer> lst = new ArrayList<>(); // 2: 1 for new and 1 for assignment
		for( int i = 0; i < N; i++ ) { // 4N + 1: 5N from the conditional, i++ [i = i + 1], add(), and trimToSize().
									   // The +1 from assignment of 0 to i
			lst.add( i ); // 1
			lst.trimToSize( ); // 1
			}
		return lst; // 1
	}

	public static void removeFirstHalf( List<?> lst ) // ArrayList: ( 6N + 1 ) + 3 = 6N + 4
													  // LinkedList: ( 4N + 1 ) + 3 = 4N + 4
	{
		int theSize = lst.size( ) / 2; // 3: 1 For Assignment, 1 for size(), and one for division
		
		
		for( int i = 0; i < theSize; i++ )	// ArrayList: ( 3N + 1 ) + ( 3N ) = 6N + 1
			  								// LinkedList: ( 3N + 1 ) + N = 4N + 1
			/*	for(): 3N + 1
			   	3N: 1N From i < the size, and i++ is really i = i + 1,
					so we need 1N for i + 1 and 1N for i = 
				+ 1 From i = 0
			*/ 
			lst.remove( 0 ); 
			/*
				ArrayList: 3N: N for removing the item, and 2N for shifting the data one to the left.
				Because N = size()/2, we need 2N for moving the entire list over 1
				LinkedList: N for removing the first item in the linked list. Nothing else needs to be done after this.
			*/
	}
}
