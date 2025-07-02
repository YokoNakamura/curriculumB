package curriculumB;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*
		 * *for文を使用して下記の通りに出力してください
		 *
		 */

		for (int a = 1; a <= 9; a++) { // aが1から9まで1ずつ繰り返し増える

			for (int b = 1; b <= 9; b++) { // bが1から9まで1ずつ繰り返し増える

				if (b == 9) { // bが9のときにループを終了する

					System.out.print(" " + String.format("%02d", a) + " * " + String.format("%02d", b) + " = "
							+ String.format("%02d", a * b) + " ");

				} else {

					System.out.print(" " + String.format("%02d", a) + " * " + String.format("%02d", b) + " = "
							+ String.format("%02d", a * b) + " " + "||");

				}

			}

			System.out.println();

		}
	}
}
