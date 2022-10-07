
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	       
		StringTokenizer st;
		
		int num1 = Integer.parseInt(br.readLine());
		int arr[] = new int[num1]; //이분탐색배열
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr); //이분탐색배열 정렬
		
		int num2 = Integer.parseInt(br.readLine());//8
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		for(int j=0; j<num2; j++) {
			int cardNum = Integer.parseInt(st.nextToken());
			sb.append(binarySearch(arr,num1,cardNum) + " ");
		}
		System.out.println(sb);	
	}
	public static int binarySearch(int[] arr, int n, int search) {
		int first = 0;
		int last = n-1;
		int mid = 0;
		
		
		while(first<=last) {
			mid = (first+last)/2; //중간 인덱스
			
			if(arr[mid]==search) {
				return 1;
			}
			if(arr[mid]<search) {
				first = mid+1;
			}else {
				last = mid-1;
			}
		}
		
		return 0;
		
	}
}
