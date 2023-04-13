
package antiSpamFilter;

import java.util.Arrays;
import java.util.List;

public class AntiSpamFilter {

	static Double threshold = 0.1;


	public static boolean isSpam(final String text) {
		final String words = text.toLowerCase().replaceAll("\\s+", " ");
		final String[] spam = AntiSpamFilter.getSpamTerms().toLowerCase().replaceAll("\\s+", " ").replaceAll(", ", ",").split(",");
		int count = 0;
		final List<String> word = Arrays.asList(words.split(" "));
		for (final String sp : spam)
			count += words.split(sp).length - 1;
		final double porcentajeSpam = count / (double) word.size();
		return porcentajeSpam > AntiSpamFilter.threshold;
	}

	private static String getSpamTerms() {
		return "sex, viagra, cialis, one million, you've won, nigeria, sexo, un millón, has ganado";
	}

}
