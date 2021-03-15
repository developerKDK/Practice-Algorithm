package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17256 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] cakeA = new int[3];
		int[] cakeC = new int[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		br.close();
		
		int i=0;
		while(st.hasMoreTokens()) {
			cakeA[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		
		i = 2;
		while(st2.hasMoreTokens()) {
			cakeC[i] = Integer.parseInt(st2.nextToken());
			i--;
		}
		
		String result = String.format("%d %d %d", cakeC[2] - cakeA[2], cakeC[1] / cakeA[1], cakeC[0] - cakeA[0]);
		System.out.println(result);
	}
}
