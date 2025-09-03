package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	
	public String name; // フィールド
	
	// Q2：フィールドに動物の数の変数を定義してください。
	
	public int num; // フィールド
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	
	public Dog() { // コンストラクタ
		this.name = "犬";
	}	
	
	
	public Dog(int num) { // コンストラクタ
		this.num = num;
	}
	
	
}