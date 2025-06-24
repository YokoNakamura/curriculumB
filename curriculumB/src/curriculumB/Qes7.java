package curriculumB;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("生徒の人数を入力してください（2以上）:" );
	
	
	
		int a = scanner.nextInt();
	
		for (int i = 0; i < a; i++) {
	
			System.out.println( i +"人目の『英語』の点数を入力してください :");
	
	
			System.out.println( i +"人目の『数学』の点数を入力してください :");
	
			System.out.println( i +"人目の『理科』の点数を入力してください :");
	
			System.out.println( i +"人目の『社会』の点数を入力してください :");
	
		}
	}

}
