package algorithm01;

public class Gugudan {
	
	public static void main(String[] args) {
		
		for(int i = 2; i <= 9; i++) {
			System.out.println(i+"단");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
