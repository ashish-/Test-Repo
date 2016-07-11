

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

	
	

	public class FileMerge {

	  public static void main(String[] args) {

		  FileMerge obj = new FileMerge();
		  obj.run();

	  }

	  public void run() {

		String csvFile = "E:\\BigData\\File.csv";
		
		String location ="E:\\BigData\\";
		
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		
		Runtime rt = Runtime.getRuntime();
		
		

		try {

			Map<String, List<String>> maps = new HashMap<String, List<String>>();

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				
				String[] data = line.split(cvsSplitBy);
				
				List<String> list  ;
				
				list =maps.get(data[3]);
				
				if(list ==null){
					list = new ArrayList<String>();
				}
				list.add(data[1]);

				maps.put(data[3], list);
				//System.out.println(data[2]);

			}

			
			for (Map.Entry<String,List<String>> entry : maps.entrySet()) {

				//System.out.println(entry.getKey() + entry.getValue());
				
				String key = entry.getKey();
				
				List<String> values = entry.getValue();	
				
				String command = "copy ";
				
				
				
				for(int i=0; i< values.size() ; i++){
					
					command += location;
					command += values.get(i);
					if(i==values.size()-1)
								break;
					command += "+";
				}
				
				command +=" ";
				command += location;
				key =key + ".txt" ;
				command += key;
				
				System.out.println(command);
				
				
				             
				/*final List<String> commands = new ArrayList<String>();   
				commands.add("cmd.exe");
				commands.add("/C");
				commands.add("start");
				ProcessBuilder pb = new ProcessBuilder(command);
				pb.start();*/
				
			
				
				rt.exec("cmd /C start "+ command);
				
				/*Process process = rt.exec("cmd /C start "+ command);
				
				InputStream in  = process.getInputStream();
				int ch;
	            while((ch = in.read()) != -1)
	            {
	                System.out.print((char)ch);
	            }*/
				 
				
				


			}
			
			
			
			
			
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("Done");
	  }

	}

