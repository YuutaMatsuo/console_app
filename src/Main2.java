
public class Main2 {

	public static void main(String[] args) {
		// じゃんけんゲームを行うプログラム
		// 変数の宣言
		int player; // プレイヤーの手を保存する
		int cpu;	// コンピューター側の手を保存する
		String playerHand = ""; //グーチョキパーを文字列で保存するための変数
		String cpuHand = "";	//グーチョキパーを文字列で保存するための変数

		// 最初のメッセージ
		System.out.println("じゃんけんゲームへようこそ！");

		// 繰り返し処理
		for (int i = 1; i == 1; i = new java.util.Scanner(System.in).nextInt()) {
			System.out.println("コンソールを使ってグーチョキパーを選んでね！");
			System.out.println(); // 空白行を出力する
			System.out.println("1.グー\n2.チョキ\n3.パー");
			System.out.println("入力してEnterを押してください:");
			
			//コンソールからの入力を受け取る
			player = new java.util.Scanner(System.in).nextInt();
			
			//入力されたコマンドをグーチョキパーの文字に変換する
			if(player == 1) {
				playerHand = "グー";
			}else if(player == 2) {
				playerHand = "チョキ";
			}else if(player == 3) {
				playerHand = "パー";
			}else {
				System.out.println("入力エラー");
			}

			System.out.println("それじゃ、じゃんけんを始めるよ！！");
			// 1秒待機
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("じゃーんけーん");
			
			System.out.println();
			System.out.println();

			// 2秒間待機
			try {
				Thread.sleep(2 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("ぽん！");
			
			System.out.println();
			System.out.println();
			

			
			//コンピューター側の手をランダムに抽選する
			cpu = new java.util.Random().nextInt(3)+1;
			
			//コマンドをグーチョキパーの文字に変換する
			if(cpu == 1) {
				cpuHand = "グー";
			}else if(cpu == 2) {
				cpuHand = "チョキ";
			}else if(cpu == 3) {
				cpuHand = "パー";
			}
			
			//じゃんけんの結果を処理
			
			if(player==1 &&  cpu==2 || player==2 && cpu==3 || player==3 && cpu==1){
				System.out.println("あなた:" + playerHand);
				System.out.println("コンピューター:" + cpuHand);
				System.out.println();
					try {
						Thread.sleep(1 * 1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				System.out.println("おめでとう！\nあなたの勝ちだね！");
				
			}else if(player==1 && cpu==3 || player==2 && cpu==1 || player==3 && cpu==2){
				System.out.println("あなた:" + playerHand);
				System.out.println("コンピューター:" + cpuHand);
				System.out.println();
					try {
						Thread.sleep(1 * 1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				System.out.println("ざんねん\nコンピュータの勝ちだね");
				
			}else if(player==1 && cpu==1 || player==2 && cpu==2 || player==3 && cpu==3){
				System.out.println("あなた:" + playerHand);
				System.out.println("コンピューター:" + cpuHand);
				System.out.println();
				try {
					Thread.sleep(1 * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("引き分け！\nもう一回やってみてね！");
			}
			
			//続けてプレイするか確認する
			System.out.println();
			System.out.println("もう一回遊ぶ？\n1.つづける\n2.おわる");
		}
		System.out.println("ゲームを終了します");
	}

}
