package console_app;

public class Main3 {

	public static void main(String[] args) {
		// 10進数を2進数に変換する問題を出してくれるプログラム

		// 変数宣言
		int game; // ゲームを始めるかやめるかの２択を格納する変数
		int number; // 10進数を数値を格納する変数
		int binary; // コンソールからの入力を受け取る変数
		int score = 0; // 合計のスコアを格納する変数

		// ゲームの説明を表示させる
		System.out.println("このゲームは10進数で表示される数値を2進数に変換して、その正解率を競うゲームだよ！");
		// 1秒待機
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("正解したら+10ポイント、間違えると-10ポイント！問題は全部で5問出題されるよ！\n");
		// 1秒待機
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("それじゃ、準備はいいかな？\n１，ゲームを始める\n２．やっぱりやめる");

		game = new java.util.Scanner(System.in).nextInt();
		switch (game) {
		case 1:
			for (int i = 1; i <= 5; i++) {
				System.out.println("これから表示される数字を2進数に変換してね");
				// 1秒待機
				try {
					Thread.sleep(1 * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// 1~16までの10進数の数値をランダムに生成し画面に出力
				System.out.println(); // 改行を行う
				number = new java.util.Random().nextInt(16) + 1;
				System.out.println("------");
				System.out.println("  " + number + "  ");
				System.out.println("------");

				// コンソールからの入力を受け付ける
				System.out.println(number + "を2進数に変換してコンソールに入力してね！");
				binary = new java.util.Scanner(System.in).nextInt();

				// 入力された値が正しいか判定
				if (binary == Integer.parseInt(Integer.toBinaryString(number))) {
					System.out.println("正解\n+10ポイント獲得");
					score += 10;
				} else {
					System.out.println("残念\n-10ポイント");
					score -= 10;
				}
			}
			break;
		}

		// ゲームを終了する処理
		System.out.println("ゲーム終了！得点を集計するよ！");
		// 3秒待機
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("得点は:" + score + "ポイント！");
	}

}
