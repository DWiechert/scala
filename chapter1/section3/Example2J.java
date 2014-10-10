package chapter1.section3;

public class Example2J {
	public static void main(final String... args) {
		boolean wordHasUpperCase = false;
		final String word = "somethingthathasAnuppercase";
		for (int i = 0; i < word.length(); ++i) {
			if (Character.isUpperCase(word.charAt(i))) {
				wordHasUpperCase = true;
				break;
			}
		}

		System.out.println(wordHasUpperCase);
	}
}
