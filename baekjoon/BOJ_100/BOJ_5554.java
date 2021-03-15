package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5554 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int s1 = Integer.parseInt(br.readLine());
		int s2 = Integer.parseInt(br.readLine());
		int s3 = Integer.parseInt(br.readLine());
		int s4 = Integer.parseInt(br.readLine());
		br.close();
		
		int sum = s1 + s2 + s3 + s4;
		
		int hour = sum / 60;
		int minute = sum % 60;
		
		System.out.println(hour);
		System.out.println(minute);
	}
}
