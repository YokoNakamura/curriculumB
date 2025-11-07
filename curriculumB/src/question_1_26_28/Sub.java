package question_1_26_28;

public class Sub {

	private String str;

	// コンストラクタ
	public Sub(String str) {

		this.str = str;

	}

	public void show() {

		String[] data = str.split(",");

		for (int i = 0; i < data.length; i++) {

			String[] element = data[i].split(":");

			System.out.println("動物名:" + element[0]);

			System.out.println("体長:" + element[1] + "m");

			System.out.println("速度:" + element[2] + "km/h");

			System.out.println("学名:" + this.getLatinName(element[0]));

			System.out.println();
		}

	}

	private String getLatinName(String name) {

		switch (name) {

		case "ライオン":

			return "パンテラ レオ";

		case "ゾウ":

			return "ロキソドンタ・サイクロティス";

		case "パンダ":

			return "アイルロポダ・メラノレウカ";

		case "チンパンジー":

			return "パン・トゥログロディテス";

		case "シマウマ":

			return "チャップマンシマウマ";

		default:

			return "不明";

		}
	}
}
