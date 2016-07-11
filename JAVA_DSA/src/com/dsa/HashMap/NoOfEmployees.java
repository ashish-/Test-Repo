package com.dsa.HashMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class NoOfEmployees {

	static Map<String,Integer> result = new HashMap<String,Integer>();
	
	public static void main(String[] args) {	
		 Map< String , String> dataSet = new HashMap<String,String>();
		 dataSet.put("A", "C");
	     dataSet.put("B", "C");
	     dataSet.put("C", "F");
	     dataSet.put("D", "E");
	     dataSet.put("E", "F");
	     dataSet.put("F", "F");
	     
	     populateResult(dataSet);
	     
	     System.out.println(result);
	     
		 
	}
	
	public static void populateResult(Map<String,String > dataSet){
	
		Map<String, List<String>> mgrEmpMap = new HashMap<String, List<String>>();
		
		for(Map.Entry<String, String> entry : dataSet.entrySet()){
			
			String emp = entry.getKey();
			String mgr = entry.getValue();
			if(!emp.equals(mgr)){
				List<String> empList = mgrEmpMap.get(mgr);
				if(empList==null)
					empList = new LinkedList<String>();
				empList.add(emp);
				
				mgrEmpMap.put(mgr, empList);
			}
			
		}
		for(String mgr: dataSet.keySet())
			populateResultUtil(mgr, mgrEmpMap);
	}
	public static int populateResultUtil(String mgr, Map<String,List<String>> mgrEmpMap){
		
		int count=0;
		
		if(!mgrEmpMap.containsKey(mgr)){
			
			result.put(mgr, 0);
			return 0;
		}
		else if(result.containsKey(mgr)){
			count = result.get(mgr);
			
		}
		
		else{
			List<String> empList = mgrEmpMap.get(mgr);
			count= empList.size();
			for(String emp : empList)
				count =count+ populateResultUtil(emp, mgrEmpMap);
			
			result.put(mgr, count);
			
		}
		return count;
		
		
		
	}
}
		