package question_1_25main;

import java.util.Scanner;

import question_1_25sub.Hero;

//Main.java 

public class Main {
	public static void main(String[] args) {
		// Studentクラスのインスタンスを生成

		Scanner scanner = new Scanner(System.in);

		String username = scanner.nextLine();

		Hero student = new Hero();
		student.setName(username);
		System.out.println("こんにちは 「 " + student.getName() + "  」 さん");

		student.showStatus(); // Studentクラス独自のメソッド

		System.out.println(); // 改行
		student.introduce();

	}
}
