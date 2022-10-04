
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt(); // 5
		int count = scan.nextInt();// 3

		int sum[] = new int[num+1];//누적합 계산 배열
		sum[0] = 0;
		
		for (int i = 1; i <= num; i++) { 
			sum[i] = sum[i-1]+scan.nextInt();
		}

		for(int j=0; j<count; j++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(sum[b]-sum[a-1]);
		}

	}

}
