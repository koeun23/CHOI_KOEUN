import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //1 -> 666, 2 ->  1666
		
		String compare = "666";
		
		int num = 666;
		int count = 1;
		if(n==1) {
			System.out.println(num);
		}
		else {
			while(count!=n) {
				num++;
				
				String numtost = num+""; //num을 문자로 변환
				
				if(numtost.contains(compare)) {
					count++;
				}
				
				
			}
			System.out.println(num);
		}
		
	}
}
