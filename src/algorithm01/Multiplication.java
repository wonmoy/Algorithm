package algorithm01;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// int a = sc.nextInt();
		// int b = sc.nextInt();
		
		// (int) Math.random() * (최댓값-최소값+1) + 최소값 101 ~ 999
		int a = (int)(Math.random()*899) + 101;
		int b = (int)(Math.random()*899) + 101;
		
		System.out.println(a);
		System.out.println(b);
		
		// ex) 123 * 1의 자리 숫자
		System.out.println(a*(b%10));
		
		// ex) 123 * 10의자리 숫자
		System.out.println(a*((b%100)/10));
		
		// ex) 123 * 100의자리 숫자
		System.out.println(a*(b/100));
		
		// 세자리수 8 세자리수
		System.out.println(a*b);
		
		System.out.println(b%10);
		System.out.println((b%100)/10);
		System.out.println((b/100));
		
	}

}
