import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdln = new Scanner (System.in);
		int n = stdln.nextInt();
		int i,j;
		for(i=1; i<=n; i++) {
			for(j=1; j<=i; j++){
				System.out.printf("*");
		}
			System.out.println();
	}}
}
