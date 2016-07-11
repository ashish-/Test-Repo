package com.kronos.day3.session1;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
public class DemoEx {

	public static void main(String[] args) throws Exception{
			
			//Decorator!
			BufferedReader bf= new BufferedReader(new FileReader("C:\\Users\\ashish.khandelwal\\Desktop\\in.txt"));
			
			String line = null;
			while((line=bf.readLine())!=null){
				
						
					
				String []tokens=line.split(" ");
				
				HashMap<String, Integer> hm= new HashMap<String,Integer>();
				
				for(String token:tokens){
					
					Integer count = hm.get(token);
					if(count==null)
							count=0;
					hm.put(token, count+1);
					
					
						
				} 
				Set set=hm.keySet();
				Iterator itr= set.iterator();
				while(itr.hasNext())
					System.out.println(itr.next());	
					
				
					
			}
				
				
		}
					
		
	}
	

