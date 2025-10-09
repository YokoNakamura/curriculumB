package question_1_25sub;

import java.util.Random;

//Student.java 

public class Hero extends Person {
	// 独自の属性
	private int hp;
	private int mp;
	private int speed;
	private int attack;
	private int defence;

	public Hero() {
		// super()でスーパークラスのコンストラクタを呼び出す
		super();
		Random rand = new Random();

		this.hp = rand.nextInt(100,1000);
		this.mp = rand.nextInt(100,1000);
		this.speed = rand.nextInt(100,1000);
		this.attack = rand.nextInt(100,1000);
		this.defence = rand.nextInt(10,500);
		

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
		System.out.println("攻撃力:" + this.speed);
		System.out.println("素早さ:" + this.attack);
		System.out.println("防御力:" + this.defence);

	}

	public void introduce() {
		System.out.println("さあ冒険に出かけよう！");
	}
}
