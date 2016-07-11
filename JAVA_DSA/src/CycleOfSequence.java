
public class CycleOfSequence {

	
	static int length(int n){
		int count=1;
		
		if(n==1)
			return count;
		
		while(n != 1){
			if( ( n & 1 ) != 0){
				n = 3*n + 1 ;
			}
			else{
				n= n/2 ;
			}
			count++;
		}
				
		return count;
	}
	
	
	public static int maxLength(int n1, int n2){
		 int i;
		 int max_length = 1;
		 int length;
		 
		 if( n1 == n2){
			 
			 return length( n1 );
		 }
		 
		 for( i = n1 ; i < n2 ; i++ ){
			 
			 length = length( i );
			 
			 if( length > max_length )
				 max_length = length ;
			 
		 }
		
		
		return max_length;
	}
	
	public static void main(String[] args) {
		
		System.out.println( maxLength(1,10));
	}
}
