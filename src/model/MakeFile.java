package model;

import java.io.File;
import java.io.IOException;

public class MakeFile {

	public void makeFile(){

		File file = new File("c:\\tmp\\goal\\goal.txt");
		//goal.txtの存在を確認
		//既にあった場合はなにもしない
		if(file.exists() == false) {

		//C:直下にtmpがなければtempフォルダを作成し、その中にgoalフォルダも作成
		File newdir = new File("C:\\tmp\\goal");
		if(newdir.mkdirs()) {
			System.out.println("tmpフォルダがなかったのでgoalフォルダとともに作成しました。");
		}else {
			//tmpフォルダがあればその中にgoalフォルダを作成
			newdir.mkdir();
			System.out.println("tmpフォルダがあったのでその中にgoalフォルダを作成しました。");
		}
		//goalにgoal.txtを作成
		File newfile = new File("C:\\tmp\\goal\\goal.txt");
			try {
				newfile.createNewFile();
			}catch(IOException e){
				System.out.println(e);
			}
		}
	}
}
