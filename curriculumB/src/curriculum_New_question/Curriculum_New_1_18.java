package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {

	/*問1：引数に文字列型と整数型をいれてコンソールに
	 *「Hello JavaSE 11」と出力するメソッドを作成してください。
	 */

	public static void printMessage(String text, int number) {

		//引数に文字列と整数型の値を入れる

		System.out.println("「" + text + number + "」");

		//「Hello JavaSE 11」と出力する
	}

	/*
	 *問2：引数に整数を渡すと渡した値同士を乗算し
	 *コンソールに出力するメソッドを作成してください。
	 */

	public static void multiplyAndPrint(int a, int b) {

		//引数に整数を渡す

		System.out.println("掛け算の結果: " + (a * b));

		//整数aと整数bを乗算して出力する

	}

	/*
	 *問3：引数として整数の配列を渡すと、受け取った値を
	 *順番にコンソールに出力するメソッドを作成してください。
	 */

	public static void printArray(int[] numbers) {

		//引数として整数の配列を渡す

		System.out.println("配列の中身:");

		for (int num : numbers)

			System.out.println(num);

		//整数の配列の中身を順番に出力する

	}

	/*
	 *問4：問2をオーバーロードして引数を小数2つに変更し、
	 *引数同士を和算しコンソールに出力してください。
	 */

	public static void multiplyAndPrint(double a, double b) {

		//引数に整数を渡す	

		System.out.println("小数の和: " + (a + b));

		//小数aと小数bを加算して出力する

	}

	/*
	 *問5：引数に整数を渡すと、1～100までのランダムな数字を
	 *引数の回数分格納して格納した値を順番にコンソールで
	 *出力後、格納した値を返すメソッドを作成してください。
	 *※0は出力＆格納しないようにしてください。
	 */

	public static int[] generateRandomNumbers(int count) {

		int[] nums = new int[count];

		Random rand = new Random();//ランダムな数を生成

		for (int i = 0; i < count; i++) {

			int randomNum = rand.nextInt(100) + 1;

			nums[i] = randomNum;

			System.out.println(randomNum);

		}

		return nums;

	}

	/*問6：引数に問5で作成した
	 * メソッドの返り値を受け取り、
	 * 受け取った配列の要素の平均値をコンソールに
	 * 出力するメソッドを作成してください。
	 *※小数点以下も表示されるようにしてください。
	 */

	public static double ReturnValueAverage(int[] nums) {

		int sum = 0;

		//for (int num : nums) {

			//sum += num;
		//}
		
		for(int i=0;i<nums.length;i++)
		{sum+=nums[i];}

		double average = (double) sum / nums.length;

		System.out.println("平均値: " + average);

		return average;

	}

	// 


	/*問7：引数に問6で作成したメソッドの返り値を受け取り、
	 * 受け取った値が50以上ならばtrueそれ以外はfalseを返し
	 * コンソールに出力してください
	 */

	public static boolean judgeDouble(double d) {

		if (d >= 50) {
			return true;
		} else {
			return false;
		}
	}

	// mainメソッドで呼び出し
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		printMessage("Hello JavaSE ", 11);

		multiplyAndPrint(5, 6);

		int[] nums = { 1, 3, 5, 7, 9 };
		printArray(nums);

		multiplyAndPrint(1.2, 1.5);

		int[] nums2 = generateRandomNumbers(4);

		double num3 = ReturnValueAverage(nums2);

		System.out.println(judgeDouble(num3));

	}

}
