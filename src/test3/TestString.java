package test3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString {
	public static void main(String[] args) {		
		String s="\\d+";
		Pattern pattern=Pattern.compile(s);
		Matcher matcher=pattern.matcher("2.2");
		if (matcher.matches()) {
			System.out.println("整数");
		}
		else {
			System.out.println("小数");
		}
	}
}
