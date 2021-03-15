package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14645 {
	public static void main(String[] args) throws IOException {
		// 그냥 System.out.println("비와이") 하면됨...
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			for(int i=0; i<N; i++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				while(st.hasMoreTokens()) {
					int A = Integer.parseInt(st2.nextToken());
					int B = Integer.parseInt(st2.nextToken());
					K = K + A - B;
				}
				
				if(i==2) {
					K = 0;
					System.out.println("비와이");
				}
			}
		}
	}
}
