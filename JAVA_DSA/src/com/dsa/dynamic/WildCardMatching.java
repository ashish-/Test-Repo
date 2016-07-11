package com.dsa.dynamic;

public class WildCardMatching {

		Boolean isMatch(String s, String p){
			
			char str[] = s.toCharArray();
			char pattern[] = p.toCharArray();
			
			int i,j=0;
			boolean isfirst = true;
			
			for(i=0;i<pattern.length;i++){
				
				if(pattern[i]=='*'){
					if(isfirst){
						pattern[j++] = pattern[i];
						isfirst = false;
					}
					
				}
				else{
					pattern[j++] = pattern[i];
					isfirst = true;
				}
				
			}
			
			boolean T[][] = new boolean[str.length + 1][pattern.length+1];
			T[0][0] = true;
			if(pattern[0] == '*')
				T[0][1] =true; 
			
			for(i=1 ; i<T.length ; i++){
				for(j=1 ; j<T[0].length ; j++){
					
					if(pattern[j-1] == str[i-1] || pattern[j-1] == '?')
						T[i][j] = T[i-1][j-1];
					else if(pattern[j-1] == '*' )
						T[i][j] = T[i-1][j] || T[i][j-1];
					
					
				}
				
			}
			
			
			
			return T[T.length - 1][T[0].length -1];
		}
	
		
	
		public static void main(String[] args) {
			WildCardMatching wcm = new WildCardMatching();
			
			System.out.println(wcm.isMatch("xbylmz", "x?y*z"));
		}
}
