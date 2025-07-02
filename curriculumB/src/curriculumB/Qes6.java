package curriculumB;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try (Scanner scanner = new Scanner(System.in);) { // 入力用オブジェクト作成

			String[] products = scanner.nextLine().split("、"); // 商品名を「、」で区切る

			Random rand = new Random(); // ランダムな数字を生成する
			int AStock = rand.nextInt(12); // Astockの在庫数は11までの数
			int BStock = 11 - AStock; // Bstockの在庫数はAstockの引いた数

			for (String str : products) { //(データ型文字列: 商品名)

				int randomCount = rand.nextInt(12); // 0から11までの数字をランダムに代入する

				switch (str) {
				case "パソコン": // パソコンの場合

				case "冷蔵庫": // 冷蔵庫の場合

				case "扇風機": // 扇風機の場合

				case "洗濯機": // 洗濯機の場合

				case "加湿器": // 加湿器の場合

					System.out.println(str + "の残り台数は" + randomCount + "台です\n");

					break;

				case "テレビ": // テレビの場合

				case "ディスプレイ": // ディスプレイの場合

					int result = str.equals("テレビ") ? AStock : BStock; //テレビとディスプレイの台数は合わせて11

					System.out.println(str + "の残り台数は" + result + "台です\n");
					// 

					break;

				default:

					System.out.println("「" + str + "」" + "は指定の商品ではありません");

					break;
				}

			}
		}

	}
}
