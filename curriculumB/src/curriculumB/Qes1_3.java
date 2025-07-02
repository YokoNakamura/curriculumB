package curriculumB;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/***********************************************
		問 1.ログイン時の入力チェックシステムを下記条件で作成してください
									
		 ・コンソールにユーザー名を入力できるようにしてください								
		 ・ユーザー名の文字数が10文字より大きい場合
		 「名前を10文字以内にしてください」と出力してください								
		 ・ユーザー名の文字数が0文字以下もしくはnullの場合
		 「名前を入力してください」と出力してください								
		 ・ユーザー名が正常な値だった場合
		 「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		
		 問 2.ユーザー名が半角英数字以外の場合
		 「半角英数字のみで名前を入力してください」と出力してください
		
		***********************************************/

		try (Scanner scanner = new Scanner(System.in);) { // 入力用オブジェクト作成

			String username = "";

			System.out.println("ユーザー名を入力してください："); // メッセージ表示

			while (true) {

				System.out.println();

				username = scanner.nextLine(); // ユーザー名の入力取得

				/* ユーザー名の文字数が0文字以下もしくはnullの場合
				 *「名前を入力してください」と出力
				 */

				if (username == null || username.length() == 0) {

					System.out.println("「名前を入力してください」");

				}

				/*ユーザー名が半角英数字以外の場合
				 *「半角英数字のみで名前を入力してください」と出力
				 */

				else if (!username.matches("^[a-zA-Z0-9]+$")) {

					System.out.println("「半角英数字のみで名前を入力してください」");

				}

				/* ユーザー名の文字数が10文字より大きい場合
				 *「名前を10文字以内にしてください」と出力
				 */

				//文字の長さチェック

				else if (username.length() > 10) {

					System.out.println("「名前を10文字以内にしてください」");

				}

				/* ユーザー名が正常な値だった場合
				 *「ユーザー名「 入力したユーザー名 」を登録しました」と出力
				 */

				else {

					System.out.println("ユーザー名「" + username + "」を登録しました");
					break;
				}
			}

			/***********************************************
			
			問3.じゃんけんのシステムを下記の条件で作成してください	
			 ・「0はグー、1：チョキ、2：パー」とすること	
			 ・じゃんけんに勝つまでループすること	
			 ・一回ごとに自分の手と相手の手を下記の通り出力してください	
			 	ユーザー名「name」を登録しました
			 	nameの手は「パー」
			 	相手の手は「グー」
			
			***********************************************/

			/*
			 *・「0はグー、1：チョキ、2：パー」とすること
			 */

			String[] hands = { "「グー」", "「チョキ」", "「パー」" };

			Random rand = new Random(); // ランダムな数字を生成する

			int num = 0; // num=0

			while (true) { // 条件はtrueになるまで繰り返す

				num++; // numは1ずつ増える

				int myHand = rand.nextInt(3); // myHandの手は3まで

				System.out.println(username + "の手は" + hands[myHand]); // useernameの手を出力

				int yourHand = rand.nextInt(3); // yourHandの手は3まで 

				System.out.println("相手の手は" + hands[yourHand]); // yourHandの手を出力

				System.out.println(); // 改行

				if (myHand == yourHand) { // myHandとyourHandがあいこの場合

					System.out.println("DRAW あいこ もう一回しましょう！");

				} else if (myHand == 1 && yourHand == 0) { // myHandがチョキで負けの場合

					System.out.println("俺の勝ち！");

					System.out.println("負けは次につながるチャンスです！");

					System.out.println("ネバーギブアップ！");

				} else if (myHand == 2 && yourHand == 1) { // myHandがパーで負けの場合

					System.out.println("俺の勝ち！");

					System.out.println("たかがじゃんけん、そう思ってないですか？");

					System.out.println("それやったら次も、俺が勝ちますよ");

				} else if (myHand == 0 && yourHand == 2) { // myHandがグーで負けの場合

					System.out.println("俺の勝ち！");

					System.out.println("なんで負けたか、明日まで考えといてください。");

					System.out.println("そしたら何かが見えてくるはずです");

				} else { // myHandが勝ちの場合

					//if((myHand==0&&yourHand==1)||(myHand==1&&yourHand==2)||(myHand==2&&yourHand==0))

					System.out.println("やるやん。");

					System.out.println("次は俺にリベンジさせて");

					System.out.println();

					System.out.println("勝つまでにかかった合計回数は" + num + "回です"); // 勝つまでにかかった回数を出力される

					break;

				}

				System.out.println();
			}

		}

	}
}
