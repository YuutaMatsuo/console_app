
public class Main3 {

	public static void main(String[] args) {
		// 10進数を2進数に変換する問題を出してくれるプログラム

		// 変数宣言
		int game; // ゲームを始めるかやめるかの２択を格納する変数
		int number; // 10進数を数値を格納する変数
		int binary; // コンソールからの入力を受け取る変数
		int point = 0; // 合計の得点を格納する変数
		String score; //クリアタイムに応じてスコアを格納する変数
		long startTime = 0L; //開始時間を計測する変数
		long stopTime = 0L;	//終了時間を計測する変数
		long totalTime = 0L; //クリアタイムを格納する変数

		// ゲームの説明を表示させる
		System.out.println("このゲームは画面に出力される10進数の数を2進数に変換するスピードと正確さを競うゲームだよ");
			try { // 1秒待機
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("正解したら+20ポイント、間違えると0ポイント！問題は全部で5問出題されるよ！\n");
			try { // 1秒待機
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("それじゃ、準備はいいかな？\n１，ゲームを始める\n２．やっぱりやめる");
		
		// メニューの番号をコンソール入力から受け取る
		game = new java.util.Scanner(System.in).nextInt();
		
		//時間の計測を開始
		startTime = System.currentTimeMillis();
		
		switch (game) {
		case 1:
			for (int i = 1; i <= 5; i++) {
				System.out.println("これから表示される数字を2進数に変換してね");
					try { // 1秒待機
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
					System.out.println("正解\n+20ポイント獲得");
					point += 20;
				} else {
					System.out.println("残念\n0ポイント");
				}
			}
			break;
			
			default:
				// 1秒待機
				try {
					Thread.sleep(1 * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
				System.out.println("ゲームを中止します");
		}
		//時間の計測を終了
		stopTime =  System.currentTimeMillis();
		//経過時間を計算
		totalTime = ((stopTime - startTime) / 1000);
		
		//スコアを計算
		if(totalTime <= 20 && point == 100) {
			score = "S";
		}else if(totalTime <= 25 && point >= 80) {
			score = "A";
		}else if(totalTime <= 35 && point >= 60) {
			score = "B";
		}else {
			score = "C";
		}
				
		//結果を出力する
		System.out.println("\n\n終了！得点を集計するよ！");
			try { // 2秒待機
				Thread.sleep(2 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("\nクリアタイムは" + totalTime + "秒");
			try { // 1秒待機
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("得点は:" + point + "ポイント！");
			try { // 1秒待機
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("\n\n--スコア--\n    " + score + "\n----------");
			try { // 1秒待機
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		
		// ゲームを終了する処理
		System.out.println("\nゲームを終了します！");
	}

}
