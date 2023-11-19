
public class LogicalOperations {
	public static void main(String[] args) {
		//真理値表と論理演算を覚えるプログラム
		String[] str = {"0 0 0\n0 1 1\n1 0 1\n1 1 1","0 0 0\n0 1 0\n1 0 0\n1 1 1","0 1\n1 0","0 0 1\n0 1 0\n1 0 0\n1 1 0","0 0 1\n0 1 1\n1 0 1\n1 1 0","0 0 0\n0 1 1\n1 0 1\n1 1 0"};
		int random;
		int ans;
		
		System.out.println("論理演算当てゲーム");
		System.out.println("\n問題は全部で１０問出題されます。\n出力される真理値表をもとに正しい論理演算を選んでください");
		System.out.println("\nEnterを押すとゲームスタート");
		new java.util.Scanner(System.in).nextLine();
		for(int i = 0;i < 10; i++) {
			//問題の出力
			random = new java.util.Random().nextInt(6)+1;
			System.out.println("\n\n画面に表示される真理値表から、対応する論理演算を選んでください");
			System.out.println("\n真理値表\nA B F");
			System.out.println(str[random-1]);
			
			System.out.println("解答を１～６の番号から選んでください\n１．論理和(OR)\n２．論理積(AND)\n３．否定(NOT)\n４。否定論理和(NOR)\n５．否定論理積(NAND)\n６．排他的論理和(XOR,EOR)");
			ans = new java.util.Scanner(System.in).nextInt();
			switch(random) {
			case 1:
				if(ans == 1) {
					System.out.println("\n正解");
				}else {
					System.out.println("\n残念");
				}
				break;
			case 2:
				if(ans == 2) {
					System.out.println("\n正解");
				}else {
					System.out.println("\n残念");
				}
				break;
			case 3:
				if(ans == 3) {
					System.out.println("\n正解");
				}else {
					System.out.println("\n残念");
				}
				break;
			case 4:
				if(ans == 4) {
					System.out.println("\n正解");
				}else {
					System.out.println("\n残念");
				}
				break;
			case 5:
				if(ans == 5) {
					System.out.println("\n正解");
				}else {
					System.out.println("\n残念");
				}
				break;
			case 6:
				if(ans == 6) {
					System.out.println("\n正解");
				}else {
					System.out.println("\n残念");
				}
				break;
			}
			
		}
	}
}
