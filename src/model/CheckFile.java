package model;

import java.io.File;

public class CheckFile {

	//ファイルが存在し、ディレクトリではない事を確認し、そして書き込みor読み込みが許可されているかを事前に確認
		public boolean checkBeforeFile(File file) {
			if(file.exists()) {
				if(file.isFile() && file.canWrite() && file.canRead()) {
					return true;
				}
			}
			System.out.println("ファイルが存在しません");
			return false;
		}
}
