package extra;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
	static String regex;

	Regular(String r) {
		Regular.regex = r;
	}

	public static boolean validate(Iterator<Object> i) {
		String s = i.toString();
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		return m.matches();

	}

}
