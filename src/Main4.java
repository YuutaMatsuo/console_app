
public class Main4 {

	public static void main(String[] args) {
		int set = 20; //ユーザーからの入力を受けつける
		int i = 0; //0秒を指定
		
		System.out.println("タイマースタート");
		while(i != set) {
			//1秒待機
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			set -= 1;
			
			//10秒以下かを判定
			if(set <= 10) {
				System.out.println(set + "秒前");
			}
		}
	}

}
