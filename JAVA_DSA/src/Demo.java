import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Demo {

	public static void main(String[] args) throws IOException{
		
//		String str ="Kronos;Home;controlflows" ;
//		
//		String out = "";
//		
//		String  split[] = str.split(";");
//		
//		
//		for(int i=1;i<split.length;i++)
//				out = out + split[i] + "\n";
//		System.out.println(out);
		
		/*File f = new File("C:\\Users\\ashish.khandelwal\\Desktop\\random\\random.txt");
		f.getParentFile().mkdirs();
		f.createNewFile();
		
//		String Filename = "Ashish";
//		
//		Filename = Filename.toUpperCase();
//		System.out.println(Filename);
		
		
		FileWriter fw = new FileWriter( f.getAbsoluteFile() );
        BufferedWriter bw = new BufferedWriter( fw );

        bw.write( "Ashish khandelwal" );
        bw.close();*/
		/*
		int arr[] = new int[5];
		
		Scanner reader = new Scanner(System.in);
		
		for(int i=0 ; i<arr.length ; i++)
			arr[i] = reader.nextInt();*/
		
		
		
		
		/*long d1 = 2333333;
		long d2 = 3388888;
		
		
		long d3 = d1+d2;
		
		double d4 = d3/1000000.0;
		
		System.out.println(String.format("%.6f", d4));
		
		//System.out.println(getTimesTamp());
		
		d4 = d4*100000;
		d4 = Math.round(d4);
		d4 = d4/100000;
		
		System.out.println(d4);
		*/
		//String jobcommand = "SCHTASKS /ru \"SYSTEM\" /CREATE /SC DAILY /TN \"%s\" /TR \"%s\" /ST \"%s\" /f /SD \"%s\" /ED \"%s\"";
		
		//String command  = String.format( jobcommand,"WFAN_ST_AM_CORE_DET","C:\\Users\\ashish.khandelwal\\Desktop\\1.txt","19:19","06/24/2016","06/26/2116");
		
		//String command  = String.format( jobcommand,"WFAN_ST_AM_CORE_DET","C:\\Users\\superuser\\Desktop","19:19","06/24/2016","06/26/2116");
		
		//System.out.println(command);
		
		
		/*Process process =null; 
		
		try {
			process = Runtime.getRuntime().exec(command );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedReader stdInput = new BufferedReader(new 
			     InputStreamReader(process.getInputStream()));

			BufferedReader stdError = new BufferedReader(new 
			     InputStreamReader(process.getErrorStream()));

			// read the output from the command
			System.out.println("Here is the standard output of the command:\n");
			String s = null;
			while ((s = stdInput.readLine()) != null) {
			    System.out.println(s);
			}

			// read any errors from the attempted command
			System.out.println("Here is the standard error of the command (if any):\n");
			while ((s = stdError.readLine()) != null) {
			    System.out.println(s);
			}*/
			
			
			
			/* String scheduleDate = "09-06-2015";
			 SimpleDateFormat sdf = new SimpleDateFormat( "dd-MM-yyyy" );// yyyy-MM-dd'T'HH:mm:ss
		     

		     Date data = null;
			try {
				data = sdf.parse( scheduleDate );
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		     DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT,  Locale.getDefault());
		     SimpleDateFormat sdf2 = (SimpleDateFormat) df;
		    
		     System.out.println(sdf2.toPattern());
		     String pattern = sdf2.toPattern().replaceAll("y+","yyyy");
		     pattern = pattern.replaceAll("d+","dd");
		     pattern = pattern.replaceAll("M+","MM");
	         sdf2.applyPattern(pattern);
	         System.out.println(sdf2.toPattern());
		     String formattedDate = sdf2.format(data);
		     System.out.println(formattedDate);
		     
		     Locale currentLocale = Locale.getDefault();		     
		     System.out.println(currentLocale.getDisplayLanguage());
		     System.out.println(currentLocale.getDisplayCountry());
		     
		     System.out.println( TimeZone.getDefault().getDisplayName() ); */
		
		
		long l = 10520770;
	}
	
	/*public static Date getTimesTamp(){
		
		Calendar instance = Calendar.getInstance();	
		Date date =instance.getTime();
	
		return date;
	}*/
	
	
	
	
}
