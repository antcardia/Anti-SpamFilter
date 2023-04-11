
package antiSpamFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AntiSpamFilter {

	static String	spam;
	static Double	threshold	= 0.1;


	public static boolean isSpam(final String text) {
		final String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"); // Removes punctuation and special characters and divides into words
		int count = 0;
		for (final String word : words)
			if (AntiSpamFilter.getSpamTerms().contains(word))
				count++;
		final double umbral = (double) count / (double) words.length;
		return umbral > AntiSpamFilter.threshold;

	}

	private static List<String> getSpamTerms() {
		final List<String> res = new ArrayList<>();
		res.addAll(Arrays.asList("sex", "viagra", "cialis", "one million", "you've won", "nigeria", "sexo", "un millón", "has ganado"));
		return res;
	}

}
