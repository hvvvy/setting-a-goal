package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	//書き込み処理
	public void fileWrite(String goal,long timeMillis100) {
		try{
			File file = new File("c:\\tmp\\goal\\goal.txt");
			CheckFile cf = new CheckFile();

			if (cf.checkBeforeFile(file)){
				FileWriter fw = new FileWriter(file,true);
				//バッファにためておく
				BufferedWriter bw = new BufferedWriter(fw);
				//目標と\sと書き込み処理時のミリ秒をファイルに記入
				bw.write(goal + "\s" + timeMillis100);
				//改行処理
				bw.newLine();
				//ファイルにデータを出力する流れを閉じる
				bw.close();
			}else{
				System.out.println("ファイルに書き込めません");
			}
		}catch(FileNotFoundException e){
			System.out.println("ファイルが見つからないか既に開かれています。閉じてもう1度やり直してください。");
		}catch(IOException e){
			System.out.println(e);
		}
	}


}
