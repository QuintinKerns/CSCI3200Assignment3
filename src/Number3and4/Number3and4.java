package Number3and4;

import java.util.ArrayList;
import java.util.List;

public class Number3and4 {
	public static List<Integer> makeList( int N ) // 5N + 4
	{
		ArrayList<Integer> lst = new ArrayList<Integer>( ); // 2: 1 for new and 1 for assignment
		for( int i = 0; i < N; i++ ) { // 4N + 1: 5N from the conditional, i++ [i = i + 1], add(), and trimToSize().
									   // The +1 from assignment of 0 to i
			lst.add( i ); // 1
			lst.trimToSize( ); // 1
			}
		return lst; // 1
	}

	public static void removeFirstHalf( List<?> lst ) // 4N + 4
	{
		int theSize = lst.size( ) / 2; // 3. 1 For Assignment, 1 for size(), and one for division
		for( int i = 0; i < theSize; i++ ) // 3N + 1: 4N from conditional, i++ [i = i + 1], and remove().
										   //+1 from assignment of 0 to i
			lst.remove( 0 ); // 1
	}
}
