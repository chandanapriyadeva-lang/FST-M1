package activities3rdDec;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class Activity14 {
	public static void main(String[] args) throws IOException {
		try {
		File file = new File("src/main/resources/tmp.txt");
		boolean fStatus = file.createNewFile();
		if(fStatus) {
			FileUtils.writeStringToFile(file, "Hello,Welcome!",Charset.defaultCharset());
		}
		else {
			System.out.println("File already exist");
		}
		 System.out.println("Data in file: " + FileUtils.readFileToString(file, "UTF8"));
		 File destDir = new File("src/main/resources/destDir");
		 FileUtils.copyFileToDirectory(file, destDir);
		 File newFile = FileUtils.getFile(destDir, "temp.txt");
		 String newFileData = FileUtils.readFileToString(newFile, "UTF8");
		 System.out.println("Data in new file: " + newFileData);
		}catch (IOException e) {
			System.out.println(e);
		}
	}

}