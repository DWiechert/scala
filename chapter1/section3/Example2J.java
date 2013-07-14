package chapter1.section3;

public class Example2J {
	public static void main(String... args) {
		boolean wordHasUpperCase = false;
		String word = "somethingthathasAnuppercase";
		for (int i = 0; i < word.length(); ++i) {
			if (Character.isUpperCase(word.charAt(i))) {
				wordHasUpperCase = true;
				break;
			}
		}
		
		System.out.println(wordHasUpperCase);
	}
}
