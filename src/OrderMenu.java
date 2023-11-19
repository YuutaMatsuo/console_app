
public class OrderMenu {
	public static void main(String[] args) {
		// コンソールからの入力で、メニューと個数を選択肢、合計金額を計算するプログラムです
		
		// メニューを設定
		String[] menus = { "ラーメン", "うどん", "そば", "フォー" };
		int[] prices = { 500, 600, 350, 200 };
		// 変数を宣言
		int selectMenu; // 選択されたメニュー番号を受け取る変数
		int selectQuantity; // 注文個数を受け取る変数
		int maxOrder = 10; // 1回に注文できる最大個数
		int totalPrice = 0; // 合計金額を格納する変数
		int order = 1; // 注文を続けるか入力を受け取る変数
		String cart = "-----------------\n"; // 注文された商品の一覧を入れる変数

		// ここから処理
		System.out.println("いらっしゃいませ");
		//orderが１の間繰り返す
		do {
			// メニューの一覧を表示
			menuShow(menus, prices);
			// メニュー番号を選択 (範囲外の値が入力された場合は戻り値として0が格納される）
			do {
				selectMenu = inputValidate(menus.length, "メニューの番号を選んでEnterを押してください");
			} while (selectMenu == 0);
			// 選択されたメニュー名と価格を表示
			menuShow(menus, prices, selectMenu);
			// 注文個数を選択 (範囲外の値が入力された場合は戻り値として0が格納される）
			do {
				selectQuantity = inputValidate(maxOrder, "注文個数を選んでEnterを押してください");
			} while (selectQuantity == 0);
			// 合計金額を計算する
			totalPrice += totalPrice(prices, totalPrice, selectMenu, selectQuantity);
			// 注文内容をカートに保存する
			cart += menus[selectMenu - 1] + " " + selectQuantity + "杯" + prices[selectMenu - 1] * selectQuantity + "円\n";
			System.out.println(cart);
			System.out.println("現在のお会計額は:" + totalPrice + "円です\n");
			// 注文を続けるかどうか確認する (範囲外の値が入力された場合は戻り値として0が格納される）
			do {
				order = inputValidate(2, "ご注文を続けますか？\n1.注文を続ける 2.注文を終る");
			} while (order == 0);
		} while (order == 1);

		System.out.println("\n\nレシート\n" + cart);
		System.out.println("お会計は" + totalPrice + "円です");
		System.out.println("ご利用ありがとうございました");
	}

	// コンソールからの入力を受け取り値が1以上・引数で指定された数値以下かチェックする。それ以外の値が入力されたらエラーとして０を返す。
	public static int inputValidate(int maxNumber, String msg) {
		System.out.println(msg);
		int error = 0;
		int selectNumber = new java.util.Scanner(System.in).nextInt();
		if (selectNumber <= maxNumber && selectNumber > 0) {
			return selectNumber;
		} else {
			System.out.println("入力に誤りがあります");
			return error;
		}
	}

	// 引数として渡されたメニュー配列と金額配列の中身をすべて出力する
	public static void menuShow(String[] menus, int[] prices) {
		System.out.println("-----メニュー-----");
		for (int i = 0; i < menus.length; i++) {
			System.out.println(i + 1 + ":" + menus[i] + " " + prices[i] + "円");
		}
		System.out.println("------------------");
	}

	// 引数として渡されたメニュー配列と金額配列のから、選択されたメニューを出力する（オーバーロード）
	public static void menuShow(String[] menus, int[] prices, int selectMenu) {
		System.out.println(menus[selectMenu - 1] + "の金額は" + prices[selectMenu - 1] + "円です");
	}

	// 選択されたメニューと個数を計算し合計金額を戻り値として返す
	public static int totalPrice(int[] prices, int totalPrice, int selectMenu, int selectQuantity) {
		totalPrice = prices[selectMenu - 1] * selectQuantity;
		return totalPrice;
	}
}
