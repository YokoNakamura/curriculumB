package question_1_23;

public class Main {

	public static void main(String[] args) {
		/*
		
		下記がコンソールに出力されるように作成してください
		※thisとsetterとgetterとフィールドを使ってください
		
		動物名：ライオン
		体長：2.1m
		速度：80km/h
		
		*/

		Animal lion = new Animal();

		//lion.name = "ライオン";

		lion.setName("ライオン");

		System.out.println("動物名：" + lion.getName());

		lion.setLength(2.1);

		System.out.println("体長：" + lion.getLength() + "m");

		lion.setSpeed(80);

		System.out.println("速度：" + lion.getSpeed() + "km/h");
		
	}
}
