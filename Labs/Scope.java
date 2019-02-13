public class Scope {
	public static void main( String args[] ) {
		int x = 12;
		for( int q = 0; q < 10; q++ ){
			System.out.println( q );
		}
		System.out.println( x ); // AT THIS POINT - Only x available
		System.out.println( q );// q is out of scope and you get a compilation error
	}
}