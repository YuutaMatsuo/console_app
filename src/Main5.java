
public class Main5 {
	public static void main(String[] args) {
		// 変数設定
		String[] menu = { "ラーメン", "そば", "うどん", "フォー" };
		int[] price = { 800, 600, 500, 400 };
		int[] totalCount = new int[menu.length];
		int totalPrice = 0;
		int ans = 0;
		int answer;
		int count;

		// ここからスタート
		System.out.println("いらっしゃいませ");
		do {
			answer = ans();
			count = count();
			System.out.println("▼選んだメニューと個数▼");
			System.out.println(menu[answer - 1] + ":" + count + "個");
			System.out.println(price[answer - 1] * count + "円");
			totalPrice += totalPrice(price, answer, count);
			totalCount[answer - 1] += count;
			next();
			ans = new java.util.Scanner(System.in).nextInt();
		} while (ans != 2);

		// 最終的な選択したメニューと個数を入れたい
		System.out.println(totalCount(menu, totalCount));
		// 合計金額を入れたい
		System.out.println("合計金額は" + totalPrice + "円です");
		System.out.println("ありがとうございました");
	}

	// メニュー
	public static int ans() {
		String[] menu = { "ラーメン", "そば", "うどん", "フォー" };
		int answer = 0;
		int ans = 0;

		do {
			System.out.println("メニューを選択してください");
			System.out.println("-----メニュー-----");
			System.out.println("1:" + menu[0]);
			System.out.println("2:" + menu[1]);
			System.out.println("3:" + menu[2]);
			System.out.println("4:" + menu[3]);
			System.out.println("------------------");
			System.out.println("注文番号を選んでください");
			answer = new java.util.Scanner(System.in).nextInt();
			System.out.println(answer + ":" + menu[answer - 1] + "で、お間違えないですか？");
			System.out.println("1:はい　2:いいえ");
			ans = new java.util.Scanner(System.in).nextInt();
		} while (ans != 1);
		return answer;
	}

	// 個数
	public static int count() {
		int counter = 0;
		int ans = 0;

		do {
			System.out.println("個数を入力してください");
			counter = new java.util.Scanner(System.in).nextInt();
			System.out.println(counter + "個で、お間違えないですか？");
			System.out.println("1:はい　2:いいえ");
			ans = new java.util.Scanner(System.in).nextInt();
		} while (ans != 1);
		return counter;
	}

	// 合計金額
	public static int totalPrice(int[] price, int ans, int count) {
		int totalPrice = price[ans - 1] * count;
		return totalPrice;
	}

	// 選択したメニュー一覧
	public static String totalCount(String[] menu, int[] totalCount) {
		String ans = "▼選んだメニューと個数▼";
		for (int i = 0; i < totalCount.length; i++) {
			if (0 < totalCount[i]) {
				ans += "\n" + menu[i] + ":" + totalCount[i] + "個";
			}
		}
		return ans;
	}

	// 注文続ける？
	public static void next() {
		System.out.println("ご注文を続けますか？");
		System.out.println("1:続ける　2:終了");
	}
}