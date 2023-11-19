
public class Main5 {
	public static void main(String[] args) {
		//変数設定
		String[] menu = {"ラーメン","そば","うどん","フォー"};
		int[] price = {800,600,500,400};
		int totalPrice = 0;
		int ans = 0;
		
		//ここからスタート
		System.out.println("いらっしゃいませ");
		do {
		int answer = ans();
		int count = count();
		System.out.println("▼選んだメニューと個数▼");
		System.out.println(menu[answer-1] + ":" + count + "個");
		System.out.println(price[answer-1] * count + "円");
		next();
		ans = new java.util.Scanner(System.in).nextInt();
		}while(ans != 2);
		
		//最終的な選択したメニューと個数を入れたい
		System.out.println("▼選んだメニューと個数▼");
		System.out.println("");
		//合計金額を入れたい
		System.out.println("合計金額は" + "円です");
		System.out.println("ありがとうございました");
	}
		//メニュー
		public static int ans() {
			String[] menu = {"ラーメン","そば","うどん","フォー"};
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
			System.out.println(answer + ":" + menu[answer-1] + "で、お間違えないですか？");
			System.out.println("1:はい　2:いいえ");
			ans = new java.util.Scanner(System.in).nextInt();
			}while(ans != 1);
			return answer;
		}
		
		//個数
		public static int count() {
			int counter = 0;
			int ans = 0;
			
			do {			
			System.out.println("個数を入力してください");
			counter = new java.util.Scanner(System.in).nextInt();
			System.out.println(counter + "個で、お間違えないですか？");
			System.out.println("1:はい　2:いいえ");
			ans = new java.util.Scanner(System.in).nextInt();
			}while(ans != 1);
			return counter;
		}
		
		//注文続ける？
		public static void next() {
			System.out.println("ご注文を続けますか？");
			System.out.println("1:続ける　2:終了");
		}
}