
public class Main {
	public static void main(String[] args) {
		// コンソールからの入力で、メニューと個数を選択肢、合計金額を計算するプログラムです

		// 変数の宣言
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int totalPrice = 0; // 合計の価格を入れる変数
		String cart = "-----------------\n注文一覧\n"; // 注文された商品の一覧を入れる変数
		int order = 1;
		int n;

		// メニューを設定
		String menu1 = "１．ラーメン";
		String menu2 = "２．うどん";
		String menu3 = "３．そば";
		String menu4 = "４．フォー";

		// ここから処理
		System.out.println("いらっしゃいませ");
		

		// 繰り返し処理スタート orderが１の間処理を続ける
		while (order == 1) {

			// メニューを表示
			System.out.println("-----メニュー-----");
			System.out.println(menu1);
			System.out.println(menu2);
			System.out.println(menu3);
			System.out.println(menu4);
			System.out.println("------------------");
			System.out.println("注文番号を選んでください");

			// コンソールから入力を受け付け変数ansに格納する
//			int ans = new java.util.Scanner(System.in).nextInt();	
			
			//エラーが起きない書き方
//            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int ans = scanner.nextInt();
//            scanner.close();

			// 条件分岐 変数ansの値に応じて分岐する
			switch (ans) {
			case 1: // もしansの値が１だったら
				System.out.println("ラーメンの金額は500円です");
				System.out.println("個数を選んでください");
				n = new java.util.Scanner(System.in).nextInt();
				totalPrice += 500 * n; // 変数totalPriceに商品の金額と個数を掛けた合計の価格を代入
				cart += "ラーメン　" + n + "杯" + 500 * n + "円\n";
				System.out.println(cart);
				System.out.println("現在のお会計額は:" + totalPrice + "円です");
				System.out.println("ご注文を続けますか？");
				System.out.println("1.注文を続ける 2.注文を終る");
				break;

			case 2: // もしansの値が2だったら
				System.out.println("うどんの金額は600円です");
				System.out.println("個数を選んでください");
				n = new java.util.Scanner(System.in).nextInt();
				totalPrice += 600 * n; // 変数totalPriceに商品の金額と個数を掛けた合計の価格を代入
				cart += "うどん　" + n + "杯" + 600 * n + "円\n";
				System.out.println(cart);
				System.out.println("現在のお会計額は:" + totalPrice + "円です");
				System.out.println("ご注文を続けますか？");
				System.out.println("1.注文を続ける 2.注文を終る");
				break;

			case 3: // もしansの値が3だったら
				System.out.println("そばの金額は350円です");
				System.out.println("個数を選んでください");
				n = new java.util.Scanner(System.in).nextInt();
				totalPrice += 350 * n; // 変数totalPriceに商品の金額と個数を掛けた合計の価格を代入
				cart += "そば　" + n + "杯" + 350 * n + "円\n";
				System.out.println(cart);
				System.out.println("現在のお会計額は:" + totalPrice + "円です");
				System.out.println("ご注文を続けますか？");
				System.out.println("1.注文を続ける 2.注文を終る");
				break;

			case 4: // もしansの値が4だったら
				System.out.println("フォーの金額は200円です");
				System.out.println("個数を選んでください");
				n = new java.util.Scanner(System.in).nextInt();
				totalPrice += 200 * n; // 変数totalPriceに商品の金額と個数を掛けた合計の価格を代入
				cart += "フォー　" + n + "杯" + 200 * n + "円\n";
				System.out.println(cart);
				System.out.println("現在のお会計額は:" + totalPrice + "円です");
				System.out.println("ご注文を続けますか？");
				System.out.println("1.注文を続ける 2.注文を終る");
				break;

			default: // 入力された値がどれでも無かったら
				System.out.println("エラー");
				System.out.println("ご注文を続けますか？");
				System.out.println("1.注文を続ける 2.注文を終る");
				break;
			}
			order = new java.util.Scanner(System.in).nextInt();
		}

		System.out.println("\n\nレシート\n" + cart);
		System.out.println("お会計は" + totalPrice + "円です");
		System.out.println("ご利用ありがとうございました");
		
		scanner.close();
	}
}