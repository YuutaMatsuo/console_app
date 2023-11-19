
public class RockPaperScissors {
	public static void main(String[] args) {
		// 過去に作ったじゃんけんゲームを配列を使ってリファクタリング

		int player; // プレイヤーの手を保存する
		int cpu;	// コンピューター側の手を保存する
		String playerHand = ""; //グーチョキパーを文字列で保存するための変数
		String cpuHand = "";	//グーチョキパーを文字列で保存するための変数
		int gameContinue = 1; //ゲームを続けるかどうかの値を受け取る変数

		String[] hands = new String[] {"グー","チョキ","パー"};

		// 画面出力
		System.out.println("じゃんけんゲームへようこそ！");
		
		while (gameContinue == 1) {
			
			//グーチョキパーをランダムに生成cpuに代入
			cpu = new java.util.Random().nextInt(3)+1;

			System.out.println("コンソールを使ってグーチョキパーを選んでね！");
			System.out.println("\n1.グー\n2.チョキ\n3.パー");
			System.out.println("入力してEnterを押してください:");
			player = new java.util.Scanner(System.in).nextInt();
			
			//入力をグーチョキパーの文字に変換する
			playerHand = hands[player - 1];
			cpuHand = hands[cpu - 1]; 
			
			System.out.println("それじゃ、じゃんけんを始めるよ！！");
				try {// 1秒待機
					Thread.sleep(1 * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println("じゃーんけーん\n\n");
				try {// 2秒待機
					Thread.sleep(2 * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println("ぽん！\n\n");
			
			//じゃんけんの結果を処理
			int result = player - cpu;
			switch(result) {
			case -1:
			case 2:
				System.out.println("あなた:" + playerHand);
				System.out.println("コンピューター:" + cpuHand);
					try {
						Thread.sleep(1 * 1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				System.out.println("\nおめでとう！\nあなたの勝ちだね！");
				break;
			case 1:
			case -2:
				System.out.println("あなた:" + playerHand);
				System.out.println("コンピューター:" + cpuHand);
					try {
						Thread.sleep(1 * 1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				System.out.println("\nざんねん\nコンピュータの勝ちだね");
				break;
			case 0:
				System.out.println("あなた:" + playerHand);
				System.out.println("コンピューター:" + cpuHand);
				try {
					Thread.sleep(1 * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("\n引き分け！\nもう一回やってみてね！");
				break;
			}
			System.out.println("\nもう一回遊ぶ？\n1.つづける\n2.おわる");
			gameContinue = new java.util.Scanner(System.in).nextInt();
		}
		System.out.println("ゲームを終了します");
	}
}