package curriculumB;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * *for文を使用して下記の通りに出力してください
		 *
		 */

		for (int c = 1; c <= 9; c++) { // cが1から9まで1ずつ繰り返し増える

			for (int d = 1; d <= 20; d++) { // dが1から20まで1ずつ繰り返し増える

				if (d == 20) { // dが20のときにループを終了する

					System.out.print(" " + String.format("%03d", d) + " * " + String.format("%03d", c) + " = "
							+ String.format("%03d", d * c) + " ");

				} else {

					System.out.print(" " + String.format("%03d", d) + " * " + String.format("%03d", c) + " = "
							+ String.format("%03d", d * c) + " " + "||");

				}

			}

			System.out.println();

		}
	}

}
