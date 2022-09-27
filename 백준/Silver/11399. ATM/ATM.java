import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //5-사람수
		int count = 0;
		int  minimum = 0;
		
		int time[] = new int[n];
		for(int i=0; i<n; i++) {
			time[i] = scan.nextInt();
		}
		
		Arrays.sort(time);
		
		for(int j=0; j<time.length; j++) {
			count += time[j];
			minimum += count;
		
		}
		System.out.println(minimum);	
	}

}
