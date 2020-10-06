package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAndRead {

	//書き込み処理
	public void fileWrite(String goal) {
		try{
			File file = new File("c:\\tmp\\goal\\goal.txt");

			if (checkBeforeFile(file)){
				FileWriter fw = new FileWriter(file,true);
				//バッファにためておく
				BufferedWriter bw = new BufferedWriter(fw);

				bw.write(goal);
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

	//読み込み処理
	public void fileRead() {
		try {
			File file = new File("c:\\tmp\\goal\\goal.txt");

			if (checkBeforeFile(file)){
				System.out.println("\n設定した目標\n");
				FileReader fr = new FileReader(file);
				//バッファにためておく
				BufferedReader br = new BufferedReader(fr);

				//1文字ずつ文字コードとして読み込み、文字コードから文字へ変換
				//ファイルの最後に到達すると-1を返すので、-1が返ると繰り返し処理を抜ける
				int ch;
				while((ch = br.read()) != -1) {
					System.out.print((char)ch);
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

	//ファイルが存在し、ディレクトリではない事を確認し、そして書き込みor読み込みが許可されているかを事前に確認
	private static boolean checkBeforeFile(File file) {
		if(file.exists()) {
			if(file.isFile() && file.canWrite() && file.canRead()) {
				return true;
			}
		}
		System.out.println("ファイルが存在しません");
		return false;
	}
}
