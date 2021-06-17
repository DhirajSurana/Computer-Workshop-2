package extra;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String regex = "[a-zA-z0-9\\.]+@[a-z]+[\\.[a-z]{2,3}]+";
		Pattern p = Pattern.compile(regex);
		File f = new File("C://Users//DHIRAJ//Desktop//a.txt");
		Scanner sc = new Scanner(f);
		sc.useDelimiter(",");
		while (sc.hasNextLine()) {
			Matcher m = p.matcher(sc.next());
			if (m.matches()) {
				System.out.println(m.group());
			}
		}

		sc.close();

	}

}
