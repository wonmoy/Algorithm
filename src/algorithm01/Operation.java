package algorithm01;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 사칙연산
		System.out.println("첫번째 숫자를 입력하세요");
        int a = sc.nextInt();
        while(true) {
	        if(a<= 0 || a >= 10000){
	        	System.out.println("다시 입력하세요");
	            a = sc.nextInt();
	        } else {
	        	break;
	        }
	    }
        System.out.println("두번째 숫자를 입력하세요");
        int b = sc.nextInt();
        while(true) {
	        System.out.println("다시 입력하세요");
	        if(b <= 0 || b >= 10000){
	            b = sc.nextInt();
	        } else {
	        	break;
	        }
        }
        
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
		
	}

}
