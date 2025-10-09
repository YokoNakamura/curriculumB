package question_1_25sub;

import java.util.Random;

//Student.java

public class Hero extends Person {
	// 独自の属性
	private int hp;
	private int mp;
	private int sp;
	private int at;
	private int df;

	public Hero() {
		// super()でスーパークラスのコンストラクタを呼び出す
		super();
		Random rand = new Random();

		this.hp = rand.nextInt(1000);
		this.mp = rand.nextInt(1000);
		this.sp = rand.nextInt(1000);
		this.at = rand.nextInt(1000);
		this.df = rand.nextInt(1000);

	}

	// コンストラクタ
	public Hero(String name) {
		// super()でスーパークラスのコンストラクタを呼び出す
		super(name);

	}

	public String getName() {
		return name;
	}

	// nameを設定するためのセッターメソッド
	public void setName(String name) {
		this.name = name;
	}
	// 独自のメソッド

	public void showStatus() {
		System.out.println("ステータス");
		System.out.println("HP:" + this.hp);
		System.out.println("MP:" + this.mp);
		System.out.println("攻撃力:" + this.sp);
		System.out.println("素早さ:" + this.at);
		System.out.println("防御力:" + this.df);

	}

	public void introduce() {
		System.out.println("さあ冒険に出かけよう！");
	}
}
