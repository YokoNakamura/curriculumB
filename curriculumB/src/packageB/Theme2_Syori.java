package packageB;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Theme2_Syori {

	public String country;

	public String food;

	public String foodCategory;

	public Theme2_Syori(String country, String food, String foodCategory) {
		this.country = country;
		this.food = food;
		this.foodCategory = foodCategory;
	}

	public void greet() {
		System.out.println("こんにちは！ここは" + country + "です！");
		System.out.println("この" + food + "はうまい");
		System.out.println(food + "は" + foodCategory + "です");

	}

	public void showTime() {
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

		// 現在日時を取得
		LocalDateTime nowDate = LocalDateTime.now();
		//System.out.println(nowDate); //2020-12-20T13:32:48.293

		// 表示形式を指定
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s"); // ①
		String formatNowDate = dtf1.format(nowDate); // ②
		System.out.println("今の現在日時は" + formatNowDate + "です");
	}
}
