package question_1_28_29sub;

import java.util.Arrays;

public class Sub {

	private String str;

	private String order;

	// 指定された情報を格納する String 配列
	private String[] data = {
			"北海道:札幌市:83424",
			"青森県:青森市:9646",
			"岩手県:盛岡市:15275",
			"宮城県:仙台市:7282",
			"秋田県:秋田市:11638",
			"山形県:山形市:9323",
			"福島県:福島市:13784",
			"茨城県:水戸市:6097",
			"栃木県:宇都宮市:6408",
			"群馬県:前橋市:6362",
			"埼玉県:さいたま市:3798"
	};

	// コンストラクタ
	public Sub(String str) {

		this.str = str;

	}

	public Sub(String str, String order) {

		this.str = str;

		this.order = order;

	}

	public void show() {

	if(!this.str.matches("^[0-9]+(,[0-9]+)*$")) {
		
		return;
		
	}
		
		String[] input = str.split(",");

		int[] nums = new int[input.length];

		for (int i = 0; i < input.length; i++) {

			nums[i] = Integer.parseInt(input[i]);
		}

		

		if(order.equals("昇順")) {
			
			Arrays.sort(nums);
			
		}
		
		
		else if (order.equals("降順")) {

			Arrays.sort(nums);
			
			for (int i = 0; i < nums.length / 2; i++) { // 反転して降順に

				int temp = nums[i];

				nums[i] = nums[nums.length - 1 - i];

				nums[nums.length - 1 - i] = temp;
			}

		}else {
			
			return;
			
		}

		for (int i = 0; i < nums.length; i++) {

			showTodoufuken(nums[i]);

		}

	}

	private void showTodoufuken(int num) {

		String[] content = this.data[num].split(":");

		System.out.println("都道府県:" + content[0]);

		System.out.println("県庁所在地:" + content[1]);

		System.out.println("面積:" + Double.parseDouble(content[2]) + "km2");

		System.out.println();
	}

}
