package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

	//読み込み処理
	public void fileRead() {
		try {
			File file = new File("c:\\tmp\\goal\\goal.txt");
			CheckFile cf = new CheckFile();

			if (cf.checkBeforeFile(file)){
				System.out.println("\n設定した目標\n");
				FileReader fr = new FileReader(file);
				//バッファにためておく
				BufferedReader br = new BufferedReader(fr);

				String line;
				//1行ずつ読み込む
				while((line = br.readLine()) != null) {
					//空白文字を区切り文字として目標とミリ秒をそれぞれ配列に格納
					String[] readLine = line.split("\s+");

					//書き込み時点の100日後のミリ秒をString型からlong型へ変換
					 long timeMillis100 = Long.parseLong(readLine[1]);
					 // 現在時刻のミリ秒
					 long currentTimeMillis = System.currentTimeMillis();
					 // 差分のミリ秒
					 long diff = timeMillis100 - currentTimeMillis;

				        // ミリ秒から秒へ変換
				        diff = diff / 1000;
				        // minutes
				        diff = diff / 60;
				        // hour
				        diff = diff / 60;
				        // day
				        diff = diff / 24;

				        if(diff >= 0) {
				        	System.out.print(readLine[0] + "\s" + "達成まであと" + diff +"日" + "\n");
				        }else {
				        	System.out.print(readLine[0] + "Complete!!" + "\n");
				        }
				}
				////ファイルを閉じる
				br.close();
			}else {
				System.out.println("ファイルが見つからないか開くことができません。");
			}
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
