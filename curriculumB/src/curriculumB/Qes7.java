package curriculumB;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try (Scanner scanner = new Scanner(System.in);) {

			System.out.println("生徒の人数を入力してください（2以上）:"); //生徒の人数を入力する

			int students = scanner.nextInt(); //生徒の人数を読み出す

			int[][] score = new int[students][4];

			for (int i = 1; i <= students; i++) { //iが生徒の人数まで1ずつ増える

				System.out.println(i + "人目の『英語』の点数を入力してください :");

				score[i - 1][0] = scanner.nextInt(); //英語の点数を入力する

				System.out.println(i + "人目の『数学』の点数を入力してください :");

				score[i - 1][1] = scanner.nextInt(); //数学の点数を入力する

				System.out.println(i + "人目の『理科』の点数を入力してください :");

				score[i - 1][2] = scanner.nextInt(); //理科の点数を入力する

				System.out.println(i + "人目の『社会』の点数を入力してください :");

				score[i - 1][3] = scanner.nextInt(); //社会の点数を入力する

			}

			for (int i = 1; i <= students; i++) { //iが生徒の人数まで1ずつ増える

				double total = score[i - 1][0] + score[i - 1][1] + score[i - 1][2] + score[i - 1][3]; //1人あたりの合計点

				double average = total / 4; //1人あたりの平均点の計算式

				//double average = score[i-1][0]+score[i-1][1]+score[i-1][2]+score[i-1][3]/4;

				System.out.println(i + "人目の平均点は" + String.format("%.2f", average) + "点です。");

			}

			System.out.println();

			String[] subjects = { "英語", "数学", "理科", "社会" }; //科目を順に配列する

			double total = 0; //1人あたりの合計点が0

			double goukei = 0;//全科目の合計点が0

			for (int f = 1; f <= 4; f++) { //fが4まで1ずつ増える

				for (int i = 1; i <= students; i++) //iが生徒の人数まで1ずつ増える

					total += score[i - 1][f - 1]; //iが生徒の人数まで1ずつ増えた各科目の合計点

				double average = total / students; //各科目ごとの平均点の計算式

				total = 0; //1人あたりの合計点が0

				goukei += average; //全科目の合計点は各科目ごとの平均点を足した数

				System.out.println(subjects[f - 1] + "の平均点は" + String.format("%.2f", average) + "点です。");

			}

			double average = goukei / subjects.length; //全体の平均点の計算式

			System.out.println("全体の平均点は" + String.format("%.2f", average) + "点です。");

		}
	}
}
