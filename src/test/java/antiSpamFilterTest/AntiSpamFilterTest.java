
package antiSpamFilterTest;

import antiSpamFilter.AntiSpamFilter;

public class AntiSpamFilterTest {

	public static void isSpamTest() {
		final String text1 = "Hola, ¿qué tal estás?";
		final String text2 = "Nigeria Nigeria Nigeria Nigeria Nigeria nigeria NIGERIA NIGERIA";
		final String text3 = "Sexo sex sexo sexo sex sex en Nigeria nigeria NIGERIA nigeria";
		final String text4 = "¡Vaya, has ganado un millón un millón un millón un millón un millón!";
		if (AntiSpamFilter.isSpam(text1))
			System.out.println("El texto " + text1 + " es spam");
		else
			System.out.println("El texto " + text1 + " no es spam");
		if (AntiSpamFilter.isSpam(text2))
			System.out.println("El texto " + text2 + " es spam");
		else
			System.out.println("El texto " + text2 + " no es spam");
		if (AntiSpamFilter.isSpam(text3))
			System.out.println("El texto " + text3 + " es spam");
		else
			System.out.println("El texto " + text3 + " no es spam");
		if (AntiSpamFilter.isSpam(text4))
			System.out.println("El texto " + text4 + " es spam");
		else
			System.out.println("El texto " + text4 + " no es spam");
	}

	public static void main(final String[] args) {
		AntiSpamFilterTest.isSpamTest();

	}

}
