import java.util.Scanner;

public class WBS {
	
	static int [] sum = new int[6];
	static String [] comb = new String[6];
	
	
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in); 
		
		int i;
		int [] a = new int [9];
		System.out.println("enter input : ");
		
		for(i= 0 ; i< 9 ; i++){
			a[i] = reader.nextInt();
		}
		
		reader.close();
		
		comb[0] = "BSW";
		sum[0] = a[0] +a[2] +a[3] +a[4]+a[7]+a[8];
		
		comb[1] = "BWS";
		sum[1] = a[0] +a[2] +a[4] +a[5]+a[6]+a[7];
		
		comb[2] = "SBW";
		sum[2] = a[0] +a[1] +a[3] +a[5]+a[7]+a[8];

		comb[3] = "SWB";
		sum[3] = a[0] +a[1] +a[4] +a[5]+a[6]+a[8];
		
		comb[4] = "WBS";
		sum[4] = a[1] +a[2] +a[3] +a[5]+a[6]+a[7];
		
		comb[5] = "WSB";
		sum[5] = a[1] +a[2] +a[3] +a[4]+a[6]+a[8];
			
		
		int min= Integer.MAX_VALUE ;
		i=0;
		int index = 0;
		
		for(i = 0 ;i < 6; i++){
			if(sum[i] < min ){
				min= sum[i];
				index= i;
			}
		}
		System.out.println(comb[index]+ " "+min);
		
			
		/*Input: 15 8 31 30 12 8 10 15 20
		Expected Output: SWB 73
		Input: 10 20 30 20 40 60 30 60 90
		Expected Output: WBS 220
		Input: 10 10 10 0 0 0 0 0 0
		Expected Output: BSW 20 //comment: not BWS 20!
*/
		
	}
}
