
package antiSpamFilterTest;

import antiSpamFilter.AntiSpamFilter;

public class AntiSpamFilterTest {

	public void isSpamTest() {
		final AntiSpamFilter spam = new AntiSpamFilter(0.1, "sex, viagra, cialis, one million, you've won, nigeria, sexo, un millón, has ganado");
		spam.setSpam("sex, viagra, cialis, one million, you've won, nigeria, sexo, un millón, has ganado");
		final String text1 = "Hola, ¿qué tal estás?";
		final String text2 = "NIGERIA NIGERIA";
		final String text3 = "Hola que tal, me gusta mucho el sexo nocturno";
		final String text4 = "¡Vaya, YOU'VE WON!";
		if (spam.isSpam(text1))
			System.out.println("El texto " + text1 + " es spam");
		else
			System.out.println("El texto " + text1 + " no es spam");
		if (spam.isSpam(text2))
			System.out.println("El texto " + text2 + " es spam");
		else
			System.out.println("El texto " + text2 + " no es spam");
		if (spam.isSpam(text3))
			System.out.println("El texto " + text3 + " es spam");
		else
			System.out.println("El texto " + text3 + " no es spam");
		if (spam.isSpam(text4))
			System.out.println("El texto " + text4 + " es spam");
		else
			System.out.println("El texto " + text4 + " no es spam");
	}

	public static void main(final String[] args) {
		final AntiSpamFilterTest antiSpamFilterTest = new AntiSpamFilterTest();
		antiSpamFilterTest.isSpamTest();

	}

}
