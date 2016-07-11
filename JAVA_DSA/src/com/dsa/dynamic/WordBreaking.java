package com.dsa.dynamic;

import java.util.HashSet;
import java.util.Set;

public class WordBreaking {

	/**
     * Recursive and slow version of breaking word problem.
     * If no words can be formed it returns null
     */
    public String breakWord(char[] str,int low,Set<String> dictionary){
        StringBuffer buff = new StringBuffer();
        for(int i= low; i < str.length; i++){
            buff.append(str[i]);
            if(dictionary.contains(buff.toString())){
                String result = breakWord(str, i+1, dictionary);
                if(result != null){
                    return buff.toString() + " " + result;
                }
            }
        }
        if(dictionary.contains(buff.toString())){
            return buff.toString();
        }
        return null;
    }
	
	
	
	
	
	 public String breakWordDP(String word, Set<String> dict){
	        int T[][] = new int[word.length()][word.length()];
	        
	        for(int i=0; i < T.length; i++){
	            for(int j=0; j < T[i].length ; j++){
	                T[i][j] = -1; //-1 indicates string between i to j cannot be split
	            }
	        }
	        
	        //fill up the matrix in bottom up manner
	        for(int l = 1; l <= word.length(); l++){
	            for(int i=0; i < word.length() -l + 1 ; i++){
	                int j = i + l-1;
	                String str = word.substring(i,j+1);
	                //if string between i to j is in dictionary T[i][j] is true
	                if(dict.contains(str)){
	                    T[i][j] = i;
	                    continue;
	                }
	                //find a k between i+1 to j such that T[i][k-1] && T[k][j] are both true 
	                for(int k=i+1; k <= j; k++){
	                    if(T[i][k-1] != -1 && T[k][j] != -1){
	                        T[i][j] = k;
	                        break;
	                    }
	                }
	            }
	        }
	        if(T[0][word.length()-1] == -1){
	            return null;
	        }
	        
	        //create space separate word from string is possible
	        StringBuffer buffer = new StringBuffer();
	        int i = 0; int j = word.length() -1;
	        while(i < j){
	            int k = T[i][j];
	            if(i == k){
	                buffer.append(word.substring(i, j+1));
	                break;
	            }
	            buffer.append(word.substring(i,k) + " ");
	            i = k;
	        }
	        
	        return buffer.toString();
	    }
	 
	 public static void main(String args[]){
	        Set<String> dictionary = new HashSet<String>();
	        dictionary.add("I");
	        dictionary.add("like");
	        dictionary.add("had");
	        dictionary.add("play");
	        dictionary.add("to");
	        String str = "Ihadliketoplay";
	        WordBreaking wb = new WordBreaking();
	        String result1 = wb.breakWordDP(str, dictionary);
	        
	        System.out.print(result1);
	    }
	
 
}
