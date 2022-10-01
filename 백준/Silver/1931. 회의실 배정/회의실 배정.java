
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); // 11
		int count = 0;

		int info[][] = new int[num][2];

		for (int i = 0; i < num; i++) { // 2차원 배열에 값 넣기
			info[i][0] = scan.nextInt();
			info[i][1] = scan.nextInt();
		}

		Arrays.sort(info, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				} else {
					return o1[1] - o2[1];
				}
			}
		});
		// 2차원배열 두번쨰 배열 숫자 기준으로 정렬

		int end = 0;

		for (int j = 0; j < num; j++) {

			if (end <= info[j][0]) {
				end = info[j][1];
				count++;
			}
			// System.out.println(start + " " + end);

		}

		System.out.println(count);
	}

}
