package model;

import java.io.File;
import java.util.Scanner;

public class SetGoal {

	public static void main(String[] args) {

		System.out.println("100日後に〇〇になるアプリ");

		MakeFile makeFile = new MakeFile();
		GoalReception gr = new GoalReception();
		Writer writer = new Writer();
		Reader reader = new Reader();
		File file = new File("c:\\tmp\\goal\\goal.txt");
		Count100 c100 = new Count100();

		//テキストファイルの作成
		//既にあった場合はなにもしない
		makeFile.makeFile();

		//goal.txtが存在し、目標が既に書き込まれていれば読み込み表示する
		boolean empty = file.exists() && file.length() == 0;
		if(empty == false) {
			reader.fileRead();
		}else {
			//カウントダウン(日数）
			long timeMillis100 = c100.count();
			//受け付けた目標をgoal.txtに書き込む
			writer.fileWrite(gr.set(),timeMillis100);
		}
		System.out.println("\n目標を追加するならSキーを入力してください。");
		boolean judge = true;
		Scanner scan = new Scanner(System.in);



		while(judge) {

			//入力を受け付ける
			String pulusGoal = scan.nextLine();

			switch(pulusGoal){

			case "S":
			case "s":
			case "Ｓ":
			case "ｓ":
				long timeMillis100s = c100.count();
				writer.fileWrite(gr.set(),timeMillis100s);
				reader.fileRead();

				System.out.println("\n続けて追加するならSキーを、追加終了するならEキーを入力してください。");
				break;
			case "E":
			case "e":
			case "Ｅ":
			case "ｅ":
				judge = false;
				System.out.println("アプリを終了します。");
				break;
			default:
				System.out.println("入力したキーが正しくありません。\n続けて追加するならSキーを、追加終了するならEキーを入力してください。");
			}
		}
		//Scannerクラスを閉じる
		scan.close();

	}
}
