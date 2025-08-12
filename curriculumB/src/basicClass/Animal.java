package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {

		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。

		Dog dog = new Dog();
		System.out.println(dog.name);

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dog1 = new Dog(3);
		System.out.println(dog1.num);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

		// 現在日時を取得
		LocalDateTime nowDate = LocalDateTime.now();
		//System.out.println(nowDate); //2020-12-20T13:32:48.293

		// 表示形式を指定
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s"); // ①
		String formatNowDate = dtf1.format(nowDate); // ②
		System.out.println(formatNowDate); // 2020/12/20 13:32:48.293

	}
}
