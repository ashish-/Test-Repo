

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import sun.font.CreatedFontTracker;

public class FileUtil {
	
	
		public static void main(String[] args) throws IOException {
			
			createDirectory(7733);
			createDirectory(7734);
			createDirectory(7735);
			System.out.println("folder creation DONE");
			
			BufferedWriter bw = writeToCsvFile(7733, 1) ;
			
			createMarker(7744);
			System.out.println(" csv file creation DONE");
			
		}
		public static BufferedWriter writeToCsvFile(int date_skey, int time_skey) throws IOException {
					
			String path = "C:/Users/ashish.khandelwal/Downloads/folder";
			
			File fout = new File(path + "/" + date_skey + "/FCT_TCVRG_DATA" + "_D" + date_skey+ "_T"+time_skey+".csv");
			
			FileOutputStream fos = new FileOutputStream(fout);
		 
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		 	
			return bw;
		}
		
		public static void createMarker(int date_skey){
			
			String path = "C:/Users/ashish.khandelwal/Downloads/folder";
			
			File markerFile = new File(path + "/" + date_skey+".txt");
			
			try {
				markerFile.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		public static void createDirectory(int date_skey){
			
			String fileCreationPath = "C:/Users/ashish.khandelwal/Downloads/folder";
			
			Path path=Paths.get(fileCreationPath +"/"+date_skey);
			
			try {
				Files.createDirectory(path);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		

	
}
