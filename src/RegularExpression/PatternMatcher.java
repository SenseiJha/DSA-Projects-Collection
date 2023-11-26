package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
	
	public PatternMatcher() {
		
	}

	public static void main(String[] args) {
	    Pattern pattern = Pattern.compile("a", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("Is it Bananagrams or Banana Grams?");
	    
	    int iresult = 0;
	    while (matcher.find()) {
	      iresult++;
	    }
	    System.out.println(iresult);
	    
	    String sresult = matcher.replaceAll("YEET");
	    System.out.println(sresult);
	  }
}