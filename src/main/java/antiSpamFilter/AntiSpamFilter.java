
package antiSpamFilter;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AntiSpamFilter {

	protected Double	threshold;

	protected String	spam;


	public AntiSpamFilter(final Double threshold, final String spam) {
		this.threshold = threshold;
		this.spam = spam;
	}

	public boolean isSpam(final String text) {
		final String words = text.toLowerCase().replaceAll("\\s+", " ");
		final String[] spam = this.spam.toLowerCase().replaceAll("\\s+", " ").replaceAll(", ", ",").split(",");
		int count = 0;
		final List<String> word = Arrays.asList(words.split(" "));
		for (final String sp : spam)
			count += words.split(sp).length - 1;
		final double porcentajeSpam = count / (double) word.size();
		return porcentajeSpam > this.threshold;
	}

}
