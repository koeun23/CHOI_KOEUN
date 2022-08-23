
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int arr[] = new int[num];
		
		for(int i=0; i<num; i++) { //배열에 값 저장
			arr[i] = scan.nextInt();
		}
		
		//배열 정렬 시작
		Arrays.sort(arr);
		
		for(int j=0; j<arr.length; j++) { //정렬된 배열 출력
			System.out.println(arr[j]);
		}
	}

}
