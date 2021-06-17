package extra;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("C://Users//Dhiraj//Desktop", "FileWriterDemo.txt");
		FileWriter fw = new FileWriter(f);
		// String regex = "[a-zA-Z0-9//.]+@[a-z]+[//.[a-z]{2,3}]+";
		fw.flush();
		fw.close();

	}

}
